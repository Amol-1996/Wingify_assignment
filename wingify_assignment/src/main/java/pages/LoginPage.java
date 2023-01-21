package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginPage {

	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
		
	}
		
	@FindBy(id = "username")
	public WebElement txtbox_username;
	
	@FindBy(id="password")
	public	WebElement textbox_password;
	 
	@FindBy(id="log-in")
	public WebElement btn_login;
	
	
}