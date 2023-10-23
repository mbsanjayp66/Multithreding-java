package com.sanjay.cor;

public abstract class Logger {
	public static int outputInfo = 1;
	public static int errorInfo = 1;
	public static int logInfo = 1;
	public Logger nextLogger;
	public Integer level;
	
	public Logger(Logger log) {
		this.nextLogger = log;
	}
	
	public void log(int level,String msg) {
		if(level<=this.level) {
			displayMessage(msg);
		}
		if(nextLogger!=null) {
			nextLogger.log(level,msg);
		}
	}
	
	public  abstract void displayMessage(String msg);
	
}
