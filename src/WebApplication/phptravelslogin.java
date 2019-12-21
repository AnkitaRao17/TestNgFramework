package WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class phptravelslogin extends ChromeBrowser {
	
  @Test
  public void phptravelslogin() throws InterruptedException {
	  //Launch PHPTravels
	  driver.get("https://www.phptravels.net/login");
	  System.out.println("Url opened");
	  
	  //Entered Text in Username
	  WebElement Username = driver.findElement(By.xpath("//div[@class=\"panel-body\"]/div/input[@placeholder='Email']"));
	  Username.sendKeys("user@phptravels.com");
	  System.out.println("Username entered successfully");
	  
	  //Entered text in Password
	  WebElement Password = driver.findElement(By.xpath("//div[@class=\"panel-body\"]/div/input[@placeholder='Password']"));
	  Password.sendKeys("demouser");
	  System.out.println("Password entered successfully");
	  
	  //Remeber me Checkbox
	  WebElement Checkbox = driver.findElement(By.xpath("	//div[@class='custom-control custom-checkbox login']/label\n"));
	  Checkbox.click();
	  System.out.println("Remeber me checkbox selected successfully");
	  Checkbox.isSelected();
	  boolean CK = Checkbox.isSelected();
	  System.out.println(CK);
	  
	  
	  //clicked on login button
	  WebElement loginbutn = driver.findElement(By.xpath("//form[@id='loginfrm']/button"));
	  loginbutn.click();
	  System.out.println("login into appication successfully");
	  Thread.sleep(30000);
	  
	  //User profile
		
		  WebElement Profile = driver.findElement(By. xpath("//div[@class='col-md-8']/h3[text()='Hi, Demo User']")); 
		 String usertext= Profile.getText(); 
		 System.out.print(usertext);
		
	  
	//User profile
	  //WebElement Profilelink =driver.findElement(By.linkText("My Profile"));
	  //System.out.println("Profilelink");
	  

  }
}
