package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {

	public static WebDriver driver;
	
	public void navigateUrl(String url) {
		driver.get(url);
	}
	
	public boolean isDisplayed(By by) {
		boolean c = driver.findElement(by).isDisplayed();
		return c;
	}
	
	public String getText(By by) {
		return driver.findElement(by).getText();
	}
	
	public void click(By by) {
		driver.findElement(by).click();
	}
	
	public void sendKeys(By by,String keyValue) {
		driver.findElement(by).sendKeys(keyValue);
	}
	
}//class
