package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = {"StepDefinations"}, dryRun = false , monochrome = true, 
plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failedTCs.txt"
		 })

public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
