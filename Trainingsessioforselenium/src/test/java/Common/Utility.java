package Common;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class Utility {
	private static final String Ibrowser = null;
	public WebDriver driver;

  @BeforeMethod
  @Parameters({"browser"})
  public void Ibrowsers(String browser) {
		  if(browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\immy\\eclipse-workspace1\\Trainingsessioforselenium\\Drivers\\chromedriver.exe");
						driver = new ChromeDriver();
			
			}else if(Ibrowser.equalsIgnoreCase("Edge")) 
					System.setProperty("webdriver.edge.driver","C:\\Users\\immy\\eclipse-workspace1\\Trainingsessioforselenium\\Drivers\\msedgedriver.exe");
					driver=new EdgeDriver();
	
		
				System.out.println("Browser didn't exist");
  
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			}
			
  @AfterMethod
  public void afterMethod() {
	  driver.quit(); 
	  
  }
				public void shots() throws IOException {
					  Date sessio=new Date(0);
					  System.out.println(sessio);
					  String kj= sessio.toString().replace(" ", "_").replace(":", "_");
					  System.out.println(kj);
					  File output= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					  FileHandler.copy(output, new File ("C:\\Users\\immy\\eclipse-workspace1\\Trainingsessioforselenium\\Pictures\\"+kj+"Pictures.png"));
					  driver.quit();
					  
				  }

}
