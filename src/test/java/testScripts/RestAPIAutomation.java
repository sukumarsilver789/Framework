package testScripts;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.*;


public class RestAPIAutomation {

	@Test
	public void firstRestAPI() {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";	
		RequestSpecification httpRequest = RestAssured.given();		
		Response response = httpRequest.request(Method.GET, "/Hyderabad");
		Response response1 = httpRequest.get("/Hyderabad");
		 
		// Now let us print the body of the message to see what response
		String responseBody = response.getBody().asString();
		String responseBody1 = response1.getBody().asString();
		
		Headers headers = response.headers();
		int responseCode = response.getStatusCode();
		Assert.assertEquals(responseCode,200,  "Status code matched");
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Response Body is =>  " + responseBody1);
		System.out.println("Response Headers are =>  " + headers);
	}		
}
