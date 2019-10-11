package com.dev.threads;

public class SMT2 extends Thread {
	
	Printer p ; // creating a reference
	
	public SMT2(Printer pref) {
		p = pref;
	}

	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		p.printVal(10, "SMT2");
	}

}
