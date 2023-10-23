package com.sanjay.Concurrency;


class Sample{
	private int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void incr() {
		synchronized (this) {
			int y = getX();
			y++;
			try {Thread.sleep(1000);}catch (Exception e) {
				// TODO: handle exception
			}
			setX(y);
		}
	}
	
}

class MyThread extends Thread{
	Sample obj;
	public MyThread(Sample obj) {
		this.obj = obj;
	}
	
	public void run() {
		obj.incr();
	}
}

public class Main {

	public static void main(String[] args){
		Sample obj = new Sample();
		
		obj.setX(1);
		
		MyThread t1 = new MyThread(obj);
		
		MyThread t2 = new MyThread(obj);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(obj.getX());
	}

}
