package com.sanjay.ConcurrencyControl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

	public static void main(String[] args) {
		ExecutorService exc = Executors.newSingleThreadExecutor();
		for(int i=0;i<3;i++) {
			exc.execute(new First());
		}
		exc.shutdown();
	}

}
