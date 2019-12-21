package WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonSignIn extends ChromeBrowser {
  @Test (enabled = false)
  public void signin() {
	  driver.get("https://www.amazon.com");
	  WebElement Signinpopup = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
	  WebElement Signinlink = driver.findElement(By.xpath("//a[@rel='nofollow']/span [text()='Sign in']"));
	  
	  Actions actions = new Actions (driver);
	  Action action = actions.moveToElement(Signinpopup).click(Signinlink).build();
	  action.perform();
	  
  }
  
  @Test (enabled = false)
  public void signindragndrop() throws InterruptedException {
	  driver.get("https://www.amazon.com");
	  WebElement Signinpopup = driver.findElement(By.xpath("//a[@id='nav-orders']"));
	  WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));

	  Actions actions = new Actions (driver);
	  Action action = actions.dragAndDrop(Signinpopup, Searchbox).build();
	  action.perform();
	  Thread.sleep(2000);
	  
  }
  @Test (enabled = true)
  public void keys() throws InterruptedException {
	  driver.get("https://www.amazon.com");
	  WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));

	  Actions actions = new Actions (driver);
	  Action action = actions.moveToElement(Searchbox).click().keyDown(Searchbox, Keys.SHIFT).sendKeys(Searchbox, "ankita").keyUp(Searchbox, Keys.SHIFT).build();
	  action.perform();
	  Thread.sleep(2000);
	  
  }
}
