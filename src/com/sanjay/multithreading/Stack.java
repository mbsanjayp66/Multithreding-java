package com.sanjay.multithreading;

public class Stack {
	private int[] arr;
	private int top;
	
	public Stack(int capacity) {
		arr = new int[capacity];
		top = -1;
	}
	public boolean isFull() {
		return top>=arr.length-1;
	}
	
	public boolean isEmpty() {
		return top<=-1;
	}
	
	public void push(int x) {
		if(top<arr.length) {
			top++;
			arr[top] = x;
		}
	}
	
}
