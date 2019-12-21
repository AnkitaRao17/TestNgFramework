package MyTestNp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Seelnium.testnp.BaseClass;

public class javascriptexecutorDemo extends BaseClass {
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	  WebElement pop = driver.findElement(By.id("user-message"));
	  Thread.sleep(2000);
	  
	  //javaexecutor Code
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  //js.executeScript("alert('hi');");
	  
	  js.executeScript("arguments[0].value ='ankita';", pop);
	  js.executeScript("arguments[0].click();", pop );
	  js.executeScript("window.scrollBy(0,800);"); // scrolling is done by on javascriptexecutor
	  Thread.sleep(2000);
	  
		/*
		 * js.executeScript("arguments[0].click();", pop );
		 * js.executeScript("arguments[0].value ='ankita';", pop); js.
		 * executeScript("window.location = 'https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html';"
		 * ); js.executeScript("window.scrollBy(0,500);");
		 * js.executeScript("history.go(0);"); 
		 */
	  
	     //0-refresh & 1-forward, -1=backward
	      js.executeScript("history.go(0);"); 
	      
		  String title =js.executeScript("return document.title;").toString(); String
		  domin =js.executeScript("return document.domain;").toString(); 
		  String url =js.executeScript("return document.URL;").toString();
		 
		 System.out.println(title); 
		 System.out.println(domin);
		 System.out.println(url);  
	  
	 
  }
}
