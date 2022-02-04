package step_Defs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base {

	@Before
	public void setup() {
//		System.setProperty("project's name", "<<< Saadman's Created Project >>>"); // System.setProperty(key, value) [# Property save information as "key=value" pair]
//		System.out.println( System.getProperty("project's name") ); // System.getProperty(key)
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(false);
		WebDriverManager.chromedriver().setup();
		website = new ChromeDriver(option);
		website.manage().window().maximize();
		website.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		//website.close(); //Closing for the Current tab
		website.quit(); //Closing for whole browser including all tabs
	} 
	
}//class
