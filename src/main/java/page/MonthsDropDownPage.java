package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MonthsDropDownPage extends BasePage{

	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public MonthsDropDownPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//select[option='None'] [3]")
	WebElement monthsList;

	public void MonthDropDownList() throws InterruptedException {

		monthsList.click();
		Thread.sleep(3000);
	}

	public String AllMonths() {
		return driver.getTitle();
	}
}
