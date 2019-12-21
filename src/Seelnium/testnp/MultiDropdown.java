package Seelnium.testnp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiDropdown extends BaseClass {
  @Test
  public void f() {
	
			driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
			WebElement Dropdown = driver.findElement(By.id("multi-select"));
			Select SD3 = new Select(Dropdown);
			SD3.selectByIndex(1);
			SD3.selectByIndex(2);
			
			//getAllSelectedOptions() is used get all selected options in multi dropdown
			List<WebElement> allOptions =SD3.getAllSelectedOptions();
			
			for(WebElement option: allOptions)
			{
				System.out.println(option.getText());
			}
			
			SD3.deselectByValue("Florida");
			
          List<WebElement> allOptions1 =SD3.getAllSelectedOptions();
			
			for(WebElement option1: allOptions1)
			{
				System.out.println(option1.getText());
		}
			
			
			
  }
}
