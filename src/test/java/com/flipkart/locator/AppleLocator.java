package com.flipkart.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.common.CommonAction;

public class AppleLocator extends CommonAction {
	    
	public AppleLocator() {
		PageFactory.initElements(driver, this);
	}
	

	
	public WebElement getEmail() {
		return email;
	}


	public WebElement getOtp() {
		return otp;
	}


	public WebElement getVerify() {
		return verify;
	}


	public WebElement getHumanverify() {
		return humanverify;
	}


	public WebElement getRetry() {
		return retry;
	}


	public WebElement getClose() {
		return close;
	}


	public WebElement getMobile() {
		return mobile;
	}


	public WebElement getApple() {
		return apple;
	}


	public WebElement getRed() {
		return red;
	}


	public WebElement getRed1() {
		return red1;
	}


	public WebElement getAdd() {
		return add;
	}


	public WebElement getCart() {
		return cart;
	}


	public WebElement getRed2() {
		return red2;
	}

	public WebElement getBack() {
		return back;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	@FindBy(xpath="//input[contains(@class,' VJZDxU')]")
	private WebElement email;

	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement otp;
	
	@FindBy(xpath="//button[text()='Verify']")
	private WebElement verify;
	
	@FindBy(xpath="//p[text()='Please verify you are a human']")
	private WebElement humanverify;
	
	@FindBy(xpath="//span[contains(text(),'Contact')]")
	private WebElement retry;
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement close;
	
	@FindBy(xpath="//div[text()='Mobiles']")
	private WebElement mobile;
	
	@FindBy(xpath="//div[text()='APPLE']")
	private WebElement apple;
	
	@FindBy(xpath="(//div[contains(@class,'4rR01T')])[15]")
	private WebElement red;
	
	@FindBy(xpath="//*[@class='B_NuCI']")
	private WebElement red1;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement add;
	
	@FindBy(xpath="//span[text()='Cart']")
	private WebElement cart;
	
	@FindBy(xpath="//a[contains(@class,'2Kn22P')]")
	private WebElement red2;
	
	@FindBy(xpath="//img[@title='Flipkart']")
	private WebElement back;
	
	
	@FindBy(name="q")
	private WebElement search;
	
	
}
