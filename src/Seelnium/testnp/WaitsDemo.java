package Seelnium.testnp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsDemo extends BaseClass  {
  @Test
  public void f() {
	  //impicit wait
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //WebDriver Wait
	  WebDriverWait wait= new WebDriverWait(driver,10);
	  WebElement wb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//")));
	  wb.click();

	  //fluent wait
	  //incase if we want to use both wait in one class then we can use like this 
	  driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	  Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		 .withTimeout(Duration.ofSeconds(10) )
		 .pollingEvery(Duration.ofMillis(400))
		 .ignoring(Exception.class);
	  
	  
	  WebElement wb1 = fluentWait.until(new Function <WebDriver, WebElement>(){
			  public WebElement apply(WebDriver driver) {
			  
			  return driver.findElement(By.xpath("//")); 
			  }
			  
			  });
	  
	  wb1.click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
			  
  }
}
