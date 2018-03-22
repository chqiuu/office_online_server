package com.cspm.oos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * 启动程序
 *
 * @author CHENQUAN
 * @date 2018年3月21日
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@ComponentScan("com.cspm.oos")
public class OfficeOnlineServerApplication extends WebMvcConfigurerAdapter {
    public static void main(String[] args) {
        SpringApplication.run(OfficeOnlineServerApplication.class, args);
    }
}
