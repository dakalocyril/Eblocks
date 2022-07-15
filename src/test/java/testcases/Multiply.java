package testcases;

import org.testng.annotations.Test;
import baseclass.TestBase;
import pages.Calculator;

public class Multiply extends TestBase {
	
	
	@Test
	
	public void MultiplyTwoNumbers() throws InterruptedException 
	{
		Calculator cal = new Calculator(driver);
		cal.Two();
		cal.Multiply();
		cal.Two();
		cal.Results();
		
		cal.verifyResults();
		
	
		
	}

}
