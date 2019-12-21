package Seelnium.testnp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Checkbox extends BaseClass {
  @Test
  public void f() {
	  
	  driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");	
      WebElement Option1 = driver.findElement(By.xpath("//label[text()='Option 1']/input"));
      Option1.isSelected();
      boolean isSelect = Option1.isSelected();
      System.out.println(isSelect);
      
    //label[text()='Option 2']/input
      WebElement Option2 = driver.findElement(By.xpath("//label[text()='Option 2']/input"));
      Option1.isSelected();
      boolean isSelect1 = Option1.isSelected();
      System.out.println(isSelect1);
      
    //label[text()='Option 3']/input
      WebElement Option3 = driver.findElement(By.xpath("//label[text()='Option 3']/input"));
      Option3.click();
      Option1.isSelected();
      boolean isSelect3 = Option1.isSelected();
      System.out.println(isSelect3);
      
      WebElement ClearAllButton = driver.findElement(By.id("check1"));
      ClearAllButton.click();
      
      WebElement Option4 = driver.findElement(By.xpath("//label[text()='Option 4']/input"));
      Option1.isSelected();
      boolean isSelect4 = Option1.isSelected();
      System.out.println(isSelect4);
      
      
      
  }
}
