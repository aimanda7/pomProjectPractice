package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	//login data
		String username = "demo@techfios.com";
		String password = "abc123";
		//testing data
		String dashboard= "Dashboard";
		String addcontact= "Add Contact";
		String fullname = "Richguy Happy";
		String company= "Techfios";
		String email = "therichguy@richfiled.com";
		
	@Test
	public void userShouldBeAbleToAddCustomer() throws InterruptedException {
		driver=BrowserFactory.init();
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.performLogin(username,password);
		
		DashBoardPage dashboardpage=PageFactory.initElements(driver, DashBoardPage.class);
		dashboardpage.verifyDashboardPage(dashboard);
		dashboardpage.clickOnCustomerMenuButton();
		dashboardpage.clickOnAddCustomerMenuButton();
		
		AddCustomerPage addcustomerpage=PageFactory.initElements(driver, AddCustomerPage.class);
		addcustomerpage.verifyAddCustomerPage(addcontact);
		addcustomerpage.insertFullname(fullname);
		addcustomerpage.insertCompany(company);
		addcustomerpage.insertEmail(email);
	}

}
