package com.ustg.ustspringcore.beans;

import org.springframework.stereotype.Component;

@Component("human")
public class Humans implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Blah Blah Blah ......");
		
	}

}
