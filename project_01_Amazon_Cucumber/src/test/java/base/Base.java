package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	
	public static WebDriver website;
	
	public static void navigateURL(String url) {
		website.get( url );
	}
	
	public static boolean isDisplayed(By by) {
		return website.findElement( by ).isDisplayed();
	}
	
	public String getText(By by) {
		return website.findElement(by).getText();
	}
	
	public static boolean isEnabled(By by) {
		boolean n = website.findElement( by ).isEnabled();
		return n;
	}
	
	public static void sendKeys(By by,String Keyvalue) {
		website.findElement( by ).sendKeys( Keyvalue );
	}
	
	public static void click(By by) {
		website.findElement( by ).click();
	}
	
}
