package Seelnium.testnp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClasDemo extends BaseClass {
	
  @Test(enabled=false)
  public void f() {
	  driver.get("https://www.amazon.com");
	  WebElement pop = driver.findElement(By.xpath("//span[text()='Hello, Sign in']/parent::a"));
	  Actions actions = new Actions (driver);
	  Action action = actions.moveToElement(pop).build();
	  action.perform();
  }
  
  @Test (enabled = true)
  public void f1() {
	  driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	  WebElement pop = driver.findElement(By.id("user-message"));
	  Actions actions = new Actions (driver);
	  Action action = actions.moveToElement(pop).click().keyDown(pop,Keys.SHIFT).sendKeys(pop, "ankita").keyUp(pop, Keys.SHIFT).build();
	  action.perform(); 
  }

}
