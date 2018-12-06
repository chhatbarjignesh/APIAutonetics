package com.apiautonetics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.aeonbits.owner.ConfigFactory;

import com.apiautonetics.utils.Environment;

import cucumber.api.Scenario;
import io.restassured.response.Response;

public class GlobalVariables {
	public static ArrayList<String> outputText = new ArrayList<String>();
	public static Scenario scenario;
	public static Environment environment = ConfigFactory.create(Environment.class);
	public static Response resp;
	public static String userCode;
	public static Map<String, String> headers = new HashMap<String, String>();
}
