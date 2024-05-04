package ProTrainingTech.Trainingsessioforselenium;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Utility;
import pages.Home;

public class Amazon extends Utility {
		
	 @Test (priority = 1)
	 public void f() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  ob.emailfieldsfill();
	  ob.psswrdfieldfill();
	  shots();
	  ob. ForgotPsswordClick();
	  shots();
	  ForgotPassword fb=new ForgotPassword(driver);
	  fb.ForgotPsswordFields();
	  fb.SearchButtonClicks();
	  Thread.sleep(6000);
	  String forgotlktexts= fb.Google();
	  System.out.println(forgotlktexts);
	  SoftAssert assertion=new SoftAssert();
	//Assert.Equals(forgotlktext, "Use your Google accountsk");
	  assertion.assertEquals(forgotlktexts,  "Use your Google accountsk");
	  System.out.println("This is after the assertion");
	  assertion.assertAll();
	}
	
	public void CreatAnAccount() { 
	  Home ob=new Home(driver);
	  ob.CreatAnAccount();
	  driver.quit();
	  
  
	}
}
