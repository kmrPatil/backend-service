package com.kumar.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BackendAppsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendAppsApplication.class, args);
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.any())
				.build()
				.apiInfo(metaData());
	}
	
	private ApiInfo metaData() {
		
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title("Spring Boot Rest API")
				.description("Spring Boot REST API for Online Store")
				.version("1.0")
				.termsOfServiceUrl("Tearm Of Service")
				.contact(new Contact("Kumar Patil", "Coming Soon", "kmrpatil323@gmail.com"))
				.build();
		
		return apiInfo;
	
	}

}
