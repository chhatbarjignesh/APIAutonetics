package com.apiautonetics.cucumber.steps;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.apiautonetics.utils.BaseUtils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

private BaseUtils baseutil;
	
	public Hooks(BaseUtils baseutil) {
	
		this.baseutil = baseutil;
	}

	@Before
	public void beforeScenario(Scenario scenario) {
		baseutil.scenario = scenario;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		LocalDateTime localDate = LocalDateTime.now();
		baseutil.scenario.write(dtf.format(localDate).toString());

	}

	@After
	public void afterScenario(Scenario scenario) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		LocalDateTime localDate = LocalDateTime.now();
		baseutil.scenario.write(dtf.format(localDate).toString());
	}
}
