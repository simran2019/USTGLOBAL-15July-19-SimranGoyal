package com.dev.methods;

public class BasicOperation {

	static BasicOperation bo = new BasicOperation();
	
	// addition
	
	public int basic(int i , int y) {
		int res = i+y;
		System.out.println("result of addition 2 digits"+res);
		return res;
	}
	public int basic(int i , int y , int z) {
		int res = i+y+z;
		System.out.println("result of addition 3 digits"+res);
		return res;
	}
	public int basic(int i , int y , int z , int x) {
		int res = i+y+z+x;
		System.out.println("result of addition 4 digits"+res);
		return res;
	}
	
// subtraction
	public double basic(double j , int x) {
		double res = j-x;
		System.out.println(res);
		return res;
	}
	public double basic(double j , int x , int y) {
		double res = j-x-y;
		System.out.println(res);
		return res;
	}
	public double basic(double j , int x , double y , int z) {
		double res = j-x-y-z;
		System.out.println(res);
		return res;
	}
	
	// multplication
	
	public double basic( int x,double j ) {
		double res = x*j;
		System.out.println(res);
		return res;
	}
	public double basic( int x,double j ,int y) {
		double res = x*j*y;
		System.out.println(res);
		return res;
	}
	public double basic( int x,double j ,int y ,int k ) {
		double res = x*j*y*k;
		System.out.println(res);
		return res;
	}
	
	// divide 
	
	public double basic(float x,int j ) {
		double res = x/j;
		System.out.println(res);
		return res;
	}
	public double basic(float x,int j ,int y) {
		double res = x/j/y;
		System.out.println(res);
		return res;
	}
	public double basic(float x,int j ,int y ,int z) {
		double res = (x/j)*(y/z);
		System.out.println(res);
		return res;
	}


	
	
	public static void main(String[] args) {
		
		int ch = 0;
		System.out.println("for addition enter 2 ,3,4 integer value ch = 0,1,2");
		System.out.println("for subtraction enter double,int;double,int,int;double,int,int,int valve ch = 3,4,5");
		System.out.println("for multiplication enter int,double;int,double,int;int,double,int,int value ch = 6,7,8,9");
		
		
		switch(ch) {
		
		case 0:
			bo.basic(10, 5);
			break;
		case 1:
			bo.basic(10, 5 , 3);
			break;
		case 2:
			bo.basic(10, 5,6,8);
			break;
		case 3:
			bo.basic(10.98, 5);
			break;
		case 4:
			bo.basic(10.98, 5 ,8);
			break;
		case 5:
			bo.basic(10.98, 5, 0.98,1);
			break;
		case 6:
			bo.basic(5, 0.2);
			break;
		case 7:
			bo.basic( 5 ,0.98,8);
			break;
		case 8:
			bo.basic( 5 ,0.98,8,10);
			break;
		case 9:
			bo.basic(10.02, 2);
			break;
		case 10:
			bo.basic(10.02, 2 , 1);
			break;
		case 11:
			bo.basic(10.02, 2 , 1 ,1);
			break;
		
		}
		

	
	}

}
