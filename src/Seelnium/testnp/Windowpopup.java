package Seelnium.testnp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Windowpopup extends BaseClass  {
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
	  
	  Thread.sleep(3000);
	  String parentid = driver.getWindowHandle();
	  WebElement Btn = driver.findElement(By.xpath("//a[contains(text(),'Like us On Facebook')]"));
	  Btn.click();
	  Set<String> childid = driver.getWindowHandles();
	  for (String childwin :childid ) {
		  String title = driver.switchTo().window(childwin).getTitle();
		  if(title.contains("Facebook")) {
			  break;
		  }
	  }
	  driver.manage().window().maximize();
	  WebElement Seleasylink = driver.findElement(By.xpath("//div[text()='See more of Selenium Easy on Facebook']"));
	  Seleasylink.click();
	  
	  driver.close();
	  driver.switchTo().window(parentid);
	 Thread.sleep(5000);
  }
}
