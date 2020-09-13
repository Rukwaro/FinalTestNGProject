package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.BasePage;

public class BrowserFactory extends BasePage {
	static WebDriver driver;

	public static WebDriver startBrowser() {

		// Set Chrome Driver Properties
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Create ChromeDriver object and launch chrome browser
		WebDriver driver = new ChromeDriver();

		// Delete all cookies
		driver.manage().deleteAllCookies();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Set implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Go to the site
		driver.get("http://techfios.com/test/107/");

		// return the driver to the test class
		return driver;
	}
}
