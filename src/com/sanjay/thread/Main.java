package com.sanjay.thread;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main start Executing");
//		Thread t1 = new Thread1();
//		//t1.setDaemon(true);
//		t1.start();
		Thread t2 = new Thread(new Thread2());
		t2.start();
		System.out.println("Main stop Executing");
		
	}

}
