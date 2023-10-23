package com.sanjay.CommandPattern;

public class TurnOnAcCommand implements Icommand {
	AirConditioner aConditioner;
	
	public TurnOnAcCommand(AirConditioner ac) {
		this.aConditioner = ac;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		aConditioner.turnOn();
	}

	@Override
	public void undo() {
		aConditioner.turnOf();
	}

}
