package ProTrainingTech.Trainingsessioforselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\immy\\eclipse-workspace1\\Trainingsessioforselenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement Submitbutton=driver.findElement(By.name("submit"));
		Submitbutton.click();
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("");
	}

}
