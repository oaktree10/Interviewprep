package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@name=\"username\"]")
	WebElement userName;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement loginButton;
	
	@FindBy(xpath="//*[contains(text(), 'My Info)")
	WebElement myInfoButton;
	
	//*[contains(text(), 'My Info)
	
	public void setUserName(String uname) {
		userName.sendKeys(uname);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void btnclick() {
		loginButton.click();
	}

	public void btnMyInfo() {
		myInfoButton.click();
	}
}
