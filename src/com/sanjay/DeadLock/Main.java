package com.sanjay.DeadLock;

class Writter1 extends Thread {
	Object book;
	Object pen;
	public Writter1(Object book,Object Pen) {
		this.book = book;
		this.pen = Pen;
	}
	public void run() {
		synchronized (book) {
			try {Thread.sleep(100);}catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (pen) {
				System.out.println("Writter 1 is writing");
			}
		}
	}
	
}

class Writter2 extends Thread {
	Object book;
	Object pen;
	public Writter2(Object book,Object Pen) {
		this.book = book;
		this.pen = Pen;
	}
	public void run() {
		synchronized (pen) {
			try {Thread.sleep(100);}catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (book) {
				System.out.println("Writter 2 is writing");
			}
		}
	}
	
}

public class Main {

	public static void main(String[] args) {
		   Object book = new Object();
		   Object pen = new Object();
		   
		   
			new Writter1(book,pen).start();
			new Writter2(book,pen).start();
			
			System.out.println("Main is Done");
	}

}
