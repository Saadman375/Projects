package step_Defs;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Login_Functionality extends Base {
	
	@Given("I am in target website")
	public void i_am_in_target_website() {
		navigateUrl("https://www.target.com");
		boolean opt = isDisplayed(By.xpath("//a[@class='Link-sc-1khjl8b-0 kdCHb AccountLink-sc-gx13jw-1 dWsPuD']"));
		assertEquals(opt, true);
	}

	@When("I click downwards arrow sign for schrolling Sign in option down")
	public void i_click_downwards_arrow_sign_for_schrolling_sign_in_option_down() throws InterruptedException {
		click(By.xpath("//a[@class='Link-sc-1khjl8b-0 kdCHb AccountLink-sc-gx13jw-1 dWsPuD']"));
		Thread.sleep(3000);
	}

	@Then("I click on Sign in option")
	public void i_click_on_sign_in_option() throws InterruptedException {
		click(By.xpath("//div[text()='Sign in']"));
		Thread.sleep(3000);
	}

	@And("I can see target login page")
	public void i_can_see_target_login_page() {
		boolean opt = isDisplayed(By.xpath("//span[text()='Sign into your Target account']"));
		assertEquals(opt, true);
	}

	@Then("I enter my login email and password")
	public void i_enter_my_login_email_and_password() throws InterruptedException {
		sendKeys((By.id("username")), ("mkmpc@yahoo.com"));
		Thread.sleep(3000);
		sendKeys((By.id("password")), ("*****"));
		Thread.sleep(3000);
	}

	@And("I click on login button")
	public void i_click_on_login_button() {
		click(By.xpath("//button[@type='submit']"));
	}

}//class
