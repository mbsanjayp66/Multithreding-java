package com.sanjay.CommandPattern;

public class Main {

	public static void main(String[] args) {
		MyRemoteController myRemoteController = new MyRemoteController(new TurnOffAcCommand(new AirConditioner()));
		myRemoteController.pressButton();
	}

}
