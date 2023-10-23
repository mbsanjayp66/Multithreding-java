package com.sanjay.CommandDesignPattern;

import java.util.Stack;

public class MyRemoteController {
	ICommand iCommand;
	
	Stack<ICommand>stack = new Stack<>();
	
	public MyRemoteController() {
		// TODO Auto-generated constructor stub
	}
	public void setCommand(ICommand ic) {
		this.iCommand = ic;
		stack.push(ic);
	}
	public void pressButton() {
		this.iCommand.execute();
	}
	
	public void undo() {
		if(!stack.isEmpty()) {
			ICommand un = stack.peek();
			stack.pop();
			un.undo();
		}
	}
}
