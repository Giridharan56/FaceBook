package com.flipkart.mobiles;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.common.CommonAction;
import com.flipkart.locator.AppleLocator;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Apple extends CommonAction {
	CommonAction co = new CommonAction();
	AppleLocator ap = new AppleLocator();
	public static WebElement verify;
	public static boolean hv;
	public static boolean display;
	public static WebElement apple;
	public static boolean displayed;
	public static boolean dis;

	@Given("launch the url")
	public void launch_the_url() {

	}

	@Given("launch the url  {string}")
	public void launch_the_url(String string) {
		System.out.println("browserlaunch from hooks class");

	}

	@And("user closes the login page")
	public void user_closes_the_login_page() {
		WebElement email = ap.getEmail();
		co.sendText(email, "giridharan@gmail.com");
		WebElement otp = ap.getOtp();
		co.click(otp);
		co.waits();
		try {
			WebElement verify = ap.getVerify();
			display = verify.isDisplayed();
//			System.out.println("verify displayed");
//			WebElement retry = ap.getRetry();
//			dis = retry.isDisplayed();
		}

		catch (Exception e) {
			WebElement humanverify = ap.getHumanverify();
			hv = humanverify.isDisplayed();

		}

		if (display == true || hv == true || dis == true) {
			WebElement close = ap.getClose();
			co.click(close);
		} else {
			System.out.println("code is wrong");
		}

	}

	@When("user clicks on mobiles")
	public void user_clicks_on_mobiles() {
		WebElement mobile = ap.getMobile();
		co.click(mobile);
	}

	@Then("apple should be displayed")
	public void apple_should_be_displayed() {
		apple = ap.getApple();
		displayed = apple.isDisplayed();
	}

	@When("user click on apple")
	public void user_click_on_apple() {
		if (displayed == true) {
			co.click(apple);
		} else {
			System.out.println("not displayed");
		}

	}

	@Then("apple mobiles should be displayed")
	public void apple_mobiles_should_be_displayed() throws Throwable {
		WebElement red = ap.getRed();
		co.getText(red);
		co.click(red);
		Thread.sleep(2000);
		co.windowHandle();

		WebElement red1 = ap.getRed1();
		Thread.sleep(2000);
		co.getText(red1);
		String text2 = red1.getText();

		WebElement add = ap.getAdd();
		co.click(add);
		Thread.sleep(2000);
		WebElement cart = ap.getCart();
		co.click(cart);
		WebElement red2 = ap.getRed2();
		String text3 = red2.getText();

		if (text3.equals(text2)) {
			WebElement back = ap.getBack();
			co.click(back);
		} else {
			System.out.println("not placed");

		}
	}

	@Then("apple mobiles should be displayed with one dim list")
	public void apple_mobiles_should_be_displayed_with_one_dim_list(DataTable dataTable) throws InterruptedException {
		List<String> asList = dataTable.asList();
		Thread.sleep(2000);
		List<String> asList1 = dataTable.asList();
		String string = asList1.get(0);
		System.out.println(string);
		WebElement search = ap.getSearch();
		search.sendKeys(string, Keys.ENTER);
		Thread.sleep(2000);
		WebElement red = ap.getRed();
//		String text = red.getText();
		red.click();
		Thread.sleep(2000);
		co.windowHandle();

		WebElement red1 = ap.getRed1();
		String text2 = red1.getText();
		WebElement add = ap.getAdd();
		co.click(add);
		Thread.sleep(2000);
		WebElement cart = ap.getCart();
		co.click(cart);
		WebElement red2 = ap.getRed2();
		String text3 = red2.getText();

		if (text3.equals(text2)) {
			WebElement back = ap.getBack();
			co.click(back);

		} else {
			System.out.println("not placed");
		}

	}

	@Then("apple mobiles should be displayed {string}")
	public void apple_mobiles_should_be_displayed(String string) throws InterruptedException {
		try {
			WebElement search = ap.getSearch();
			search.sendKeys(string, Keys.ENTER);
			System.out.println(string);
			Thread.sleep(2000);
			WebElement red = ap.getRed();
			String text = red.getText();
			red.click();
			Thread.sleep(2000);
			co.windowHandle();

			WebElement red1 = ap.getRed1();
			Thread.sleep(2000);
			String text2 = red1.getText();

			WebElement add = ap.getAdd();
			co.click(add);
			Thread.sleep(2000);
			WebElement cart = ap.getCart();
			co.click(cart);
			WebElement red2 = ap.getRed2();
			String text3 = red2.getText();

			if (text3.equals(text2)) {
				WebElement back = ap.getBack();
				co.click(back);

			} else {
				System.out.println("not placed");
			}
		}

		catch (Exception e) {
			System.out.println("wrong");
		}

	}

}
