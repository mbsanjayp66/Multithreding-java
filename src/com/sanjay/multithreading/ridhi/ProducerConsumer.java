package com.sanjay.multithreading.ridhi;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
	private Queue<Integer>q;
	private Integer capacity;
	public ProducerConsumer(int cap) {
		capacity = cap;
		q = new LinkedList<>();
	}
	
	public boolean add(int num) {
		System.out.println("Inside add item");
		synchronized (q) {
			while(q.size()==capacity) {
				try {
					System.out.println("waiting because of full capacity");
					q.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			q.add(num);
			q.notifyAll();
			System.out.println("Finished add item");
			return true;
		}
	}
	
	public int remove() {
		System.out.println("Inside remove item");
		synchronized (q) {
			while(q.size()==0) {
				try {
					System.out.println("Waiting because of full capacity");
					q.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			int num = q.poll();
			q.notifyAll();
			System.out.println("finished remove");
			return num;
		}
	}
	
	
}
