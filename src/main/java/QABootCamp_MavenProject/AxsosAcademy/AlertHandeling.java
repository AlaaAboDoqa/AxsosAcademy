package QABootCamp_MavenProject.AxsosAcademy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandeling {
	public static void main(String[] args) throws InterruptedException {
		
		//Setup the browser
	 WebDriverManager.firefoxdriver().setup();
     
     WebDriver driver = new FirefoxDriver();
     
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     
     System.out.println(" SUCCESS! Page Title is: " + driver.getTitle()); 
     //** Find Click The JSPrompt Btn 
     WebElement jSPrompt= driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
   
     jSPrompt.click();
     Thread.sleep(2000);
     //Find & Accept Alert
     Alert alert= driver.switchTo().alert();
     System.out.println(alert.getText());
     Thread.sleep(2000);
     alert.dismiss();
     Thread.sleep(2000);
     jSPrompt.click();
     Thread.sleep(2000);

     alert.accept();
     
   
     Thread.sleep(5000);
     driver.quit();
     
	
}
}
