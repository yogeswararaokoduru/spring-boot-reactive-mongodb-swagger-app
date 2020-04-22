package com.org.shyam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableReactiveMongoRepositories
public class SpringbootmongoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootmongoApplication.class, args);
	}

}
