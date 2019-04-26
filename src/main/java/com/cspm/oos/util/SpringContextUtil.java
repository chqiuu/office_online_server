package com.cspm.oos.util;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

/**
 * 静态获取Bean
 *
 * @author chqiu
 */
@Component
@Scope("singleton")
public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    /**
     * 实现
     *
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        SpringContextUtil.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static Object getBean(String name) throws BeansException {
        try {
            return applicationContext.getBean(name);
        } catch (Exception e) {
            throw new RuntimeException("获取的Bean不存在！");
        }
    }

    public static <T> T getBean(String name, Class<T> requiredType)
            throws BeansException {
        return applicationContext.getBean(name, requiredType);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> className) throws BeansException {
        return (T) applicationContext.getBean(className);
    }

    public static boolean containsBean(String name) {
        return applicationContext.containsBean(name);
    }

    public static boolean isSingleton(String name)
            throws NoSuchBeanDefinitionException {
        return applicationContext.isSingleton(name);
    }

    public static Class<? extends Object> getType(String name)
            throws NoSuchBeanDefinitionException {
        return applicationContext.getType(name);
    }

    public static String[] getAliases(String name)
            throws NoSuchBeanDefinitionException {
        return applicationContext.getAliases(name);
    }

    /**
     * 得到项目的根目录的绝对路径
     *
     * @return 项目的根目录的绝对路径
     * @author CHENQUAN
     * @date 2018年7月17日
     */
    public static String getBasePath() {
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
                basePath = basePath.replace("/ems-boot/target/classes/", "/");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return basePath;
    }

}
