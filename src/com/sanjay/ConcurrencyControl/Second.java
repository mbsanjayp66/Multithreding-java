package com.sanjay.ConcurrencyControl;

public class Second implements Runnable {
	        public Second() {
	        	
	        }
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Thread:"+i);
				}
			}
}

