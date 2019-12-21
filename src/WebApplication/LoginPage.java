package WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage extends ChromeBrowser {

	@Test
	public void Login() throws InterruptedException {
		// navigate to facebook.com
		driver.get("https://www.facebook.com/");
		System.out.println("url entered");
		
		// Email Id TextBox
		WebElement EmailId = driver.findElement(By.xpath("//table/tbody/tr/td/input"));
		EmailId.sendKeys("annarao72@gmail.com");
		System.out.println("login id entered");

		// Password Id TextBox
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("ankita@17");
		System.out.println("Password entered");

		// Page Link
		String FBKlogin1 = driver.getCurrentUrl();
		System.out.print(FBKlogin1);
		System.out.println("Login button clicked");
		
		// Click on Login Button
		WebElement loginButton = driver.findElement(By.id("Log In"));
		loginButton.click();
		Thread.sleep(10000);

		// Sign In page Link
		String FBKlogin = driver.getCurrentUrl();
		System.out.print(FBKlogin);
		Thread.sleep(10000);
	}
}
