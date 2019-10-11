package com.dev.threads;

public class PrintPic2 extends Thread{
	
	Printer2 p ;
	
	public PrintPic2(Printer2 pref) {
		p = pref ;
	}
	
	@Override
	public void run() {
		/*
		 * try { Thread.currentThread().sleep(400); } catch (InterruptedException e) {
		 * 
		 * e.printStackTrace(); }
		 */
	p.printing(20, "PrintPic2");
	}

}
