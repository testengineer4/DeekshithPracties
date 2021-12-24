package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginpageObjects {
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//input[@name='uid']")
	public WebElement Uid;
	
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	public WebElement Pwd;
	
	@FindBy(how = How.NAME, using = "btnLogin")
	public WebElement Login;
	
	public LoginpageObjects( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
