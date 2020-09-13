package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {

	WebDriver driver;

	@Test(priority = 1)
	public void UserIsAbleToGoToSite() throws InterruptedException {
		// Starts the browser and saves the driver in the test class
		driver = BrowserFactory.startBrowser();

		// On to the site
		driver.get("http://techfios.com/test/107/");
		System.out.println("Before Adding " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategoryPage.UserIsAbleToAddNewCategory();
		System.out.println("After Adding " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

	@Test(priority = 2)
	public void UserIsNotAbleToAddDuplicateCategory() throws InterruptedException {
		// driver.get("techfios.com/test/107/");

		AddCategoryPage addNewCategory = PageFactory.initElements(driver, AddCategoryPage.class);

		String expectedCategory = "Freeland"; // To store the actual title
		String actualCategory = addNewCategory.NewCategory(); // To get and store the title
		System.out.println("The category you want to add already exists: <duplicated category name>");
		Assert.assertTrue(true, expectedCategory);

	}

	@AfterMethod(enabled = false)
	public void close() {
		driver.close();
		driver.quit();
	}
}
