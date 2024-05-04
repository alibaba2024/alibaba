package ProTrainingTech.Trainingsessioforselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\immy\\eclipse-workspace1\\Trainingsessioforselenium\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.navigate().to("http://www.protrainingtech.com");
		
		driver.get("https://www.protrainingtech.com");
		
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(4000);
		Thread.sleep(6000);
		String Title=driver.getTitle();
		String CurrentURL=driver.getCurrentUrl();
		String Session=driver.getWindowHandle();
		System.out.println(Title);
		System.out.println(CurrentURL); 
		System.out.println(Session);
		driver.close();
		

	} 
}
 