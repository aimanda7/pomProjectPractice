package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCustomerPage extends BasePage{
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		
		

	}

	// elements
	@FindBy(how = How.XPATH, using = "//h5[text()='Add Contact']")	WebElement ADD_CUSTOMR_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")	WebElement FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")	WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")	WebElement EMAIL_ELEMENT;
	// intractable methods 
	public void verifyAddCustomerPage(String addCustomer) {
		Assert.assertEquals(ADD_CUSTOMR_HEADER_ELEMENT.getText(),addCustomer, "PAGE NOT FOUND");
		
	}
	public void insertFullname(String fullname) {
		//generateRundomNbr(999);
		FULLNAME_ELEMENT.sendKeys(fullname+generateRundomNbr(999));
	}
	
	public void insertCompany(String company) {
		
		selectFromDropdown(COMPANY_ELEMENT,company);
	
	}
	
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRundomNbr(99)+email);
	}
	
}
