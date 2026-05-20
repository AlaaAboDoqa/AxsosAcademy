package QABootCamp_MavenProject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

	@Test(dataProvider ="loginData" )
	public  void TestLogin(String username, String password, String expectedMessage) {
		
		WebElement usernameField= driver.findElement(By.id("username"));
		WebElement passwordField= driver.findElement(By.id("password"));
		WebElement loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
		
		usernameField.clear();
		usernameField.sendKeys(username);
		passwordField.clear();
		passwordField.sendKeys(password);
		
		 loginButton.click();
		 
		 WebElement flashMessage = driver.findElement(By.id("flash"));

		 String actualMessage = flashMessage.getText().trim();
		 
		  
			Assert.assertEquals(actualMessage,(expectedMessage),

					"Expected message: " + expectedMessage + ", but got: " + actualMessage);
		     
		}

		@DataProvider(name = "loginData")

		public Object[][] provideLoginData() {

			return new Object[][] {

					{ "invalidusername", "invalidpassword", "Your username is invalid!" },

					{ "tomsmith", "SuperSecretPassword!", "You logged into a secure area!" }

			};
	
	}

}
