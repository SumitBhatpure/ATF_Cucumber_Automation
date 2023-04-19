package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failedTCs.txt", glue = {"StepDefinations"}, dryRun = false , monochrome = true, 
plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		 })

public class failedtestRunner extends AbstractTestNGCucumberTests {

}
