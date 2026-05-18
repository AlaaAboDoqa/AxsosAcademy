package QABootCamp_MavenProject.AxsosAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloSelenium {
                              
	public static void main(String[] args) {
		
		          
	        //
        // تجهيز المتصفح آلياً
        WebDriverManager.firefoxdriver().setup();
        
        WebDriver driver = new FirefoxDriver();

        // username : tomsmith || Password : SuperSecretPassword!
        try {https://www.coursera.org/courseraplus/?adgroupid=156245795749&adposition=&authMode=login&campaignid=20858197888&creativeid=692160334961&device=c&devicemodel=&gad_source=1&gclid=CjwKCAjwouexBhAuEiwAtW_ZxwZzXySIKWC3G3MtEUfBaYQhx8Q2GiSvfZWbiDxbQpy4CvrB5e8Y5BoCdGoQAvD_BwE&hide_mobile_promo&keyword=coursera&matchtype=e&network=g&term=%7Bterm%7D&utm_campaign=B2C_EMEA__coursera_FTCOF_courseraplus&utm_medium=sem&utm_source=gg
            driver.get("https://the-internet.herokuapp.com/login");
            System.out.println(" SUCCESS! Page Title is: " + driver.getTitle());
            
            // انتظر قليلاً لتصوير الشاشة
            Thread.sleep(7000);
            
            WebElement elementName= driver.findElement(By.name("login"));
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}

