
package com.dev.collections;

import java.util.HashMap;

import com.dev.Encapsulation.Dog;

public class DogImp implements DogInterface {

	HashMap<String ,Dog> hm = new HashMap<String ,Dog>();

	@Override
	public boolean putDog(String s , Dog dog) {
		if(dog !=null) {
			hm.put(s,dog);
			return true;
		}else {
		return false;
		}
	}

	@Override
	public void getDog() {
		System.out.println(hm);
		
	}



	


				
	}


