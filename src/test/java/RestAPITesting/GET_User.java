package RestAPITesting;
 
import org.testng.annotations.Test;
 

import io.restassured.RestAssured;
 

public class GET_User {
  @Test
  public void getuser() {
	  
	  RestAssured.baseURI="https://api.restful-api.dev";
	  
	  RestAssured.given()
			  .when()
			  .get("/objects")
			  .then()
			  .statusCode(200)
			  .log().all();
			
	  
  }
}