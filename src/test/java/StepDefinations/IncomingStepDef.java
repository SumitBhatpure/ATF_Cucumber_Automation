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

public class IncomingStepDef {
	public LoginPage loginpage;
	public HomePage homepage;
	public IncomingPage incomingpage;
	public TextContextSetup textContextSetup;
	public PageObjectManager pageObjectmanager;
	public GenericUtils Genericutils;
	public InBoundReturnsPage IBReturn;
	public InreturnCashLattersPage IRcashlettr;
	public pageObjects.OutboundReturnCashlettesPage OutboundReturnCashlettesPage;

	public IncomingStepDef(TextContextSetup textcontextsetup) {
		this.textContextSetup = textcontextsetup;
//		homepage = textContextSetup.pageObjectManager.getHomePage();
//		IRcashlettr = textContextSetup.pageObjectManager.getInreturnCashLattersPage();
//		loginpage = textContextSetup.pageObjectManager.getLoginPagePage();
//		incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
	}

	@Given("^user is on application home page$")
	public void user_is_on_application_home_page() throws Throwable {
		//textContextSetup.testbase.Setup();
		 loginpage= textContextSetup.pageObjectManager.getLoginPagePage();
		loginpage.loginMethod(textContextSetup.testbase.prop.getProperty("valid_username"),
				textContextSetup.testbase.prop.getProperty("valid_password"));
	}

	@When("^user click on incoming field$")
	public void user_click_on_incomming_field() throws Throwable {
		 homepage = textContextSetup.pageObjectManager.getHomePage();
		homepage.incomming_Click();
	}

	@Then("^verify \"([^\"]*)\" items are displyed on screen$")
	public void verify_something_items_are_displyed_on_screen(String ResultExp) throws Throwable {
		 incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		Assert.assertTrue(incomingpage.SearchResult().contains(ResultExp));
	}

	@When("^user enter process date$")
	public void user_enter_process_date() throws Throwable {
		incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		incomingpage.EnterProcessDate(textContextSetup.testbase.prop.getProperty("Process_Date"), "");
	}

	@When("^user enetr Account number details$")
	public void user_enetr_account_number_details() throws Throwable {
		IncomingPage incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		incomingpage.EnterAccountDeatils(textContextSetup.testbase.prop.getProperty("Account_Number_Frome"),
				textContextSetup.testbase.prop.getProperty("Account_Number_To"));

	}

	@When("^user enetrs Ammount details$")
	public void user_enetrs_ammount_details() throws Throwable {
	 incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		incomingpage.EnterAmountDeatils(textContextSetup.testbase.prop.getProperty("Amount_From"),
				textContextSetup.testbase.prop.getProperty("Amount_to"));

	}

	@When("^user click on searchAll button$")
	public void user_click_on_searchall_button() throws Throwable {
		 incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		incomingpage.SeachAll();
	}

	@When("^user enter Differance Amount details$")
	public void user_enter_differance_amount_details() throws Throwable {
		 incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		incomingpage.EnterDiffAmountDeatils(textContextSetup.testbase.prop.getProperty("Difference_Amount_From"),
				textContextSetup.testbase.prop.getProperty("Difference_Amount_To"));
	}

	@When("^user enter sequence number details$")
	public void user_enter_sequence_number_details() throws Throwable {
		 incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		incomingpage.EnterSequenceNoDeatils(textContextSetup.testbase.prop.getProperty("Sequence_Number_Frome"),
				textContextSetup.testbase.prop.getProperty("Sequence_Number_To"));
	}

	@When("^user enter checkno details$")
	public void user_enter_checkno_details() throws Throwable {
		 incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		incomingpage.EnterCheckNoDeatils(textContextSetup.testbase.prop.getProperty("Check_Number_From"),
				textContextSetup.testbase.prop.getProperty("Check_Number_To"));
	}

	 @Then("^verify popup alert message as \"([^\"]*)\"$")
	    public void verify_popup_alert_message_as_something(String popuptext) throws Throwable {
	      Assert.assertEquals(textContextSetup.genericutils.getalerttext(), popuptext);
	    }
	 
	 @When("^user enter routinetransite no from \"([^\"]*)\" to \"([^\"]*)\"$")
	    public void user_enter_routinetransite_no_from_something_to_something(String RoutineTrasfrom, String RoutineTrasto) throws Throwable {
	 incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		 incomingpage.EnterRoutineTrasiteDeatils(RoutineTrasfrom, RoutineTrasto);
	    }

	    @Then("^verify operator field changes to \"([^\"]*)\"$")
	    public void verify_operator_field_changes_to_something(String Drop) throws Throwable {
	    incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
	    Assert.assertEquals(incomingpage.verifydropText(), Drop);
	    }
}
