package ProTrainingTech.Trainingsessioforselenium;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import Common.Utility;
import dev.failsafe.internal.util.Assert;
import pages.Home;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;


public class Signkh extends Utility {
	private static final Thread Thred = null;
	private Assertion assertion1;
	//WebDriver driver;
	@Test (priority=1)
	public void f() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  ob.emailfieldsfill();
	  ob.psswordfieldfill();
	  Thread.sleep(6000);
	  ob. ForgotPsswordClick();
	  ForgotPassword fb=new ForgotPassword(driver);
	  fb.ForgotPsswordFields();
	  fb.SearchButtonClicks();
	  
	  fb.search();
	  shots();
	  Thread.sleep(6000);
	  SoftAssert assertion=new SoftAssert();
	  String forgotlktexts= fb.Google();
	  System.out.println(forgotlktexts);
	  SoftAssert ew;
	  assertion.assertAll();
	
	assertion1 = null;
	//  Assert.Equals(forgotlktexts, "Use your Google accounts");
	  assertion1.assertEquals(forgotlktexts,  "Use your Google accountsk");
	  org.testng.Assert.assertEquals(forgotlktexts, "Use your Google account");
	  System.out.println("This is after the assertion");
	  ((SoftAssert) assertion1).assertAll();

  }
	
	@Test (priority=2)
	 public void CreatAcc() {
		Home cb=new Home(driver);
		cb.newAcc();
	
	}

	public static Thread getThred() {
		return Thred;
	}		
	
	}

