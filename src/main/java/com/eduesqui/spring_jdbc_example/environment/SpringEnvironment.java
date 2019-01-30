package com.eduesqui.spring_jdbc_example.environment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringEnvironment {

	
	public static ClassPathXmlApplicationContext context;
	
	static{
		context =  new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
}
