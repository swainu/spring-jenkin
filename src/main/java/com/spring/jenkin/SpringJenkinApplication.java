package com.spring.jenkin;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinApplication {

	static Logger logger = LoggerFactory.getLogger(SpringJenkinApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application started.....");

	}

	public static void main(String[] args) {

		logger.info("Application Executed");
		SpringApplication.run(SpringJenkinApplication.class, args);
	}

}
