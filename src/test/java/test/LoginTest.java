package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	//login data
	String username = "demo@techfios.com";
	String password = "abc123";
	String dashboard= "Dashboard";

	@Test
	public void vailidUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();
		
		//LoginPage loginpage=new LoginPage();
		
		LoginPage loginpage =PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(username);
		loginpage.insertPassWord(password);
		loginpage.clickLOginBUtton();
		
		DashBoardPage dashboardpage=PageFactory.initElements(driver, DashBoardPage.class);
		dashboardpage.verifyDashboardPage(dashboard);
		
		//BrowserFactory.tearDown();
		
		

	}

}
