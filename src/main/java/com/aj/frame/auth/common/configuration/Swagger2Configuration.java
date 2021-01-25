package com.aj.frame.auth.common.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;


// EnableSwagger2 Profile注解要都加在这里才能生效
// EnableSwagger2加到启动类无效，任何环境都会启用
@EnableSwagger2
@Profile({"dev", "test", "local"})
@Configuration
public class Swagger2Configuration {

    @Value("${swagger.system-name}")
    private String systemName;

    @Value("${swagger.version-no}")
    private String version;

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                // 接口分组名称
                .groupName(systemName)
                // ...
                .select()
                // 扫描的包路径
                .apis(RequestHandlerSelectors.basePackage("com.aj.frame.entertainment.controller"))
                // 定义要生成文档的Api的url路径规则
                .paths(PathSelectors.any()).build().securitySchemes(securitySchemes())
                .securityContexts(securityContexts())
                // 设置swagger-ui.html页面上的一些元素信息。
                .apiInfo(apiInfo(systemName + "接口文档", systemName, version));
    }

    private ApiInfo apiInfo(String title, String description, String version) {
        return new ApiInfoBuilder()
                // 标题
                .title(title)
                // 描述
                .description(description)
                // 文档版本
                .version(version).license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0").build();
    }

    private List<ApiKey> securitySchemes() {
        List<ApiKey> list = new ArrayList<ApiKey>();
        list.add(new ApiKey("Authorization", "Authorization", "header"));
        return list;
    }

    private List<SecurityContext> securityContexts() {
        List<SecurityContext> list = new ArrayList<SecurityContext>();
        list.add(SecurityContext.builder().securityReferences(defaultAuth())
                .forPaths(PathSelectors.regex("^(?!auth).*$")).build());
        return list;
    }

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;

        List<SecurityReference> list = new ArrayList<SecurityReference>();
        list.add(new SecurityReference("Authorization", authorizationScopes));
        return list;
    }

}
