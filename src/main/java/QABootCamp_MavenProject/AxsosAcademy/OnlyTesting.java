package QABootCamp_MavenProject.AxsosAcademy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

  public class OnlyTesting {                        
	public static void main(String[] args) {
		
		          
	    
        // تجهيز المتصفح آلياً
        WebDriverManager.firefoxdriver().setup();
        
        WebDriver driver = new FirefoxDriver();


        try {
            driver.get("https://only-testing-blog.blogspot.com/");
            System.out.println(" SUCCESS! Page Title is: " + driver.getTitle());
            
            
            
            WebElement elementName= driver.findElement(By.xpath("//input[@class=\"input_error form_input\"]"));
            elementName.sendKeys("standard_user");
            
            //Wait for ScreenShot
            Thread.sleep(7000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}