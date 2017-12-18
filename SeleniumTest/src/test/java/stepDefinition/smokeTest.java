package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {

	WebDriver driver;

	@Given("^Open Chrome and start	application$")
	public void open_Chrome_and_start_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:/Users/sjain12/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	}

	@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_username_and_valid_password(String username,String password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(username);
		System.out.println(password);
		
		
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}
}
