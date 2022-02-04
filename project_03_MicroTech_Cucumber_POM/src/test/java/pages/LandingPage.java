package pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

import base.Base;

public class LandingPage extends Base {
//	WebDriver driver;
//	
//	//Constructor that will automatically called as soon as the object of the class is created
//	public LandingPage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	public void navigateURL() {
		browser.get( "https://sit.skyschooling.com/microtech" );
	}
	
	//Locator for login button
	By loginBtn = By.xpath("//li[4]/a[@class='homeblack']");
	//By loginBtn = By.xpath("//a[text()='LOG IN']"); //[<-Another xpath]
	
	//Method to click login button
	public void i_Click_On_LogIn_Menu() {
		browser.findElement(loginBtn).click();
	}

}//class
