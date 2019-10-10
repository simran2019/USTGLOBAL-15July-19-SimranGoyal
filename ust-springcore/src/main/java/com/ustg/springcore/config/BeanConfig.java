package com.ustg.springcore.config;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustg.ustspringcore.beans.Animal;
import com.ustg.ustspringcore.beans.Dog;
import com.ustg.ustspringcore.beans.HelloWorld;
import com.ustg.ustspringcore.beans.Humans;

@Configuration
public class BeanConfig {

	@Bean(name = "obj") // name not mandatory but a good practice
	public HelloWorld getHelloWorld() {
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMsg("hello world!!!!!!!");
		helloWorld.setCount(10000);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("xyz", 890);
		helloWorld.setMap(map);
		// helloWorld.setAnimal(getDog()); // line no 25,26 is same as this line
		/*
		 * Animal animal = getDog(); 
		 * helloWorld.setAnimal(animal);
		 */
		return helloWorld;
	}// end of spring factory method

	@Bean(name = "dog")
	@Scope("prototype")
	public Dog getDog() {
		return new Dog();
	}// end of get dog

	@Bean(name = "human")
	public Humans getHumans() {
		return new Humans();
	}//end of get human

}
