package Seelnium.testnp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

// Applicable for Driver level & this is applicable all webElement in class
// It wait for particular time & it check for Webelement in 500 ms interval untill it found in particular time ex.(Milliseconds, Seconds, Hours, Minutes)
public class ImplicitwaitDemo extends BaseClass {
	
  @Test
  public void f() {
	  driver.get("https://www.amazon.com");
	  WebElement pop = driver.findElement(By.xpath("//span[text()='Hello, Sign in']/parent::a"));
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  }
}
