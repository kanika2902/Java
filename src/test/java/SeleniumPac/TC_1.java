package SeleniumPac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TC_1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("Test Methods");
		search.submit();
		
		System.out.println("Title is:"+driver.getTitle());
		
		driver.close();
		
	//	WebElement searchbutton=driver.findElement(By.name("btnk"));
	//	searchbutton.click();
		
		
 
	}
 
}
 