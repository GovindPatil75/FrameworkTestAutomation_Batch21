package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

      public static ExtentReports extent;	
	public static ExtentReports getReports() {
		
		String ReportPath=System.getProperty("user.dir")+"\\TestReport\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(ReportPath);
		reporter.config().setDocumentTitle("Test Automation Report");
		reporter.config().setReportName("Batch 21 Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Batch 21 Project");
		extent.setSystemInfo("Module Name", "ABC");
		extent.setSystemInfo("O.S.", "Windows 10");
		extent.setSystemInfo("Selenium WebDriver", "4.1.0");
		extent.setSystemInfo("QA Name", "PQR");
		return extent;
		
		
	}
}
