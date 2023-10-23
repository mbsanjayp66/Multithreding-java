package com.sanjay.DeadLock;

import java.awt.geom.Point2D;

public class Deadlock {
	
	
	public static void main(String args[]) {
		System.out.println("main is running");
		String lock1 = "Sanjay";
		String lock2 = "kumar";
		Thread t1 = new Thread(()->{
			synchronized (lock1) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("lock acquired");
				}
			}
		},"first");
		
		Thread t2 = new Thread(()->{
			synchronized (lock2) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("lock acuired2");
				}
			}
		},"second");
		t1.start();
		t2.start();
		System.out.println("Main is exiting");
	}
}
