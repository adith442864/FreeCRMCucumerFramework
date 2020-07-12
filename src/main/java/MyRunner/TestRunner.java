package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Workspace\\FreeCrmBDDFramework\\src\\main\\java\\features\\deals.feature", //the path of the feature files
		glue={"stepDefinition"}, //the path of the step definition files	
		format= {"pretty", "html:test_output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		strict = true, //it will check if any step is not defined in step definition file.
		dryRun = false, //to check mapping is proper between feature file and step definition file.
		monochrome = true //display the console output in a proper readible format.
//		tags = {"@SmokeTest" , "~@RegressionTest", "~@End2End"} 
		)
 
public class TestRunner {
 
}

// ORed : tags = {"@SmokeTest , @End2End"} -- execute all tests tagged as @SmokeTest or @End2EndTest
// ANDed : tags = {"@SmokeTest" , "@End2End"} -- execute all tests tagged as @SmokeTest AND @End2EndTest
// ignore : tags = {"~@SmokeTest" , "@RegressionTest"} 