package com.sanjay.ConcurrencyControl;

public class First extends Thread{
	
	public First() {
		this.start();
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=10;i>=0;i--) {
			
			System.out.println("Tick Tick:"+i);
		}
	}
}
