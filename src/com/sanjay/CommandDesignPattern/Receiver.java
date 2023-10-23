package com.sanjay.CommandDesignPattern;

public class Receiver {
	boolean isOn;
	int temperature;
	
	public void turnOnAc() {
		this.isOn = true;
		System.out.println("AC is On");
	}
	
	public void turnOffAc() {
		this.isOn = false;
		System.out.println("Ac is Off");
	}
	
	public void setTemperature(int temp) {
		this.temperature = temp;
		System.out.println("Temperature chnaged to:"+temp);
	}
	
	
}
