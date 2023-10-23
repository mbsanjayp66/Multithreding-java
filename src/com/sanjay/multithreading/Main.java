package com.sanjay.multithreading;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main is started");
//		Thread t1 = new Thread1("Sanjay");
		Thread t2 = new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println("currentThread:"+"i"+i);
			}
		},"Sanja2");
		t2.start();
		System.out.println("Main is finished");
		
	}

}
