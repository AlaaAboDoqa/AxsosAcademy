package QABootCamp_MavenProject.AxsosAcademy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class XPathPractice {
                          
	public static void main(String[] args) {
		
		          
	    
        // تجهيز المتصفح آلياً
        WebDriverManager.firefoxdriver().setup();
        
        WebDriver driver = new FirefoxDriver();


        try {
            driver.get("https://www.saucedemo.com/");
            System.out.println(" SUCCESS! Page Title is: " + driver.getTitle());
            
            // انتظر قليلاً لتصوير الشاشة
            
            
            WebElement elementName= driver.findElement(By.xpath("//input[@class=\"input_error form_input\"]"));
            elementName.sendKeys("standard_user");
            Thread.sleep(7000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}