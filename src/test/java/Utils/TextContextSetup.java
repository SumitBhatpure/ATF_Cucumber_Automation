package Utils;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.InBoundReturnsPage;
import pageObjects.IncomingPage;
import pageObjects.InreturnCashLattersPage;
import pageObjects.LoginPage;
import pageObjects.PageObjectManager;

public class TextContextSetup {

	public WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;
	public InreturnCashLattersPage IRcashlettr;
	public IncomingPage incomingpage;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	public GenericUtils genericutils;
	public Properties prop;
	public InBoundReturnsPage IBReturn;

	public TextContextSetup() throws IOException {
		testbase = new TestBase();
		pageObjectManager = new PageObjectManager(testbase.Setup());
		genericutils = new GenericUtils(testbase.Setup());
	}

}
