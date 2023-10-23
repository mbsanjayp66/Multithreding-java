package com.sanjay.flyWeight;

public class Main {
	public static void main(String args[]) {
		IRobot humaoIRobot = RoboticFactory.createObject("Humanoid");
		humaoIRobot.display(0, 0);
	}
}
