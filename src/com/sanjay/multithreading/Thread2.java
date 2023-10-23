package com.sanjay.multithreading;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("currentThread:"+"i"+i);
		}
		
	}

}
