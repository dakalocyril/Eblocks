package baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	
	public static WebDriver driver;
    public static Properties prop;
    public static String baseURL;

    @BeforeClass
    public void setUp() throws IOException {

        prop = new Properties();

        FileInputStream fis = new FileInputStream("C:\\Users\\ngwad001\\eclipse-workspace\\EblocksTech_qa_developer_assessement\\src\\main\\java\\baseclass\\data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browserName");
        baseURL = prop.getProperty("url");

        System.out.println(browserName);

        if (browserName.equalsIgnoreCase("firefox"))
        {
        	
            driver = new FirefoxDriver();
            System.out.println("Firefox has been launched");
        }

        else if (browserName.equalsIgnoreCase("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ngwad001\\eclipse-workspace\\EblocksTech_qa_developer_assessement\\driver\\chromedriver.exe");
        
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("useAutomationExtension", false);
            driver = new ChromeDriver(options);
            System.out.println("Chrome has been launched");

        }


        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
/*
    public void waitForClickable(WebElement e){
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.elementToBeClickable(e));
    }
   

    public void click(WebElement e){
        waitForClickable(e);
        e.click();
    }
     */
}
