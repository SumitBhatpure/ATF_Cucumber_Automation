package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.reporter.FileUtil;

import Utils.TextContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	public TextContextSetup textcontextsetup;

	public Hooks(TextContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
	}

	@After
	public void afterScenario() throws IOException {
		textcontextsetup.testbase.Setup().quit();
	}

	@AfterStep
	public void getScreenshots(Scenario scenario) throws IOException {
		WebDriver driver = textcontextsetup.testbase.Setup();
		if (scenario.isFailed()) {
			File Sc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] filebyte=FileUtils.readFileToByteArray(Sc);
			scenario.attach(filebyte, "image.png", "image");
		}
	}
}
