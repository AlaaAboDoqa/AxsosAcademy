package QABootCamp_MavenProject.tests;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase {

	protected WebDriver driver;
	//private static String baseUrl="https://the-internet.herokuapp.com/login";
	private static String CheckboxesUrl="https://www.ironspider.ca/forms/checkradio.htm";
	@BeforeTest
	public void setup() {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver=new FirefoxDriver();
		
	    driver.get(CheckboxesUrl) ;
		    }
	@AfterTest
	public void tearDown() {
		
		if (driver!= null) {
		  driver.quit();	
			
		}
		
	}
	
	
	
}
