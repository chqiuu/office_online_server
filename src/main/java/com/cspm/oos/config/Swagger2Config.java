package com.cspm.oos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2 前端API配置
 * Created by CHQIU on 2017-07-31.
 *
 * @author chqiu
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    private final OfficeOnlineServerProperties properties;

    @Autowired
    public Swagger2Config(OfficeOnlineServerProperties properties) {
        this.properties = properties;
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(properties.getSwaggerEnable())
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cspm.oos"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("代码生成工具 API")
                .description("代码生成工具 API接口")
                .termsOfServiceUrl("127.0.0.1")
                .contact(new Contact("chqiuu", "http://www.apache.org", "chqiuu@qq.com"))
                .version("1.0.0").license("Apache 2.0").licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .build();
    }
}
