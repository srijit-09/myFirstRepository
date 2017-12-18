package stepDefinition;

import static io.restassured.RestAssured.given;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTestDemo {

	
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	
	private String ENDPOINT_GET_BOOK_BY_ISBN = "https://jsonplaceholder.typicode.com/posts";
	
	
	
	  @Before
	    public void before(Scenario scenario) {
	        request = RestAssured.with();
	        
	    }
	
	@Given("^Header values for the api$")
	public void header_values_for_the_api() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.useRelaxedHTTPSValidation();
		request.given()
        .contentType(ContentType.JSON)
        .baseUri("https://jsonplaceholder.typicode.com");
	  //  throw new PendingException();
	}

	@When("^I Create a post with title \"(.*?)\" and body \"(.*?)\"$")
	public void i_Create_a_post_with_title_and_body(String title, String body) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String postsData = "{\"title\":\" "+ title + "\"," + "\"body\":\" " + body +"}";
				;
		
		response = request.when().body(postsData).post("/posts");
		System.out.println("response: " + response.prettyPrint());
	}

	@Then("^Post should be created successfully$")
	public void post_should_be_created_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
