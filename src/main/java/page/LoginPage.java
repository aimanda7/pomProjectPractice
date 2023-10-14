package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver=driver;
		
		
		
	}

	//elements : @Findby(how,using) 
	@FindBy(how=How.XPATH,using="//input[@id='username']")WebElement USERNAME_ELEMENT;
	@FindBy(how=How.XPATH,using="//input[@name='password']")WebElement PASSWORD_ELEMENT;
	@FindBy(how=How.XPATH,using="//button[@name='login']")WebElement LOGIN_BUTTON_ELEMENT;
	
	
	//intractable methods
	public void insertUserName(String username) {
		USERNAME_ELEMENT.sendKeys(username);
		
	}
	public void insertPassWord(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	public void clickLOginBUtton() {
		LOGIN_BUTTON_ELEMENT.click();
	}
	
	public void performLogin(String username,String password) {
		USERNAME_ELEMENT.sendKeys(username);
		PASSWORD_ELEMENT.sendKeys(password);
		LOGIN_BUTTON_ELEMENT.click();
		
	}
	
	 
}
