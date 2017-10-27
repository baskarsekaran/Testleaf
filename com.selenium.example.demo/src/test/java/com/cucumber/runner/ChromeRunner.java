package com.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(strict = true
		,features = {"src/test/resources/SearchAmazonProducts.feature"}
		,plugin = {"pretty:STDOUT","html:C:\\Users\\616181\\git\\Testleaf1\\com.selenium.example.demo\\cucumber-pretty"}
		,monochrome = true
		,glue = {"com.selenium.example.demo"}
		)
public class ChromeRunner {


}
