package com.sanjay.multithreading;

public class Thread1 extends Thread{
	

	public Thread1(String string) {
		super(string);
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("inside thread1:"+Thread.currentThread().getName()+" "+i);
		}
	}

}
