package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryPage {
	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.NAME, using = "data")
	WebElement addNewData;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")
	WebElement addButton;

	public void UserIsAbleToAddNewCategory() throws InterruptedException {

		Random rnd = new Random();
		int randomNumber = rnd.nextInt(22);
		addNewData.sendKeys("PeterRukwaro" + randomNumber);

		addButton.click();

	}

	public String NewCategory() {
		return driver.getTitle();
	}
}
