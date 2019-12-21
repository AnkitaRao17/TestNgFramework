package Seelnium.testnp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Frame extends BaseClass  {
	
  @Test
  public void f() {
	  driver.get("http://hugelearning.com/iframe-practice-page/");
	  
	  
	  //switching frame by using Webelemet
	  //WebElement frame2= driver.findElement(By.xpath("//iframe[@id='IF2']"));
	  //driver.switchTo().defaultContent();
	  driver.switchTo().frame("iframe1");
	  
	  WebElement link =driver.findElement(By.xpath("//h3[text()='TEST PRACTICE FORM']"));
	  link.getText();
	  System.out.println(link.getText());
	  
	  
	  driver.switchTo().defaultContent();
	  	driver.switchTo().frame("iframe2");
	  
	  WebElement frame2 =driver.findElement(By.xpath("//h2[text()='Frame2']"));
	  frame2.getText();
	  System.out.println(frame2.getText());
	 
  }
}
