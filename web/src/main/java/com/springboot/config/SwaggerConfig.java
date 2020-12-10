package com.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @author Mugua
 * @Configuration 告诉 Spring Boot 需要加载这个配置类
 * @EnableSwagger2 是启用 Swagger2
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.springboot.controller"))
//                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());

    }
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Spring Boot 项目集成 Swagger 实例文档",
                "我的网站：https://file.sady.vip，欢迎大家访问。",
                "API V1.0",
                "Terms of service",
                new Contact("名字想好没", "https://file.sady.vip", "thsware2020@gmail.com"),
                "Apache", "http://www.apache.org/", Collections.emptyList());
    }
}