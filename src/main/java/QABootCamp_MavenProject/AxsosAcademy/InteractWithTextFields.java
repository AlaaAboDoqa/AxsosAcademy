package QABootCamp_MavenProject.AxsosAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithTextFields {
public static void main(String[] args) throws InterruptedException {
		
		          
	    
        //Setup the browser
        WebDriverManager.firefoxdriver().setup();
        
        WebDriver driver = new FirefoxDriver();


        
//            driver.get("https://omayo.blogspot.com/");
//            System.out.println(" SUCCESS! Page Title is: " + driver.getTitle());

            
            
//            WebElement DisabledButton= driver.findElement(By.id("but1"));
//            System.out.println(DisabledButton.getText());

            
//            WebElement textFieldArea= driver.findElement(By.id("ta1"));
//            textFieldArea.sendKeys("السلامُ عليكم");
//            textFieldArea.sendKeys(Keys.ENTER);
          
           //*** Enabled and disabled buttons***
           
      
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
      
        System.out.println(" SUCCESS! Page Title is: " + driver.getTitle()); 
        //** Find and Click Enable Button    
        WebElement enableBtn= driver.findElement(By.xpath("//button[text()='Enable']"));
        enableBtn.click();
        Thread.sleep(5000);
        System.out.println("Button is Enabled : "+enableBtn.isEnabled());
        //** Find and Click Disabled Field
        WebElement disableTextField= driver.findElement(By.xpath("//input[@type='text']"));
        disableTextField.click();
        Thread.sleep(5000);
        System.out.println("Field is Enabled : "+disableTextField.isEnabled());
            //** Wait for ScreenShot
            Thread.sleep(5000);
       
            driver.quit();
        
    }                   
}
