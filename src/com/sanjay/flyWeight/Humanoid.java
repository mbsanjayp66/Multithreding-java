package com.sanjay.flyWeight;

public class Humanoid implements IRobot {
	private String type;

	private Sprite body;

	public Humanoid(String type, Sprite body) {
		this.type = type;
		this.body = body;
	}
	
	
	public String getType() {
		return type;
	}


	public Sprite getBody() {
		return body;
	}


	@Override
	public void display(int x, int y) {
		// TODO Auto-generated method stub

	}

}
