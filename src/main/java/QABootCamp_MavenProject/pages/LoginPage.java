package QABootCamp_MavenProject.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

/**
 * Page Object Model class for the Login Page of the application.
 */

public class LoginPage {

	private WebDriver driver;

// Locators for the elements on the Login Page

	private By usernameInput = By.id("user-name");

	private By passwordInput = By.id("password");

	private By loginButton = By.id("login-button");

	/**
	 * Constructor to initialize the WebDriver.
	 * 
	 * 
	 * @param
	 * 
	 * driver        the WebDriver instance to interact with the browser
	 */

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	/**
	 * Method to enter the username.
	 * 
	 * 
	 * @param
	 * 
	 * username        the username to be entered
	 */

	public void enterUsername(String username) {

		driver.findElement(usernameInput).sendKeys(username);

	}

	/**
	 * Method to enter the password.
	 * 
	 * 
	 * @param
	 * 
	 * password        the password to be entered
	 */

	public void enterPassword(String password) {

		driver.findElement(passwordInput).sendKeys(password);

	}

	/**
	 * Method to click the login button.
	 */

	public void clickLogin() {

		driver.findElement(loginButton).click();

	}

	/**
	 * Method to perform login by entering username and password and clicking the
	 * login button.
	 * 
	 * 
	 * @param
	 * 
	 * username        the username to be entered
	 * 
	 * @param
	 * 
	 * password        the password to be entered
	 */

	public void login(String username, String password) {

		enterUsername(username);

		enterPassword(password);

		clickLogin();

	}

}