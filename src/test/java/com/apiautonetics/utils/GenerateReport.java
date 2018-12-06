package com.apiautonetics.utils;

import com.rajatthareja.reportbuilder.ReportBuilder;
import com.rajatthareja.reportbuilder.Color;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GenerateReport {
    
    public static void cucumberReport() throws Exception{
        // Create ReportBuilder Object
        ReportBuilder reportBuilder = new ReportBuilder();
        
        // Set output Report Dir 
        reportBuilder.setReportDirectory("target/");
        
        // Set output report file name
        reportBuilder.setReportFileName("test_results");
        
        // Set Report Title
        reportBuilder.setReportTitle("My Test Report");
        
        // Set Report Color for more visit http://materializecss.com/color.html
        reportBuilder.setReportColor(Color.PURPLE);
        
        // Enable voice control for report
        reportBuilder.enableVoiceControl();
        
        // Add additional info for Report
        reportBuilder.setAdditionalInfo("Environment", "My Environment");

        // Create list or report Files or Directories or URLs or JSONObject or JSONString
        List<Object> cucumberJsonReports = new ArrayList<>();
        cucumberJsonReports.add(new File("target/cucumber.json"));
        
        // Build your report
        reportBuilder.build(cucumberJsonReports);
    }
}
