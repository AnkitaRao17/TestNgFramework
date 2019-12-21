package WebApplication;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterMethod;

public class FireFoxBrowser {
	public static WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.firefox.driver", "E:\\New folder\\java software\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
