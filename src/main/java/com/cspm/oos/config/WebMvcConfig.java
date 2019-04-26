package com.cspm.oos.config;

import com.cspm.oos.constant.Constant;
import com.cspm.oos.util.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.MultipartConfigElement;
import java.io.File;

/**
 * MWC配置
 * Created by CHQIU on 2017-07-31.
 *
 * @author chqiu
 */
@Configuration
@Slf4j
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 加载配置文件
     *
     * @return
     */
    @Bean
    public OfficeOnlineServerProperties properties() {
        return new OfficeOnlineServerProperties();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 自定义文件静态资源目录为本机其他位置，也可以为JAR包的相对路径
        String resourcePath = String.format("file:///%s/resource/", Constant.LOCAL_RESOURCE_PATH);
        //设置静态资源
        registry.addResourceHandler("/static/**", "/resource/**").
                addResourceLocations("classpath:/static/", "classpath:/resource/");
        super.addResourceHandlers(registry);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //设置首页地址
        registry.addViewController("/").setViewName("forward:/static/demo.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    /**
     * 文件上传下载配置
     *
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        String localResourcePath = properties().getLocalResourcePath();
        if (localResourcePath == null) {
            localResourcePath = SpringContextUtil.getBasePath();
        } else if (localResourcePath.startsWith("\\\\")) {
            localResourcePath = localResourcePath;
        } else if (!localResourcePath.contains(":")) {
            localResourcePath = SpringContextUtil.getBasePath() + localResourcePath;
        }
        // 将绝对路径存储到公用变量中
        Constant.LOCAL_RESOURCE_PATH = localResourcePath;
        properties().setLocalResourcePath(localResourcePath);
        // 文件暂存地址 处理 The temporary upload location [] is not valid 错误问题
        String multipartCache = String.format("%s%s%scache", File.separator, Constant.LOCAL_RESOURCE_PATH, File.separator);
        File file = new File(multipartCache);
        file.setWritable(true, false);
        if (!file.exists()) {
            file.mkdirs();
        }
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setLocation(multipartCache);
        // 单个文件最大 KB,MB
        factory.setMaxFileSize("512MB");
        // 设置总上传数据总大小
        factory.setMaxRequestSize("1024MB");
        return factory.createMultipartConfig();
    }

    /**
     * Spring bean 反射
     *
     * @return
     */
    @Bean
    public SpringContextUtil springContextUtil() {
        return new SpringContextUtil();
    }
}
