package com.sanjay.CommandPattern;

import java.util.Stack;

public class MyRemoteController {
	Icommand icommand;
	Stack<Icommand>st = new Stack<>();
	
	public MyRemoteController(Icommand ic) {
		this.icommand = ic;
		st.add(ic);
	}
	public void pressButton() {
		this.icommand.execute();
	}
	public void undo() {
		if(!st.isEmpty()) {
			Icommand icc = st.peek();
			st.pop();
			icc.undo();
		}else {
			System.out.println("Not Possible");
		}
	}
}
