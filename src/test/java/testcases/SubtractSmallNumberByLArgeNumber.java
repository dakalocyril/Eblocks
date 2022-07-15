package testcases;

import org.testng.annotations.Test;
import baseclass.TestBase;
import pages.Calculator;

public class SubtractSmallNumberByLArgeNumber extends TestBase {
	
	
	@Test
	
	public void DivideTwoNumbers() throws InterruptedException 
	{
		Calculator cal = new Calculator(driver);
		cal.Two();
		cal.Subtract();
		cal.Nine();
		cal.Results();
		
		cal.verifyResults();
		
	
		
	}

}
