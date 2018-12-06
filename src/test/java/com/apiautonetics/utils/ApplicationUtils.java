package com.apiautonetics.utils;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import com.apiautonetics.GlobalVariables;

public class ApplicationUtils {
	public static void outputText(String textToOutput)  {
		GlobalVariables.outputText.add(textToOutput);

	}
	
	public static void failText(String textToOutput) {
		GlobalVariables.outputText.add("<<<<"+textToOutput+">>>>");
		fail(publishOutputText());
	}

	@SuppressWarnings("unchecked")
	public static Map<String, String> loadYML(String userCode, String file) throws IOException {
		InputStream input = new FileInputStream(new File("src/test/resources/data/" + file));
		Yaml yaml = new Yaml();
		Map<String, Map<String, Map<String, String>>> data = (Map<String, Map<String, Map<String, String>>>) yaml
				.load(input);
		input.close();
		return data.get(userCode).get(GlobalVariables.environment.environment());
	}

	public static String publishOutputText() {
		String temp = "";
		if (GlobalVariables.outputText != null && GlobalVariables.outputText.isEmpty())
			return null;
		else {
			for (String s : GlobalVariables.outputText) {
				temp += s + "\n";
			}
			GlobalVariables.outputText.removeAll(GlobalVariables.outputText);
			return temp;
		}

	}

}
