package testcases;

import org.testng.annotations.Test;
import baseclass.TestBase;
import pages.Calculator;

public class Subtraction extends TestBase {
	
	@Test
	
	public void Subtract() throws InterruptedException 
	{
		Calculator cal = new Calculator(driver);
		cal.Five();
		cal.Subtract();
		cal.Three();
		cal.Results();
		
		cal.verifyResults();
		
	
		
	}

}
