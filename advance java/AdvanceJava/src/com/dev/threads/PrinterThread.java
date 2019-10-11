package com.dev.threads;

public class PrinterThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Sync thread started...");
		
		Printer2 p = new Printer2();
		
		PrintPic1 t4 = new PrintPic1(p);
		t4.start();
		//t4.join();
		
		new PrintPic2(p).start();
	
		
		
		System.out.println("Sync thread ended...");
		

	}

}
