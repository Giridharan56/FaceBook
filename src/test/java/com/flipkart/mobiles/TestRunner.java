package com.flipkart.mobiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources",
                 glue="com.flipkart.mobiles",
                 tags="@sanity",
                 plugin= {"html:target","json:target/two.json"},
                 dryRun=false,
                 monochrome=true)

public class TestRunner {

}  
