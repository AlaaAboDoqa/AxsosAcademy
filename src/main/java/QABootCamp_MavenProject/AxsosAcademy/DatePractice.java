package QABootCamp_MavenProject.AxsosAcademy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DatePractice {
	public static void main(String[] args) throws InterruptedException {
	
		//Setup the browser
	 WebDriverManager.firefoxdriver().setup();
     
     WebDriver driver = new FirefoxDriver();
     
     driver.get("https://jqueryui.com/datepicker/");
     
     System.out.println(" SUCCESS! Page Title is: " + driver.getTitle()); 
     //** Find and Click Date Frame   
     WebElement frame= driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
     driver.switchTo().frame(frame);
     frame.click();
     Thread.sleep(2000);
     //Find date Field
     WebElement inputDate= driver.findElement(By.id("datepicker"));
     inputDate.click();
     //Select a day from calender
     WebElement selectDate= driver.findElement(By.xpath("//a[@class=\"ui-state-default\" and text()='1']"));
     selectDate.click();
     System.out.println("The selected date is: " + inputDate.getAttribute("value"));
     //Screenshot
     Thread.sleep(5000);
     driver.quit();
     
	
}
}