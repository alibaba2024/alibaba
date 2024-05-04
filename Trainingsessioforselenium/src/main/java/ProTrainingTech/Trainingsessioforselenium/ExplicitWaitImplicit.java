package ProTrainingTech.Trainingsessioforselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitImplicit {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\immy\\eclipse-workspace1\\Trainingsessioforselenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement CreateAnAccount=driver.findElement(By.linkText("Create new account"));
		CreateAnAccount.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//
		//Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("lastname")));
		WebElement Namestofields=driver.findElement(By.name("lastname"));
		Namestofields.sendKeys("Khuram");
		
	}
	
	
}