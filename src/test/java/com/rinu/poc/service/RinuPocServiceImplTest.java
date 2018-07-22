package com.rinu.poc.service;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rinu.poc.Application;

/**
 * @author rinu.thomas
 * @date Jul 22, 2018
 * @filename BaleServiceImplTest.java
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Application.class })
//@TestPropertySource(locations = "classpath:application-test.properties")
public class RinuPocServiceImplTest {

	

	@Test
	public void test() {
		String test = "test";
		Assert.assertEquals(test, "test");
	}

}
