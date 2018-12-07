package com.apiautonetics.weather;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import com.apiautonetics.GlobalVariables;
import com.apiautonetics.utils.ApplicationUtils;

public class WeatherAPI {
	
	public static void getWeather(String param) {
		
		Response res = given().when().get(GlobalVariables.environment.url() + param +"&APPID="+ GlobalVariables.environment.key());
		GlobalVariables.resp = res;
		ApplicationUtils.outputText("I call the Weather API with "+param+" City");
		
	}

}
