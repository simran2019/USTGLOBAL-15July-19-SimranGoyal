package com.ustg.ustspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustg.springcore.config.BeanConfig;
import com.ustg.ustspringcore.beans.Animal;
import com.ustg.ustspringcore.beans.HelloWorld;

public class AnnotationConfigApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		HelloWorld obj = context.getBean(HelloWorld.class);
		System.out.println("get message:" + obj.getMsg());
		System.out.println("get count:" + obj.getCount());
		System.out.println(obj.getMap());

		// for autowire
		obj.getAnimal().makeSound();

		// for scope

		Animal animal1 =  (Animal)context.getBean("dog");
		Animal animal2 = (Animal)context.getBean("dog");
		System.out.println(animal1 == animal2);

		context.close();
	}

}
