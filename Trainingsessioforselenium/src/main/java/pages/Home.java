package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	
	//add all the locators according to use for that age, create method for each locator according to action
	@FindBy(name = "email") WebElement emailfields;
	@FindBy(name="pass") WebElement psswordfields;
	@FindBy(linkText ="Forgot password?") WebElement Forgots;
	@FindBy(linkText = "Create ne account") WebElement CreaeNewAccount;
	
	public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	public void emailfieldsfill() {
		 emailfields.sendKeys("hr@gmail.com");
		
}
public void psswrdfieldfill() {
	
	psswordfields.sendKeys("kj");

}
	public void ForgotPassworClick() {
		Forgots.click();
		
	}
	public void ForgotPsswordClick() {
		// TODO Auto-generated method stub
		Forgots.click();
		
	}
	public void CreatAnAccount() {
		// TODO Auto-generated method stub
		
	}
	public void newAcc() {
		// TODO Auto-generated method stub
		driver.quit();
		
	}
	public void psswordfieldfill() {
		// TODO Auto-generated method stub
		
	}
	
}
	