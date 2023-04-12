package com.flipkart.mobiles;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flipkart.common.CommonAction;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonAction {
	CommonAction co = new CommonAction();

	@Before
	public void bLaunch(Scenario scenario) {
		co.browserLaunch("https://www.flipkart.com");
		co.max();
		final byte[] bescren = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(bescren, "image/png");
	}

	@After
	public void bClose(Scenario scenario) {
		final byte[] afscren = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(afscren, "image/png");
		co.browserClose();
	}

}
