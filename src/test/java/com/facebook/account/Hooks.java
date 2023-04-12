package com.facebook.account;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flipkart.common.CommonAction;

import cucumber.api.Scenario;

public class Hooks extends CommonAction{
	CommonAction co = new CommonAction();
	
	
	public void bLauncH(Scenario scenario) {
		co.browserLaunch("https://www.facebook.com");
		co.max();
		final byte[] bescren = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(bescren, "image/png");
	}
	public void bClose(Scenario scenario) {
		final byte[] afscren = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(afscren, "image/png");
		co.browserClose();
	}

	

}
