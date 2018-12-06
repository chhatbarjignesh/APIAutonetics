package com.apiautonetics.utils;

import com.rajatthareja.reportbuilder.ReportBuilder;
import com.apiautonetics.GlobalVariables;
import com.rajatthareja.reportbuilder.Color;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GenerateReport {
    
    public static void cucumberReport() throws Exception{
        // Create ReportBuilder Object
        ReportBuilder reportBuilder = new ReportBuilder();
        
        // Set output Report Dir 
        reportBuilder.setReportDirectory("");
        
        // Set output report file name
        reportBuilder.setReportFileName("test_results");
        
        // Set Report Title
        reportBuilder.setReportTitle("Weather API");
        
        // Set Report Color for more visit http://materializecss.com/color.html
        reportBuilder.setReportColor(Color.CYAN);
        
        // Enable voice control for report
        reportBuilder.enableVoiceControl();
        
        // Add additional info for Report
        reportBuilder.setAdditionalInfo("Environment", GlobalVariables.environment.environment());

        // Create list or report Files or Directories or URLs or JSONObject or JSONString
        List<Object> cucumberJsonReports = new ArrayList<>();
        cucumberJsonReports.add(new File("cucumber.json"));
        
        // Build your report
        reportBuilder.build(cucumberJsonReports);
    }
}
