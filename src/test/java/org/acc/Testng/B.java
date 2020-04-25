package org.acc.Testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class B implements IRetryAnalyzer{
	int mincount=0,maxcount=10;

	public boolean retry(ITestResult result) {
		if(mincount<maxcount)
		{
			mincount++;
			return true;
		}
		
		
		return false;
	}
	
	
	

}
