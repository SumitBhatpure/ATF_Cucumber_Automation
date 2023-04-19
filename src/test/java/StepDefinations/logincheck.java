package StepDefinations;

import org.testng.Assert;

import Utils.GenericUtils;
import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.InBoundReturnsPage;
import pageObjects.IncomingPage;
import pageObjects.InreturnCashLattersPage;
import pageObjects.LoginPage;
import pageObjects.PageObjectManager;

public class logincheck {
	public LoginPage loginpage;
	public HomePage homepage;
	public IncomingPage incomingpage;
	public TextContextSetup textContextSetup;
	public PageObjectManager pageObjectmanager;
	public GenericUtils Genericutils;
	public InBoundReturnsPage IBReturn;
	public InreturnCashLattersPage IRcashlettr;
	public pageObjects.OutboundReturnCashlettesPage OutboundReturnCashlettesPage;

	public logincheck(TextContextSetup textcontextsetup) {
		this.textContextSetup = textcontextsetup;
		// homepage = textContextSetup.pageObjectManager.getHomePage();
		// IRcashlettr =
		// textContextSetup.pageObjectManager.getInreturnCashLattersPage();
		// loginpage = textContextSetup.pageObjectManager.getLoginPagePage();
		// incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
	}

	@Given("^user is on ATF login Page$")
	public void user_is_on_atf_login_page() throws Throwable {

		// textContextSetup.testbase.Setup();
	}

	@When("^user enter valid username as \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_valid_username_as_something_and_password_something(String username, String password)
			throws Throwable {
		loginpage = textContextSetup.pageObjectManager.getLoginPagePage();
		loginpage.loginMethod(username, password);

	}

	@Then("^user nevigate to home page$")
	public void user_nevigate_to_home_page() throws Throwable {
		homepage = textContextSetup.pageObjectManager.getHomePage();
		Assert.assertEquals(homepage.verifyhomepageTitle(), "AtfWeb - ShowLogin");
	}

	@When("^user enter Invalid username  (.+) and password  (.+)$")
	public void user_enter_invalid_username_and_password(String xyz, String abc) throws Throwable {
		loginpage = textContextSetup.pageObjectManager.getLoginPagePage();
		loginpage.loginMethod(xyz, abc);
	}

	@Then("^error msg occurs on login page$")
	public void error_msg_occurs_on_login_page() throws Throwable {
		loginpage = textContextSetup.pageObjectManager.getLoginPagePage();
		Assert.assertEquals(loginpage.LoginErrorText(),
				"Invalid Userid or Password, please re-enter Userid and Password");

	}

	@When("^user log out of application$")
	public void user_log_out_of_application() throws Throwable {
		homepage = textContextSetup.pageObjectManager.getHomePage();
		homepage.logout_Click();
	}

}
