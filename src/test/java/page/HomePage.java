package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//*[contains(@id,'close-icon')]")
	private WebElement closeButton;
	@FindBy(xpath="//span[.='Contact Us']")
	private WebElement contactUS;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getLabel() {
		return contactUS.getText();
	}
	public void clickCloseButton() {
		closeButton.click();
	}
}
