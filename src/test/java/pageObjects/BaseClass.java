package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL ="http://staging.e-hallpass.com/login";
	public String email = "janet.rajani+17@ithands.net";
	public String password = "123456";
	public static WebDriver driver;
	
	//will run at starting of the class if included
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	//will run after the class if included
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
