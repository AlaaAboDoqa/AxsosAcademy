package QABootCamp_MavenProject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckBoxes extends TestBase {
	@Test
	public  void TestColorCheckBoxes() throws InterruptedException {
		
		WebElement redCheckBox= driver.findElement(By.xpath("//input[@value=\"red\"]"));
		WebElement purpleCheckBox= driver.findElement(By.xpath("//input[@value=\"purple\"]"));
		WebElement yellowCheckBox= driver.findElement(By.xpath("//input[@value=\"yellow\"]"));

		
		redCheckBox.click();
		Thread.sleep(3000);
		purpleCheckBox.click();
		Thread.sleep(3000);
		yellowCheckBox.click();
		redCheckBox.click();
		Thread.sleep(3000);

		 
		  
	    Assert.assertFalse(redCheckBox.isSelected(), "Red checkbox should be unchecked!");		}

		
	
	}



