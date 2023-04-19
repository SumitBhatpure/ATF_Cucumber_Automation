package StepDefinations;

import org.testng.Assert;

import Utils.GenericUtils;
import Utils.TextContextSetup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.InBoundReturnsPage;
import pageObjects.IncomingPage;
import pageObjects.InreturnCashLattersPage;
import pageObjects.LoginPage;
import pageObjects.PageObjectManager;

public class InreturnCAshlettrsStepDef {
	public LoginPage loginpage;
	public HomePage homepage;
	public IncomingPage incomingpage;
	public TextContextSetup textContextSetup;
	public PageObjectManager pageObjectmanager;
	public GenericUtils Genericutils;
	public InreturnCashLattersPage IRcashlettr;
	public InBoundReturnsPage IBReturn;
	public pageObjects.OutboundReturnCashlettesPage OutboundReturnCashlettesPage;

	public InreturnCAshlettrsStepDef(TextContextSetup textcontextsetup) {
		this.textContextSetup = textcontextsetup;
//		homepage = textContextSetup.pageObjectManager.getHomePage();
//		IRcashlettr = textContextSetup.pageObjectManager.getInreturnCashLattersPage();
//		loginpage = textContextSetup.pageObjectManager.getLoginPagePage();
//		incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
	}
	
	@Then("^popup alert check \"([^\"]*)\"$")
    public void popup_alert_check_something(String alert) throws Throwable {
		
		Assert.assertEquals(textContextSetup.genericutils.getAlertText(), alert);
    }

	@When("^user enter process startdate as \"([^\"]*)\"$")
	public void user_enter_process_startdate_as_something(String IRCstartdate) throws Throwable {
	incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		incomingpage.EnterProcessStartDate(IRCstartdate);
	}

	@When("^user click on InreturnCashletters$")
	public void user_click_on_inreturncashletters() throws Throwable {
	 homepage = textContextSetup.pageObjectManager.getHomePage();
		homepage.IR_cashlettrs_Click();
	}

	@When("^user enter max result details as \"([^\"]*)\"$")
	public void user_enter_max_result_details_as_something(String resultExp) throws Throwable {
		 incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		incomingpage.EnterMaxResult(resultExp);
	}

	@When("^user click on Cashlettrs$")
	public void user_click_on_cashlettrs() throws Throwable {
		 IRcashlettr = textContextSetup.pageObjectManager.getInreturnCashLattersPage();
		IRcashlettr.IBR_Cashlettr();
	}
	 @When("^user enter amount as \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enter_amount_as_something_and_something(String amountfrom, String amountto) throws Throwable {
		 IRcashlettr = textContextSetup.pageObjectManager.getInreturnCashLattersPage();
		 IRcashlettr.EnterRCAmountDeatils(amountfrom, amountto);
	    }

	@Then("^opertaor field changes to \"([^\"]*)\"$")
    public void opertaor_field_changes_to_something(String dropcheck) throws Throwable {
		 IRcashlettr = textContextSetup.pageObjectManager.getInreturnCashLattersPage();
		Assert.assertEquals(IRcashlettr.getDropText(), dropcheck);
    }

	@When("^user nevigate to back page$")
	public void user_nevigate_back_to_inreturn_cashletter_page() throws Throwable {
		textContextSetup.genericutils.navigateback();
	}

	@When("^user enter process date from \"([^\"]*)\" to \"([^\"]*)\"$")
	public void user_enter_process_date_from_something_to_something(String startdate, String stenddate) throws Throwable {
		 incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		incomingpage.EnterProcessDate(startdate, stenddate);
	}
	
	 @Then("^verify result list is scrollable$")
	    public void verify_result_list_is_scrollable() throws Throwable {
		IRcashlettr = textContextSetup.pageObjectManager.getInreturnCashLattersPage();
			Assert.assertTrue(IRcashlettr.scrollcheck());
	    }
	 @When("^user enter startdate as (.+)$")
	    public void user_enter_startdate_as(String inputdate) throws Throwable {
		    incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
			incomingpage.EnterStartdatefield(inputdate);
	    }

	    @Then("^verify auto generated date formate as (.+)$")
	    public void verify_auto_generated_date_formate_as(String date) throws Throwable {
	    	IRcashlettr = textContextSetup.pageObjectManager.getInreturnCashLattersPage();
			Assert.assertEquals(IRcashlettr.verify_date_Field(), date);
	    }
	   
	    @Then("^verify coloum heading should scroll with the items by pages$")
	    public void verify_coloum_heading_should_scroll_with_the_items_by_pages() throws Throwable {
	    	IRcashlettr = textContextSetup.pageObjectManager.getInreturnCashLattersPage();
	    	Assert.assertTrue(IRcashlettr.verifycolomHeadings());
	    }
	    
	    @Then("^Check the additional buttons available outside the result screen$")
	    public void check_the_additional_buttons_available_outside_the_result_screen() throws Throwable {
	    	IRcashlettr = textContextSetup.pageObjectManager.getInreturnCashLattersPage();
	    	Assert.assertTrue(IRcashlettr.checkbutton());
	    }
	    
	    @Then("^verify selected item remain highlighted as user move from view to view$")
	    public void verify_selected_item_remain_highlighted_as_user_move_from_view_to_view() throws Throwable {
	        
	    }
	  }
