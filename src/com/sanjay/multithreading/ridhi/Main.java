package com.sanjay.multithreading.ridhi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProducerConsumer b1 = new ProducerConsumer(5);
		Thread t1 = new Thread(()->{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<10;i++) {
				b1.add(i);
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<10;i++) {
				b1.remove();			}
		});
		t1.start();
		t2.start();

	}

}
