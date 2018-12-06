package com.apiautonetics.utils;

import static org.hamcrest.Matchers.lessThan;

import com.apiautonetics.weather.*;
import com.apiautonetics.GlobalVariables;
import com.apiautonetics.utils.ApplicationUtils;

public class ServiceUtils {
	
	public static void getService(String serviceName, String param) {
		switch (serviceName) {
		case "WeatherAPI":
			WeatherAPI.getWeather(param);
			break;
		default:
			ApplicationUtils.outputText("Invalid Service");
		}
	}
	
	public static void validateResponseTime(String sla) {
		GlobalVariables.resp.then().assertThat().time(lessThan(Long.parseLong(sla) * 1000));
		ApplicationUtils.outputText("I Validated that Response time is " + (GlobalVariables.resp.time())
				+ " MILISECONDS less than: " + Integer.parseInt(sla) * 1000 + " MILISECONDS");
	}
	
	public static void validateResponseCode(String resposeCode) {
		GlobalVariables.resp.then().assertThat().statusCode(Integer.parseInt(resposeCode));
		ApplicationUtils.outputText("I Validated that Response Code is correct Expected: " + resposeCode + " Actual: "
				+ GlobalVariables.resp.getStatusCode());

	}
}
