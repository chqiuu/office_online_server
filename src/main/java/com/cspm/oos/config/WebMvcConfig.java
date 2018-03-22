package com.cspm.oos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * MWC配置
 * Created by CHQIU on 2017-07-31.
 *
 * @author chqiu
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
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


}
