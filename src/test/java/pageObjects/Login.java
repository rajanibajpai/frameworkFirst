package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver localdriver;
	
	//constructor
	public Login(WebDriver remotedriver){
		
		localdriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	@FindBy(name="email")
	WebElement useremail;
	@FindBy(name ="password")
	WebElement userpassword;
	
	@FindBy(name="login-submit")
	WebElement loginButton;
	
	public void setUserEmail(String uemail) {
		useremail.sendKeys("janet.rajani+17@ithands.net");
			
	}
	public void setPassword(String password) {
		userpassword.sendKeys("123456");
	}
	public void hitSubmit() {
		loginButton.click();
	}
	

}
