package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public int generateRundomNbr(int boundary) {
		Random random =new Random();
		return random.nextInt(boundary);		
	}
	
	public void selectFromDropdown(WebElement element, String visibleTaxt) {
		Select select =new Select(element);
		select.selectByVisibleText(visibleTaxt);
		
		
	} 
}
