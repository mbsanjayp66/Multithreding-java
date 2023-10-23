package com.sanjay.CommandPattern;

public class AirConditioner {
	boolean isOn;
	int temperature;
	
	public void turnOn() {
		isOn = true;
		System.out.println("Ac is On");
	}
	
	public void turnOf() {
		isOn = false;
		System.out.println("AC is Off");
	}
	
	public void setTemperature(int temp) {
		this.temperature = temp;
		System.out.println("Temperature set to:"+this.temperature);
	}
}
