package ProTrainingTech.Trainingsessioforselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\immy\\eclipse-workspace1\\Trainingsessioforselenium\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");		
		driver.manage().window().maximize();
		
		WebElement CreateButton=driver.findElement(By.linkText("Create new account"));
		CreateButton.click();
		Thread.sleep(5000);
		
		WebElement FirstName=driver.findElement(By.name("firstname"));
		FirstName.sendKeys("arman");
		
		WebElement LastName=driver.findElement(By.name("lastname"));
		LastName.sendKeys("ali");
		
		WebElement Mobile=driver.findElement(By.name("reg_email__"));
		Mobile.sendKeys("7033029112");
		
		WebElement NewPassword=driver.findElement(By.name("reg_passwd__"));
		NewPassword.sendKeys("XYZ321");

		WebElement MonthofBirth=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(MonthofBirth);
		ob.selectByValue("4");

		WebElement DayofMonth=driver.findElement(By.name("birthday_day"));
		Select ob1=new Select(DayofMonth);
		ob1.selectByValue("1"); 

		WebElement BirthYear=driver.findElement(By.name("birthday_year"));
		Select ob2=new Select(BirthYear);
		ob2.selectByValue("1984");

		WebElement MaleToggle=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"));
		MaleToggle.click();
		
		

	}

}

