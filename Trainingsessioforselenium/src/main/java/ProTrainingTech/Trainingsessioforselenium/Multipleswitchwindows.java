package ProTrainingTech.Trainingsessioforselenium;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; 
public class Multipleswitchwindows {
static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\immy\\eclipse-workspace1\\Trainingsessioforselenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String ParentWindowHandle=driver.getWindowHandle();
		System.out.println("Window handle parent ="+ParentWindowHandle);
		Thread.sleep(6000);
		WebElement Forgotlinks=driver.findElement(By.linkText("Forgot password?"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		Forgotlinks.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		Set<String> windowhandles= driver.getWindowHandles();
		java.util.Iterator<String> iterators= windowhandles.iterator();
		String FirstWindowHandle=iterators.next();
		String Secondwindowhandle=iterators.next();
		System.out.println("First window handle ="+FirstWindowHandle);
		System.out.println("Second window handle ="+Secondwindowhandle);
		driver.switchTo().window(Secondwindowhandle);
		
		WebElement Namefields=driver.findElement(By.id("identify_email"));
		Namefields.sendKeys("hr@protrainingtech.com");
  
	}

} 

