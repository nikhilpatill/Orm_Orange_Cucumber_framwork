package org.testRunners;


//following setup is for 'Run As ->JUnit'
/*import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/org/features",            //LoginPage.feature
		glue = "org/stepDefinations",
		dryRun =false
		
		)
public class TestRunner {

}
*/

//following setup is for 'Run As ->TestNG

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	features = "./src/test/resources/org/features",            //LoginPage.feature
	glue = {"org/stepDefinations","org/hooks"},
	dryRun =false,
	monochrome =true,
	tags = "@smoke or @regression",
//	format = {"pretty","html:report"}    //for older version
	plugin= {"pretty",
			"html:target/html_report/cucumber_report.html",
			"json:target/json_report/json_report.json",
			"junit:target/junit_report/junit_report.xlm",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
