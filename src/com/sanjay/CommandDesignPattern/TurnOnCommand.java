package com.sanjay.CommandDesignPattern;

public class TurnOnCommand implements ICommand {
	Receiver rc;
	
	public TurnOnCommand(Receiver rc) {
		this.rc = rc;
	}
	@Override
	public void execute() {
		this.rc.turnOnAc();
	}
	@Override
	public void undo() {
		this.rc.turnOffAc();
	}

}
