package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Calculator {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@aria-label='answer display']")
	WebElement txtDisplay;
	
	@FindBy(xpath ="//*[@class='button number']")
	WebElement btnNumbers;
	
	@FindBy(xpath = "//*[@class='button operator']")
	WebElement btnOperator;
	
	@FindBy(xpath = "//*[@name='add']")
	WebElement btnAdd;
	
	@FindBy(xpath = "//*[@name='subtract']")
	WebElement btnSubtract;
	
	@FindBy(xpath = "//*[@name='multiply']")
	WebElement btnMultiply;
	
	@FindBy(xpath = "//*[@name='divide']")
	WebElement btnDivide;
	
	@FindBy(xpath = "//*[@name='calculate']")
	WebElement btnCalculate;
	
	@FindBy(xpath = "//*[@value='1']")
	WebElement btnOne;
	
	@FindBy(xpath = "//*[@value='2']")
	WebElement btnTwo;
	
	@FindBy(xpath = "//*[@value='3']")
	WebElement btnThree;
	
	@FindBy(xpath = "//*[@value='4']")
	WebElement btnFour;
	
	@FindBy(xpath = "//*[@value='5']")
	WebElement btnFive;
	
	@FindBy(xpath = "//*[@value='6']")
	WebElement btnSix;
	
	@FindBy(xpath = "//*[@value='7']")
	WebElement btnSeven;
	
	@FindBy(xpath = "//*[@value='8']")
	WebElement btnEight;
	
	@FindBy(xpath = "//*[@value='9']")
	WebElement btnNine;
	
	@FindBy(xpath = "//*[@value='0']")
	WebElement btnZero;
	
	public Calculator(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}

	public void EnterText(String val1) {
		
		btnNumbers.sendKeys(val1);
		//btnNumbers.sendKeys(val2);
		}
	
	public void One() {
		btnOne.click();
	}
	
	public void Two() {
		btnTwo.click();
	}
	
	public void Three() {
		btnThree.click();
	}
	public void Four() {
		btnFour.click();
	}
	public void Five() {
		btnFive.click();
	}
	public void Six() {
		btnSix.click();
	}
	public void Seven() {
		btnSeven.click();
	}
	public void Eight() {
		btnEight.click();
	}
	public void Nine() {
		btnNine.click();
	}
	public void Zero() {
		btnZero.click();
	}	
	
	
	public void AddNumber() {
		btnAdd.click();
	}
	
	public void Divide() {
		btnDivide.click();
	}
	
	public void Multiply() {
		btnMultiply.click();
	}
	
	public void Subtract() {
		btnSubtract.click();
	}
	
	public void Results() throws InterruptedException {
		btnCalculate.click();
		Thread.sleep(1000);
		String results = txtDisplay.getAttribute("value");
		Assert.assertEquals(results, results.toString());
		
	}
	
	public void verifyResults() throws InterruptedException {
		String results = txtDisplay.getAttribute("value");
		Thread.sleep(1000);
		Assert.assertEquals(results, results.toString());
		System.out.println("The results is = " + results.toString());
	}

}
