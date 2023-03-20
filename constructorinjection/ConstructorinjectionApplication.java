package com.inject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inject.entity.Trainer;

@SpringBootApplication
public class ConstructorinjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstructorinjectionApplication.class, args);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Trainer trainer=(Trainer)context.getBean("trainer");
		System.out.println(trainer);
	}

}
