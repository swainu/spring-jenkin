package com.spring.jenkin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinApplicationTests {

	Logger logger = LoggerFactory.getLogger(SpringJenkinApplicationTests.class);

	@Test
	 contextLoads() {
		logger.info("Test Executed....");
		logger.info("Test Executed....second");
		assertEquals(true, true);
	}

}
