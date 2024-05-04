package ProTrainingTech.Trainingsessioforselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
// TOD// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\immy\\eclipse-workspace1\\Trainingsessioforselenium\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
WebElement Emailfield=driver.findElement(By.id("email"));
Emailfield.sendKeys("hr@protrainingtech.com");
WebElement PsswrdField=driver.findElement(By.name("pass"));
PsswrdField. sendKeys("Shahbaz"); 
Thread.sleep(2000);
WebElement Forgotlk=driver.findElement(By.linkText("Forgot password?"));
Forgotlk.click();

	}

}
