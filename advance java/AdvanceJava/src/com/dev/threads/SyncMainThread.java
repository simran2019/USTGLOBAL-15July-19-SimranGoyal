package com.dev.threads;

public class SyncMainThread {

	public static void main(String[] args) throws InterruptedException { // this throw declaration is for join
		System.out.println("Sync thread started...");
		
		Printer p = new Printer();   
		// here p is object also a resource bcoz smt2 smt3 are using p due to which we get the o/p in
		//inconsistace form. this condition is bcoz of race condition.
		
		
		
		//new SMT2(p).start();
		
		SMT2 t4 = new SMT2(p);
		t4.start();
		//t4.join();
		
		new SMT3(p).start();
	
		
		System.out.println("Sync thread ended...");

	}

}
