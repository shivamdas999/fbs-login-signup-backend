package com.spring.jwt.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@EnableFeignClients(basePackages = "com.*")
@SpringBootApplication
public class SpringSecurityJwtMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtMongodbApplication.class, args);
	}
	
	
//@Bean
//public WebMvcConfigurer() {
//	return new WebMvcConfigurer() {
//		@Override
//		public void addCorsMappings(CorsRegistry registry) {
//			registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET","PUT","POST","PATCH","DELETE","OPTIONS");
//			
//		}
//		
//	};	
//	
//}

}