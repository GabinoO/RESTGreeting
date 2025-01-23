package com.example.FirstProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);

	}

	@Bean
	public CommandLineRunner myCommand(ApplicationContext ctx) {
		return (args) -> {
			System.out.println("Inspecting Spring Boot Beans: ");
			String[] beanTitles = ctx.getBeanDefinitionNames();
			for (int i = 0; i < beanTitles.length; ++i) {
				System.out.println(beanTitles[i]);
			}
		};
	}


}
