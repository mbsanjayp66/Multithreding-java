package com.sanjay.CommandDesignPattern;

public class Main {

	public static void main(String[] args) {
		MyRemoteController objController = new MyRemoteController();
		objController.setCommand(new TurnOffCommand(new Receiver()));
		objController.pressButton();
		objController.undo();
	}

}


