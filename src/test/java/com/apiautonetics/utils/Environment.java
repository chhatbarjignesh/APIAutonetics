package com.apiautonetics.utils;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({ "classpath:environments/${env}.properties" // mention the property file name
})
public interface Environment extends Config {

	String url();
	
	String environment();
	
	String key();

}

