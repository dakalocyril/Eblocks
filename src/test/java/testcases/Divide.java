package testcases;

import org.testng.annotations.Test;
import baseclass.TestBase;
import pages.Calculator;

public class Divide extends TestBase {
	
	
	@Test
	
	public void DivideTwoNumbers() throws InterruptedException 
	{
		Calculator cal = new Calculator(driver);
		cal.Two();
		cal.Divide();
		cal.Two();
		cal.Results();
		
		cal.verifyResults();
		
	
		
	}

}
