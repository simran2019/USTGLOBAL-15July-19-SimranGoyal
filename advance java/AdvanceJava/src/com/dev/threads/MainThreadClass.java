package com.dev.threads;

public class MainThreadClass {

	public static void main(String[] args) {
		System.out.println("Main thread started...");
		
		System.out.println("main thread printing the value of i");
		
	//	new T2().start();  // for start the thread executing and we create an object because start is non static .  because we do multithreading with t2
		
		MainThreadClass2 t2 = new MainThreadClass2();
		t2.setName("Thread t2"); // provide the name to the thread
		t2.start();
		t2.setPriority(6);
		
		
		Thread.currentThread().setName("Main thread"); // for provide the name to the main thread
		
		//new Thread(new T3()).start();
		
		MainThreadClass3 t3 = new MainThreadClass3();
		Thread t1 = new Thread(t3);
		t1.start();
		t1.setPriority(1);
		
		
		Thread.currentThread().setPriority(4);
		
		for(int i =1; i <=10;i++) {
			System.out.println("i = "+i);
		}
		
		System.out.println("Thread name = "+t2.getName());
		System.out.println("main thread anme = "+Thread.currentThread().getName());
		System.out.println("thread2 id = "+t2.getId());
		System.out.println("thread id = "+t1.getId());
		System.out.println("main thread id = "+Thread.currentThread().getId());
		System.out.println("thread2 priority = "+t2.getPriority());
		System.out.println("thread3 priority = "+t1.getPriority());
		System.out.println("main thread priority = "+Thread.currentThread().getPriority());
		
		
		
		
		System.out.println("main thread terminated...");

	}

}
