package com.cspm.oos.config;

import com.cspm.oos.constant.Constant;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

/**
 * 系统自定义变量
 *
 * @author chqiu
 */
@Component
@ConfigurationProperties(prefix = "oos")
public class OfficeOnlineServerProperties {
    /**
     * 是否启用API接口
     * swagger-enable
     */
    private boolean swaggerEnable = false;
    /**
     * 本机静态资源根路径，默认文件JAR包相对路径
     * local-resource-path
     */
    private String localResourcePath;
    /**
     * OOS在线预览服务器地址
     * oos-url
     */
    private String oosUrl;

    /**
     * 获取 swaggerEnable
     *
     * @return swaggerEnable
     */
    public boolean getSwaggerEnable() {
        return swaggerEnable;
    }

    /**
     * 设置 swaggerEnable
     *
     * @param swaggerEnable swaggerEnable
     */
    public void setSwaggerEnable(boolean swaggerEnable) {
        this.swaggerEnable = swaggerEnable;
    }

    /**
     * 获取 localResourcePath
     *
     * @return localResourcePath
     */
    public String getLocalResourcePath() {
        return localResourcePath;
    }

    /**
     * 设置 localResourcePath
     *
     * @param localResourcePath localResourcePath
     */
    public void setLocalResourcePath(String localResourcePath) {
        this.localResourcePath = localResourcePath;
    }

    /**
     * 获取 oosUrl
     *
     * @return oosUrl
     */
    public String getOosUrl() {
        return oosUrl;
    }

    /**
     * 设置 oosUrl
     *
     * @param oosUrl oosUrl
     */
    public void setOosUrl(String oosUrl) {
        this.oosUrl = oosUrl;
    }

    /**
     * 构造函数
     */
    public OfficeOnlineServerProperties() {
        if (localResourcePath == null) {
            this.localResourcePath = getBasePath();
        } else if (!localResourcePath.contains(":")) {
            this.localResourcePath = getBasePath() + localResourcePath;
        }
        // 将绝对路径存储到公用变量中
        Constant.LOCAL_RESOURCE_PATH = this.localResourcePath;
    }

    /**
     * 得到项目的根目录的绝对路径
     *
     * @return 项目的根目录的绝对路径
     * @author CHENQUAN
     * @date 2018年7月17日
     */
    private String getBasePath() {
        URL baseURL = ClassUtils.getDefaultClassLoader().getResource("");
        String basePath = baseURL.getPath();
        try {
            basePath = URLDecoder.decode(basePath, "utf-8");
            if (basePath.indexOf("/") == 0) {
                basePath = basePath.substring(1);
            }
            if (basePath.contains("!/BOOT-INF/classes!/")) {
                basePath = basePath.replace("!/BOOT-INF/classes!/", "").replace("file:/", "");
                basePath = basePath.substring(0, basePath.lastIndexOf("/") + 1);
            } else {
                basePath = basePath.replace("/erp-boot/target/classes/", "/");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return basePath;
    }
}
