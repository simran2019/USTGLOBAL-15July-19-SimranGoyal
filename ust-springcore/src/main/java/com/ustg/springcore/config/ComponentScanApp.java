package com.ustg.springcore.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustg.ustspringcore.beans.HelloWorld;

public class ComponentScanApp {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	HelloWorld obj = context.getBean(HelloWorld.class);
	obj.getAnimal().makeSound();

	}

}
