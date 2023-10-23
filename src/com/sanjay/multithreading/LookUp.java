package com.sanjay.multithreading;

public class LookUp implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String nameString = Thread.currentThread().getName();
		System.out.println("currentThread:"+nameString);
		for(int i=0;i<10;i++) {
			System.out.println("Tick:"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
