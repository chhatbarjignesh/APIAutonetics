package com.apiautonetics.cucumber.steps;

import com.apiautonetics.utils.ApplicationUtils;
import com.apiautonetics.utils.BaseUtils;
import com.apiautonetics.utils.ServiceUtils;

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
		ServiceUtils.getService(apiName, city);
		base.scenario.write(ApplicationUtils.publishOutputText());
	}
	
	@Then("^I should see the \"(.*)\" response within \"(.*)\" seconds$")
	public void validateNodeAndSLA(String code, String time) {
		ServiceUtils.validateResponseCode(code);
		ServiceUtils.validateResponseTime(time);
		base.scenario.write(ApplicationUtils.publishOutputText());
	}

}
