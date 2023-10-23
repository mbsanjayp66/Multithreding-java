package com.sanjay.Threads;


class  NewThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("We are now in thread:"+Thread.currentThread().getName());
		
	}
}

public class Main {

	public static void main(String[] args) {
		Thread t1 = new NewThread();
		t1.setName("t1 thread");
		
		System.out.println("We are in thread:"+Thread.currentThread().getName()+" before starting a new Thread");
		t1.start();
		System.out.println("We are in thread:"+Thread.currentThread().getName()+" After starting a new Thread");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
