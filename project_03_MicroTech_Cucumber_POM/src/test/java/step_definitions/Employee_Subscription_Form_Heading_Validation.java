package step_definitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeLoginPage;
import pages.HomePage;
import pages.LandingPage;
import static org.junit.Assert.assertEquals;

public class Employee_Subscription_Form_Heading_Validation extends Base {
	//Creating object of Landing Page
	LandingPage landingPage = new LandingPage();
	//Creating object of Employee LogIn Page
	EmployeeLoginPage employeeLoginPage = new EmployeeLoginPage(); 
	//Creating object of Home Page
	HomePage homePage = new HomePage();
	
	@Given("I am in landing page")
	public void i_am_in_landing_page() {
	    //This is the way if you take it from base
		//navigateURL("https://sit.skyschooling.com/microtech");
		landingPage.navigateURL();
	}

	@When("I click on Login Menu")
	public void i_click_on_Login_Menu() throws InterruptedException {
		Thread.sleep(3000);
	    landingPage.i_Click_On_LogIn_Menu();
	}

	@Then("verify I am in Employee Login Page")
	public void verify_I_am_in_Employee_Login_Page() throws InterruptedException {
		Thread.sleep(3000);
		assertEquals("Employee Login", employeeLoginPage.getEmployeeLogInLabel());
	}

	@And("I enter Login Id")
	public void i_enter_Login_Id() {
	    employeeLoginPage.enterUserName("testpilot@gmail.com");	
	}

	@And("I enter Password")
	public void i_enter_Password() {
	    employeeLoginPage.enterPassword();
	}

	@And("Click on Login Button")
	public void click_on_Login_Button() {
	    employeeLoginPage.clickLogIn();
	    //Checking the actual Login text of the button with expected one
	    //assertEquals("Login",employeeLoginPage.verifyButtonText());
	}

	@Then("I will be in my Home page")
	public void i_will_be_in_my_Home_page() {
		assertEquals("Welcome Test", homePage.getWelcomeText());
	}
	
}

