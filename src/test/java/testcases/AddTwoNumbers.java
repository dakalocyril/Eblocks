package testcases;

import org.testng.annotations.Test;
import baseclass.TestBase;
import pages.Calculator;

public class AddTwoNumbers extends TestBase {
	
	
	@Test
	
	public void AddTwoNumber() throws InterruptedException 
	{
		Calculator cal = new Calculator(driver);
		cal.One();
		cal.AddNumber();
		cal.Two();
		cal.Results();
		
		cal.verifyResults();
		
	
		
	}

}
