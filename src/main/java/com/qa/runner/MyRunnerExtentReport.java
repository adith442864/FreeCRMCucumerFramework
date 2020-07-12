package com.qa.runner;


import java.io.File;

import org.junit.runner.RunWith;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentProperties;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java\\com\\qa\\features\\freecrm.feature", //the path of the feature files
		glue={"com.qa.stepDefinitions"}, //the path of the step definition files	
		tags = {"~@Ignore"},
		format = {
				"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt"
				},
			plugin = {"com.cucumber.listener.ExtentCucumberFormatter.output/report.html"})



public class MyRunnerExtentReport extends AbstractTestNGCucumberTests {
	
	@BeforeClass
	public static void setup() {
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath("output/report.html");

}

@AfterClass
public static void teardown() {
//	Reporter.loadXMLConfig(new File("D:\\Workspace\\FreeCrmBDDFramework\\src\\main\\java\\com\\qa\\config\\extent-config.xml"));
//	Reporter.setSystemInfo("user", System.getProperty("user.name"));
//	Reporter.setSystemInfo("os", "Windows2010");
//	Reporter.setTestRunnerOutput("Sample test runner output message");
}

}
