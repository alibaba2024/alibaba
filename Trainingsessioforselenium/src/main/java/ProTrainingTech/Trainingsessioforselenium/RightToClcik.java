package ProTrainingTech.Trainingsessioforselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightToClcik {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\immy\\eclipse-workspace1\\Trainingsessioforselenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		WebElement Rightimage=driver.findElement(By.xpath("//img[@style='cursor: pointer;']"));
		Actions ob=new Actions(driver);
		ob.contextClick(Rightimage).build().perform();
	
	}

}
