package com.facebook.account;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.facebook.locator.FaceBookLocator;
import com.flipkart.common.CommonAction;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBook extends CommonAction {
	
	CommonAction co= new CommonAction();
	FaceBookLocator fb = new FaceBookLocator();
	
	
	@Given("launch the url page")
	public void launch_the_url_page() {
		System.out.println("browserLaunched");
	   
	}

	@Given("user sends email and pass")
	public void user_sends_email_and_pass() {
		fb.getEmail().sendKeys("fhfjgjggk@gmail.com");
		WebElement pass = fb.getPass();
		co.sendText(pass, "677842");
		co.javaDown(pass);
	   
	}

	@And("user get all text")
	public void user_get_all_text() {
		List<WebElement> texts = fb.getTexts();
		for (int i = 0; i < texts.size(); i++) {
			WebElement text = texts.get(i);
			System.out.println(text.getText());
			
		}
		
	    
	}

	@When("user click log in")
	public void user_click_log_in() {
	    fb.getLogin().getText();
	}

	@Given("user click the new acc")
	public void user_click_the_new_acc() {
		WebElement newacc = fb.getNewacc();
		co.click(newacc);
	   
	}

	@And("user clicks firstname {string}")
	public void user_clicks_firstname(String string) {
		co.switchto();
		WebElement fName = fb.getfName();
		co.sendText(fName, string);
	   
	}

	@When("user clicks lastname {string}")
	public void user_clicks_lastname(String string) {
		WebElement lName = fb.getlName();
		co.sendText(lName, string);
	   
	}

	@Then("user clicks email {string}")
	public void user_clicks_email(String string) {
		WebElement reg = fb.getReg();
		co.sendText(reg, string);
		WebElement reReg = fb.getReReg();
		reReg.isDisplayed();
		co.sendText(reReg, string);
	}

	@When("user clicks password {string}")
	public void user_clicks_password(String string) {
		WebElement rePass = fb.rePass;
		co.sendText(rePass, string);
	   
	}

	@Then("user clicks DOB {string} {string} {string}")
	public void user_clicks_DOB(String string, String string2, String string3) {
	    WebElement day = fb.getDay();
	    co.sendText(day, string);
	    WebElement month = fb.getMonth();
	    co.sendText(month, string2);
	    WebElement year = fb.getYear();
		co.sendText(year, string3);
	}

	@When("user clicks gender")
	public void user_clicks_gender() {
		WebElement gender = fb.getGender();
		co.click(gender);
	   
	}




}
