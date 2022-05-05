package com.hexagonal.architecture.cat.api.infra.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.servers.ServerVariable;
import io.swagger.v3.oas.models.servers.ServerVariables;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    @Bean
    public GroupedOpenApi version1OpenApi() {
        String paths[] = {"/**/architecture.cat.api.adapter/**"};
        String packagesToscan[] = {"com.hexagonal.architecture.cat.api.adapter.rest.controller"};
        return GroupedOpenApi.builder().group("v1 - Cat").pathsToMatch(paths).packagesToScan(packagesToscan)
                .build();
    }

    @Bean
    public Docket sales() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hexagonal.architecture.cat.api.adapter.rest.controller"))
                .paths(PathSelectors.any())
                .build()
                .consumes(new HashSet<>(Arrays.asList("application/json")))
                .produces(new HashSet<>(Arrays.asList("application/json")))
                .pathMapping("/docs");
    }

    @Bean
    OpenAPI desktopSalesOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Cat API")
                        .version("v1")
                        .description("Case The Cat API")
                        .contact(new Contact().name("Tiago Marinho").email("tiagomarinho84@outlook.com"))
                ).addServersItem(new Server().url("http://localhost:8080").description("local")
                        .variables(new ServerVariables()
                                .addServerVariable("protocol",
                                        new ServerVariable().addEnumItem("http").addEnumItem("https")._default("http"))
                        ));
    }

    @Bean
    UiConfiguration uiConfig() {
        return UiConfigurationBuilder.builder()
                .deepLinking(true)
                .displayOperationId(false)
                .defaultModelsExpandDepth(1)
                .defaultModelExpandDepth(1)
                .defaultModelRendering(ModelRendering.EXAMPLE)
                .displayRequestDuration(false)
                .docExpansion(DocExpansion.NONE)
                .filter(false)
                .maxDisplayedTags(null)
                .operationsSorter(OperationsSorter.ALPHA)
                .showExtensions(false)
                .showCommonExtensions(false)
                .tagsSorter(TagsSorter.ALPHA)
                .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
                .validatorUrl(null)
                .build();
    }
}

