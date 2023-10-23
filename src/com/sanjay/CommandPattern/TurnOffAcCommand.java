package com.sanjay.CommandPattern;

public class TurnOffAcCommand implements Icommand {
	AirConditioner aConditioner;
	
	public TurnOffAcCommand(AirConditioner ac) {
		this.aConditioner = ac;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		aConditioner.turnOf();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		aConditioner.turnOn();
	}

}
