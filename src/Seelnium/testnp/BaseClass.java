package Seelnium.testnp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
 public static WebDriver driver =null;
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "E:\\New folder\\java software\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.manage().window().maximize();

  }

  @AfterMethod
  public void afterMethod() {
	 driver.close();
  }

}
