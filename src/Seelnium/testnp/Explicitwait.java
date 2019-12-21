package Seelnium.testnp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

// Applicable for particular Webelement

public class Explicitwait extends BaseClass {
	
// It tell webdriver to wait for condition or maximum time exceeded before throwing Exception.
//Check 500ms intervals 

  @Test
  public void Webdriverwait() {
	  driver.get("https://www.amazon.com");
	  WebElement pop = driver.findElement(By.xpath("//span[text()='Hello, Sign in']/parent::a"));
	  WebDriverWait wait= new WebDriverWait(driver,10);
	  WebElement pop1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Hello, Sign in']/parent::a")));
     pop.click(); 
  }
  
  // It tell webdriver to wait for condition  as well as freaquancy to check or maximum time exceeded before throwing Exception.
  @Test
  public void fluentwait() {
	  driver.get("https://www.amazon.com");
	  WebElement pop = driver.findElement(By.xpath("//span[text()='Hello, Sign in']/parent::a"));
	  
	  Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		 .withTimeout(Duration.ofSeconds(10) )
		 .pollingEvery(Duration.ofMillis(400))
		 .ignoring(Exception.class);
	   
	  WebElement wb1 = fluentWait.until(new Function <WebDriver, WebElement >(){
			  public WebElement apply(WebDriver driver) {
			  
			  return driver.findElement(By.xpath("//span[text()='Hello, Sign in']/parent::a")); 
			  }
			  
			  });
	  
	  pop.click();

	
  }
}
