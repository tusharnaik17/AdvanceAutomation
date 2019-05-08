package com.testng.listeners;

import org.testng.IExecutionListener;

//ExecutionListener - monitors the beginning and end of a TestNG run

public class ExecutionListener implements IExecutionListener {
	
	 private long startTime;

//	onExecutionStart  -- called before the TestNG starts running the suites

	public void onExecutionStart() {
		startTime = System.currentTimeMillis();
		System.out.println("TestNG is going to start:-" + startTime);
	}

// onExecutionFinish() is called after TestNG is done running all the test suites
	public void onExecutionFinish() {
		System.out.println("TestNG has finished, took around " + (System.currentTimeMillis() - startTime) + "ms");
	}

}
