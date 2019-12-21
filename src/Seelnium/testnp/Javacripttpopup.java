package Seelnium.testnp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Javacripttpopup extends BaseClass {
	
  @Test
  public void f() throws InterruptedException {
	  
	  driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	  Thread.sleep(3000);
	  WebElement Btn = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
	  Btn.click();
	  Alert alert =driver.switchTo().alert();
	  String test = alert.getText();
	  System.out.println(test);
	  
	  //click on cancel button
	  alert.dismiss();
	  
	  //click on ok button
		/*
		 * alert.accept(); alert.getText(); System.out.println(alert);
		 */
  }
}
