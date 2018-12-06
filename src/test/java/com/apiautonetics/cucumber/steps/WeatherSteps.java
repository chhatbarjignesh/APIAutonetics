package com.apiautonetics.cucumber.steps;

import com.apiautonetics.utils.ApplicationUtils;
import com.apiautonetics.utils.BaseUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WeatherSteps {
	
	private BaseUtils base;

	public WeatherSteps(BaseUtils base) {
		this.base = base;
	}

	@Given("^I have an access to \"(.*)\"$")
	public void setOutputString(String name) {
		ApplicationUtils.outputText(name);
		base.scenario.write(ApplicationUtils.publishOutputText());

	}
	
	@When("^I call the \"(.*)\" by \"(.*)\"$")
	public void callAPI(String apiName, String city) {
		ApplicationUtils.outputText(apiName);
		ApplicationUtils.outputText(city);
		base.scenario.write(ApplicationUtils.publishOutputText());
	}
	
	@Then("^I should see the \"(.*)\" in the response within \"(.*)\" seconds$")
	public void validateNodeAndSLA(String node, String temp) {
		ApplicationUtils.outputText(node);
		ApplicationUtils.outputText(temp);
		base.scenario.write(ApplicationUtils.publishOutputText());
	}

}
