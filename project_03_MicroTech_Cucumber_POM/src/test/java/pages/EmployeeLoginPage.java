package pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

import base.Base;

public class EmployeeLoginPage extends Base {
//	WebDriver driver;
//	
//	//Constructor that will automatically called as soon as the object of the class is created
//	public EmployeeLoginPage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	By employeeLogin = By.xpath("//h1[text()='Employee Login ']");
	//Locator for username field
	By userIdBox = By.xpath("//input[@type='text']");
	//Locator for password field
	By userPasswordBox = By.xpath("//input[@type='password']");
	//Locator for login button
	//By loginButton = By.name("login-submit");
	By loginButton = By.xpath("//input[@name='login-submit']");
	//By loginButton = By.xpath("//input[@value='Login']");
	
	public String getEmployeeLogInLabel() {
		//return browser.findElement(employeeLogin).getText();
		String s = browser.findElement(employeeLogin).getText();
		return s;
	}
	
	//Method to enter username
	public void enterUserName(String uid) {
		browser.findElement(userIdBox).sendKeys(uid);
	}
	
	public void enterPassword() {
		browser.findElement(userPasswordBox).sendKeys("1234");
	}

	public void clickLogIn() {
		browser.findElement(loginButton).click();
	}
	
//	//For verifying the "Login" text from the button 
//	public String verifyButtonText() {
//		//return browser.findElement(loginButton).getAttribute("value");
//		String s = browser.findElement(loginButton).getAttribute("value");
//		return s;
//	}
	
}//class
