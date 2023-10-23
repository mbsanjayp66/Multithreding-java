package com.sanjay.SnakeAndLadder;

public class Player {
	String name;
	int currentPosition;
	public Player(String id, int currentPosition) {
		this.name = id;
		this.currentPosition = currentPosition;
	}
	public String getId() {
		return name;
	}
	public void setId(String id) {
		this.name = id;
	}
	public int getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	
	
	
}
