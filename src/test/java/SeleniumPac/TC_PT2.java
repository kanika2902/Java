package SeleniumPac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_PT2 {
  @Test
  public void Test4() {
	  WebDriverManager.edgedriver()
	  .setup();
	  	WebDriver dr = new EdgeDriver ();
	  	dr.get("https://www.youtube.com/");
	  	dr.quit();
  }
  
  
  
}