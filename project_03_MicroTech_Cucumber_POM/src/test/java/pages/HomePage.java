package pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

import base.Base;

public class HomePage extends Base {
//	WebDriver driver;
//	
//	//Constructor that will automatically called as soon as the object of the class is created
//	public HomePage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	//Xpath of welcome text ->//h2[text()='Welcome Test ']
	By welcomeText = By.xpath("//h2[text()='Welcome Test ']");
	
	public String getWelcomeText() {
		return browser.findElement(welcomeText).getText();
	}
	
}//class
