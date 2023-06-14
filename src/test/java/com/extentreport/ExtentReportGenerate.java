package com.extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ExtentReportGenerate {

	public static void main(String[] args) {
		ExtentReports report = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("MySpark.html");
		report.attachReporter(spark);
		
		report.setSystemInfo("Host Name", "Salesforce");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("User Name", "Lakshmi");
		
		spark.config().setDocumentTitle("Test Execution Report");
		spark.config().setReportName("Salesforce Regression tests");
		spark.config().setTheme(Theme.DARK);		
		
		
		ExtentTest reportLogger = report.createTest("testScript1");
		reportLogger.log(Status.INFO, "test started");
		reportLogger.log(Status.INFO, "browser launched");
		reportLogger.log(Status.INFO, "url entered");
		reportLogger.log(Status.INFO, "login butto clicked");
		reportLogger.log(Status.PASS, "test completed with pass");
		reportLogger.log(Status.PASS, MarkupHelper.createLabel("passed",ExtentColor.GREEN));
		
		
		report.flush();
		System.out.println("completed");
		
	}

	}


