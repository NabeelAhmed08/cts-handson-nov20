package com.app.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootUnitIntegrationTestingApplicationTests {
	
	@Autowired
	private HelloController controller;

	@Test
	public void testControllerInstance() {
		assertThat(controller).isNotNull();
	}
}