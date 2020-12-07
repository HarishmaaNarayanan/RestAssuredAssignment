package stepfile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NegativeScenario {

	Response response;

	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		RestAssured.baseURI="https://api.restassured.io/";
	}
	
	@When("posted with correct information")
	public void posted_with_correct_information() {
		response = RestAssured.get("/api");
	}
	
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
		
		int statusCode = response.getStatusCode();
		System.out.println("Status Code Returned is" + statusCode);
		Assert.assertEquals(400,statusCode);
		
	}
	

}
