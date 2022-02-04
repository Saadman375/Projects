package step_Defs;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

//import java.util.List;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Perform_And_Verify_Amazon_Steps extends Base {

	@Given("I am in Amazon webpage")
	public void i_am_in_Amazon_webpage() throws InterruptedException {
	    navigateURL("https://www.amazon.com");
	    String country = getText(By.xpath("//div[@class='navFooterLine']//a[2]"));
	    assertEquals(country.trim(), "United States");
	    Thread.sleep(1000);
	}

	@When("I click on search box for finding a product named {string}")
	public void i_click_on_search_box_for_finding_a_product(String s) throws InterruptedException {
	    sendKeys(By.id("twotabsearchtextbox"), "Blenders");
	    click(By.id("nav-search-submit-button"));
	    String prod = getText(By.xpath("//span[@class='a-color-state a-text-bold']"));
	    prod = prod.substring(prod.indexOf("\"")+1, prod.lastIndexOf("\""));
	    assertEquals(prod.trim(), s);
	    Thread.sleep(1000);
	}

	@Then("I choose one item and click over")
	public void i_choose_one_option_whereas_adding_the_item_in_the_cart() throws InterruptedException {
		//Unable to complete the functional coding by creating list;was given stale exception error
//		website.navigate().refresh();
//		List<WebElement> elements = website.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div"));
//	    System.out.println("Total elements are -> " + elements.size());
//	    
//	    for(WebElement e:elements) {
//	    	//a[@class='a-link-normal a-text-normal']
//	    	//div[@class='s-desktop-width-max s-desktop-content s-opposite-dir sg-row']/div[1]/div/span[3]/div[2]/div[7]//h2
//	    	e.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[4]//h2")).click();  
//	    	
//	    }
		//Using explicit waiting
//		WebDriverWait wait = new WebDriverWait(website, 30);
//		WebElement blenders = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='s-desktop-width-max s-desktop-content s-opposite-dir sg-row']/div[1]/div/span[3]/div[2]/div[15]//h2/a/span")));
//		blenders.click();
		
//		click(By.id("add-to-cart-button"));
//		Thread.sleep(1000);
//		click(By.xpath("//span[@id='attachSiNoCoverage']/span/input"));
//		Thread.sleep(1000);
//		if (isDisplayed(By.xpath("//div[@id='attach-warranty']/div/div[1]/div[2]/a/span")) == true) {
//			click(By.xpath("//span[@id='attachSiNoCoverage']/span/input"));
////		click(By.xpath("//div[@id='attach-desktop-sideSheet']//span[@id='attachSiNoCoverage']/span/input"));
//			Thread.sleep(1000);
//		}
//		else {
//			Thread.sleep(1000);
//		}
		
		click(By.xpath("//div[@class='s-desktop-width-max s-desktop-content s-opposite-dir sg-row']/div[1]/div/span[3]/div[2]/div[5]//h2/a/span"));
		Thread.sleep(1000);
		boolean check = isEnabled(By.id("add-to-cart-button"));
		assertEquals(check, true);
	} 
	
	@And("I tried to add the item in cart")
	public void i_tried_to_add_the_item_in_cart() throws InterruptedException {
		click(By.id("add-to-cart-button"));
		Thread.sleep(3000);
		if (isDisplayed(By.xpath("//div[@id='attach-warranty-display']//h1[text()=' Add to your order ']")) == true) {
//			click(By.xpath("//span[@id='attachSiNoCoverage']/span/input"));
			click(By.xpath("//div[@id='attach-desktop-sideSheet']//span[@id='attachSiNoCoverage']/span/input"));
			Thread.sleep(3000);
		} 
		else {
			Thread.sleep(3000);
		}
		
//		String text = getText(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']"));
//		assertEquals(text.trim(), "Added to Cart");
//		OR=>
//		String text = getText(By.xpath("//div[@id='attach-added-to-cart-message']//h4"));
//		assertEquals(text.trim(), "Added to Cart");
	}

	@Then("I click the cart for seeing the added product")
	public void i_click_the_cart_for_seeing_the_added_product() throws InterruptedException {
		if (isDisplayed(By.xpath("//div[@id='attach-added-to-cart-message']//h4")) == true) {
	    	//Alternate xpath
//	    	click(By.xpath("//div[@id='attach-added-to-cart-message']/div/div[2]/div[3]/form/span/span/span"));
	    	click(By.xpath("//div[@class='a-fixed-left-grid-inner a-grid-vertical-align a-grid-top']//div[3]/form//input"));
		    Thread.sleep(3000);
	    }
		else if (isDisplayed(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")) == true) {
		    click(By.xpath("//div[@id='nav-tools']/a[4]"));
		    Thread.sleep(3000);
	    }
//	    click(By.xpath("//div[@class='a-fixed-left-grid-inner a-grid-vertical-align a-grid-top']//div[3]/form//input"));
//	    Thread.sleep(3000);
	   
	    String text = getText(By.xpath("//div[@class='a-row sc-cart-header sc-compact-bottom']/div/h1"));
	    assertEquals(text.trim(), "Shopping Cart");
	}

	@And("I verify the cart have added only one item")
	public void i_verify_the_cart_have_added_only_one_item() throws InterruptedException {
		Thread.sleep(3000);
		String prod = getText(By.xpath("//div[3]/span[@id='sc-subtotal-label-activecart']"));
	    prod = prod.substring(prod.indexOf("(")+1, prod.lastIndexOf(" item"));
	    assertEquals(prod.trim(), "1");
	}

	@Then("I remove the item from cart")
	public void i_remove_the_item_from_cart() throws InterruptedException {
		click(By.xpath("//div[@class='a-row sc-action-links']/span[2]/span/input"));
		Thread.sleep(3000);
		String text = getText(By.xpath("//div[@class='a-row sc-cart-header']//h1"));
		assertEquals(text.trim(), "Your Amazon Cart is empty.");
	}

}//class
