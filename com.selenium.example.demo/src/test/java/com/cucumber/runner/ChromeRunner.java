package com.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(strict = true
		,features = {"src/test/resources/SearchAmazonProducts.feature"}
		,plugin = {"pretty:STDOUT","html:D:\\Baskar\\Workspace\\TestData\\eclipse\\workspace\\cucumber-pretty"}
		,monochrome = true
		,glue = {"com.selenium.example.demo"}
		)
public class ChromeRunner {


}
