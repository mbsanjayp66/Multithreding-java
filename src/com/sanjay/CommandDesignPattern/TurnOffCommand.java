package com.sanjay.CommandDesignPattern;

public class TurnOffCommand implements ICommand {
	Receiver rc;
	
	public TurnOffCommand(Receiver rc) {
		this.rc = rc;
	}
	@Override
	public void execute() {
		this.rc.turnOffAc();
	}
	@Override
	public void undo() {
		this.rc.turnOnAc();
	}

}
