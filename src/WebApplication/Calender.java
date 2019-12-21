package WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Calender extends ChromeBrowser {
	
  @Test
  public void calender() {
	  driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
	  
	
	  
	  //click on calender button
	  WebElement btn= driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-th']"));
	  btn.click();
	  System.out.println("cander is opened");
	  
	  //month selection
	  WebElement month= driver.findElement(By.xpath("//th[@class='datepicker-switch']"));
	  month.click();
	  System.out.println("month selection is opened");
	  
	  
	  
  }
}
