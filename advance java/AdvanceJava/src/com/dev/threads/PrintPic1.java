package com.dev.threads;

public class PrintPic1 extends Thread{
	
	Printer2 p ;
	
	public PrintPic1(Printer2 pref) {
		p = pref ;
	}
	
	@Override
	public void run() {
	p.printing(10, "PrintPic1");
	}

}
