package com.extentreport;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyExtentReport {

	public static void main(String[] args) {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("MySpark.html");
		extent.attachReporter(spark);
		
		ExtentTest reportLogger = extent.createTest("testScript1");
		reportLogger.log(Status.INFO, "test started");
		reportLogger.log(Status.INFO, "browser launched");
		reportLogger.log(Status.INFO, "url entered");
		reportLogger.log(Status.INFO, "login butto clicked");
		reportLogger.log(Status.INFO, "test completed with pass");
		
		extent.flush();
		System.out.println("completed");
		
	}
}
