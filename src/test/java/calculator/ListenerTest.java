package calculator;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerTest implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		//response if test is Passed
		//System.out.println("The Test method : "+result.getName()+" has been executed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//response if test is failed
		
		System.out.println("The test method "+result.getName()+" has been failed" );

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The test method "+result.getName()+" has been skipped" );
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
