package SeleniumPac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class lab6 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://tutorialsninja.com/demo/index.php?");
		TC_Lab5_2.main(null);
		dr.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a")).click();
		dr.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a")).click();
		dr.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a")).click();
		dr.findElement(By.xpath("//*[@id=\"input-limit\"]/option[2]")).click();
		dr.findElement(By.xpath("//*[@id=\"input-limit\"]/option[2]")).click();
		dr.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[2]/li[2]/a")).click();
		dr.findElement(By.xpath("//*[@id=\"tab-specification\"]/table/thead/tr/td")).getText();
		dr.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")).click();
		
		}
 
}