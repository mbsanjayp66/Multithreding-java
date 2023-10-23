package com.sanjay.ProducerAndConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
	private Queue<Integer>q;
	private int cap;
	public BlockingQueue(int cap) {
		this.q = new LinkedList<>();
		this.cap = cap;
	}
	
	public boolean add(int val) {
		synchronized (q) {
			while(q.size()==cap) {
				try {
					q.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			q.add(val);
			q.notifyAll();
			return true;
		}
	}
	
	public int remove() {
		while(q.size()==0){
			try {
				q.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int val = q.poll();
		q.notifyAll();
		return val;
	}
	
}
