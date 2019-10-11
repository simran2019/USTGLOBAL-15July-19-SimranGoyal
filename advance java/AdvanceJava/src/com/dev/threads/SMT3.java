package com.dev.threads;

public class SMT3 extends Thread {
	
	Printer p ; // creating a reference
	
	public SMT3(Printer pref) {
		p = pref;
	}

	@Override
	public void run() {
		p.printVal(10, "SMT3");
	}

}
