package Seelnium.testnp;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AlertAndWindowpopup extends BaseClass {
	
  @Test (enabled = false)
  public void f() {
	  driver.get("https://www.guru99.com");
	 String SD = driver.getCurrentUrl();
	 String SD1 = driver.getTitle();
	 String SD2 = driver.getPageSource();
	 System.out.println(SD1);
	 System.out.println(SD);
	 System.out.println(SD2);
  }
  
  @Test (enabled = false)
  public void Dropdown() {
	  driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	 WebElement dropdown = driver.findElement(By.id("select-demo"));
	 Select sd = new Select(dropdown);
	 sd.selectByIndex(2);
	 WebElement selectedValue = sd.getFirstSelectedOption();
		System.out.println(selectedValue.getText());
  }
  
  @Test (enabled = false)
  public void popup() {
	  driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	  WebElement popup = driver.findElement(By.xpath("//button[text()='Click me!']"));
	  popup.click();
	  
	  Alert pop = driver.switchTo().alert();
	  String test = pop.getText(); 
	  System.out.println(pop);
	  pop.accept();
	  
	  WebElement pop1 =driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
	  pop1.click();
	  Alert po1 =driver.switchTo().alert();
	  String pp1 = po1.getText();
	  System.out.print(pp1);
	  po1.sendKeys("ankita");
	  po1.accept();
	  
	  WebElement text =driver.findElement(By.xpath("//p[@id='prompt-demo']"));
	  String doc = text.getText();
	  System.out.print(doc);
	 
	  
  }
  @Test
  public void windowpopup(){
	  driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
	  String parentid = driver.getWindowHandle();
	  
	  driver.findElement(By.xpath("//a[text()='Follow Twitter & Facebook']")).click();
	  driver.findElement(By.xpath("//a[text()='Follow All']")).click();
	  
	  Set<String> childid = driver.getWindowHandles();
	  Set<String> childid1 = driver.getWindowHandles();

	  for (String childwin :childid ) {
		  String title = driver.switchTo().window(childwin).getTitle();
		  if(title.contains("Twitter")) {
			  break;
		  }
	  }
	  driver.manage().window().maximize();
	  WebElement Seleasylink = driver.findElement(By.linkText("https://www.seleniumeasy.com"));
	  Seleasylink.getText();
	  System.out.print(Seleasylink.getText());

	  for (String childwin1 :childid1 ) {
		  String title = driver.switchTo().window(childwin1).getTitle();
		  if(title.contains("Facebook")) {
			  break;
		  }
	  }
	  driver.manage().window().maximize();
	  WebElement Seleasylink1 = driver.findElement(By.xpath("//div[text()='See more of Selenium Easy on Facebook']"));
	  Seleasylink1.getText();
	  System.out.print(Seleasylink1.getText());
	  
	  driver.quit();
  }
  }
