package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	protected static WebDriver browser;
	
	public static void click(By by) {
		browser.findElement( by ).click();
	}
	
	public static void sendKeys(By by, String value) {
		browser.findElement( by ).sendKeys( value );
	}
	
	public static boolean isDisplayed(By by){
		//WebElement element = browser.findElement( by );
		return browser.findElement( by ).isDisplayed();
	}
	
	public static boolean isEnabled(By by){
		//WebElement element = browser.findElement( by );
		return browser.findElement( by ).isEnabled();
	}
	
	public static String getText(By by){
		return browser.findElement(by).getText();
	}

	public static void navigateURL(String url) {
		browser.get( url );
	}
	
	
	

	
}
