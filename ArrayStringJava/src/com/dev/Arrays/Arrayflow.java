package com.dev.Arrays;

public class Arrayflow {

	public static void main(String[] args) {
		
		int [] sim = {1,2,3,4,5,6,7,8,9};
		
		
	int i = 4;
	int j ;
		
		if(i<sim.length ) {
			System.out.println("index is present in the array");
			for(j = 0;j<=i;j++) {
				System.out.println(sim[j]);
			}
		}else {
			System.out.println("index is not present in the array");
		}
		

		
		
		int x = sim.length;
		int y = (x-1)/2;
		System.out.println("length of an array = "+x);
		System.out.println("value of middle index = "+y);
		
		
		if(i == y) {
			System.out.println("it is a middle index and its value is = "+sim[i]);
			
		}else {
			System.out.println("not a middle index");
		}
		
	}

}
