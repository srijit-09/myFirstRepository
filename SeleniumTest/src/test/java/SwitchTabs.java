import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class SwitchTabs {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();

	 String   baseUrl = "http://www.google.co.uk/";
	    driver.get(baseUrl);
	    
	    Actions action = new Actions (driver);
	    
	    action.keyDown(Keys.CONTROL).keyDown(Keys.ALT).keyDown(Keys.DELETE);
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
	    driver.get("https://www.facebook.com");

	    driver.switchTo().window(tabs.get(0)); // switch back to main screen        
	    driver.get("https://www.news.google.com");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/sjain12/Downloads/chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  
	  
  }

  
  
  public void tear () {}
  
//  public int tear () {}
  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

  @AfterTest
  public void afterTest() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
