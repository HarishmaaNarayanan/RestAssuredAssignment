package stepfile;

import static org.junit.Assert.*;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ResponseAssertion {
	
	Response response;

	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		RestAssured.baseURI="https://api.restassured.io/";
	}
	
	@When("posted with correct information")
	public void posted_with_correct_information() {
		response = RestAssured.get("/api/latest");
	}
	
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
		
		int statusCode = response.getStatusCode();
		System.out.println("Status Code Returned is" + statusCode);
		Assert.assertEquals(200,response.getStatusCode());
		String stLine =response.getStatusLine();
		Assert.assertEquals("HTTP/1.1 200 OK",stLine);
		System.out.println("Status Line Returned is"+stLine);
	}
	

}
