package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.Login;

public class TestCase_01 extends BaseClass{
	
	@Test
	public void loginEhallpass(){
		
		driver.get(baseURL);
		Login loginpage =new Login(driver);
		loginpage.setUserEmail(email);
		loginpage.setPassword(password);
		loginpage.hitSubmit();
		
		if(driver.getCurrentUrl().contentEquals("https://staging.e-hallpass.com/createpass")){
			Assert.assertTrue(true);
			
		}
		else{
			
			Assert.assertTrue(false);
		}
		
	}

}