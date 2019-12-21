package Seelnium.testnp;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BrowseNavigation_Dropdown extends BaseClass {

	
	  @Test (enabled = false)
	  public void f() throws InterruptedException {
	  driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html ");
	 Thread.sleep(2000); //Refresh driver.navigate().refresh();
	 Thread.sleep(2000); driver.navigate().to("http://www.google.com");
	Thread.sleep(2000); driver.navigate().back();
	String Url = driver.getCurrentUrl(); 
	String Url1 = driver.getTitle();
	String Url2 = driver.getPageSource();
	System.out.println(Url);
	System.out.println(Url1);
	System.out.println(Url2);
	  }
	
	@Test(enabled = true)
	public void Dropdown() throws InterruptedException {
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Thread.sleep(2000);
		WebElement Dropdown = driver.findElement(By.id("select-demo"));
		Select SD = new Select(Dropdown);
		SD.selectByIndex(1);
		Thread.sleep(2000);
		
		WebElement selectedValue = SD.getFirstSelectedOption();
		System.out.println(selectedValue.getText());
		
		WebElement Dropdown1 = driver.findElement(By.id("select-demo"));
		Select SD1 = new Select(Dropdown1);
		SD1.selectByVisibleText("Monday");
		

	}
	
	@Test(enabled = false)
	public void Dropdownoptionselect() throws InterruptedException {
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Thread.   sleep(2000);
		WebElement Dropdown = driver.findElement(By.id("select-demo"));
		Select SD3 = new Select(Dropdown);
		List<WebElement> allOptions =SD3.getOptions();
		for(WebElement option: allOptions)
		{
			System.out.print(option.getText());
	  }
		
	}
	
}
