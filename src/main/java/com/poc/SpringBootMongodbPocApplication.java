package com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootMongodbPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbPocApplication.class, args);
	}

	/**
	 * http://localhost:8085/spring-boot-mongodb/swagger-ui.html
	 * (server.contextPath=/spring-boot-mongodb)
	 * 
	 * @return
	 */
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.pathMapping("/");
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("ThingWorx Extension POC")
				.description("ThingWorx Extension POC for PTC")
				.build();
	}
}
