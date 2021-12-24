package firstFramWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.LoginpageObjects;

public class LoginTest {
	WebDriver driver;
	@Autowired LoginpageObjects loginpageObjects;
	@Given("Open chromebrowser and navigate to banksite")
	public void open_chromebrowser_and_navigate_to_banksite() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/V1/index.php");
	  loginpageObjects=new LoginpageObjects(driver);
	 
	}

	@Given("Enter Email")
	public void enter_email() {
		loginpageObjects.Uid.sendKeys("mngr376515");
	}
	
	@Given("Enter Password")
	public void enter_password() {
		loginpageObjects.Pwd.sendKeys("hEpenEd");  
	}
	
	@When("User clicked on submit buttion")
	public void user_clicked_on_submit_buttion() {
	    loginpageObjects.Login.click();
	}
	
	@Then("User should be in login Page")
	public void user_should_be_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
