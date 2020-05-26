package com.wbl.Reporting;

import org.testng.ITestContext;

//import java.awt.im.InputContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG  implements ITestListener{




	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

  System.out.println(  result.getName() + " is passed\n");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	  System.out.println( result.getName()+" is failed\n"); 
	
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	  System.out.println( result.getName()+" is skipped\n");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
