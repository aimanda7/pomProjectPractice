package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage {
	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;

	}

	// elements
	@FindBy(how = How.XPATH, using = "//h2[text()=' Dashboard ']")
	WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[text()='Customers']")
	WebElement CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement ADDCUSTOMER_ELEMENT;

	// intractable methods
	public void verifyDashboardPage(String dashboard) {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), dashboard, "Dashboard page not found");

	}

	public void clickOnCustomerMenuButton() throws InterruptedException {
		Thread.sleep(1000);
		CUSTOMER_ELEMENT.click();

	}

	public void clickOnAddCustomerMenuButton() {
		ADDCUSTOMER_ELEMENT.click();

	}

}
