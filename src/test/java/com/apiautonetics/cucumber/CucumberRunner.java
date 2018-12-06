package com.apiautonetics.cucumber;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.apiautonetics.utils.GenerateReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features = "src/test/resources/features/", plugin = { "pretty",
		"json:target/cucumber.json" })
public class CucumberRunner  {
	
	@AfterClass
    public static void teardown() throws Exception {
        GenerateReport.cucumberReport();
        
    }
}
