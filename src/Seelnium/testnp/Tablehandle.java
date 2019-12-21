package Seelnium.testnp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tablehandle extends BaseClass {

	@Test
  public void f() {
	  driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
	  List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
	  for (WebElement row: rows)
	  {
		  List<WebElement> cols = driver.findElements(By.xpath("//td"));
		  for (WebElement col: cols) {
			  System.out.println(col.getText());
		  }
		  }
			  
     WebElement nextlinkbtn = driver.findElement(By.linkText("2"));
     nextlinkbtn.click();
     
     //2nd page 
     
     List<WebElement> rows1 = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
	  for (WebElement row1: rows1)
	  {
		  List<WebElement> cols1 = driver.findElements(By.xpath("//td"));
		  for (WebElement col1: cols1) {
			  System.out.println(col1.getText());
			  
			  if( col1.getText().equals("Table cell")) {
				  
				System.out.print("Column found successfully");  
				  
			// if you want particular value in of particular row then use xpath to locate that webelement & extract value by using gettext().	  
			  }
		  }
		  }
     
	  }

}
