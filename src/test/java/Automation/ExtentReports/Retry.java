package Automation.ExtentReports;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	//IRetryAnalyzer is used for running failed test cases again to avoid flakiness
	
	int count=0;
	int maxTry=1;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<maxTry)
		{
			count++;
			return true;
		}
		return false;
	}
	

}
