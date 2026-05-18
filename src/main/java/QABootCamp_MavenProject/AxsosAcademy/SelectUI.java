package QABootCamp_MavenProject.AxsosAcademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

  public class SelectUI {                        
	public static void main(String[] args) throws InterruptedException {
		
		          
	    
        //Setup the browserاً
        WebDriverManager.firefoxdriver().setup();
        
        WebDriver driver = new FirefoxDriver();

            driver.get("https://the-internet.herokuapp.com/dropdown");
            System.out.println(" SUCCESS! Page Title is: " + driver.getTitle());
            driver.manage().window().maximize();            
            
            WebElement elementName= driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
           Select objSelect= new Select(elementName);
            objSelect.selectByVisibleText("Option 1");
            
            objSelect.selectByIndex(1);
            //objSelect.deselectAll();
            objSelect.selectByValue("1");
            //Save the options to print
            List<WebElement> optionsList = objSelect.getOptions();
            
            //Print  Options with for loop
            for (WebElement option:optionsList) {
            	
            	System.out.println(option.getText());
            	
            }
            //Wait for ScreenShot
            Thread.sleep(7000);
       
   
            driver.quit();
        
    }
}