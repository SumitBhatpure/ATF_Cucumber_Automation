package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;
	public InreturnCashLattersPage IRcashlettr;
	public IncomingPage incomingpage;
	public InBoundReturnsPage IBReturn;
	public OutboundReturnCashlettesPage OutboundReturnCashlettesPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public IncomingPage getIncomingPage() {
		incomingpage = new IncomingPage(driver);
		return incomingpage;
	}
	
	public InreturnCashLattersPage getInreturnCashLattersPage() {
		IRcashlettr = new InreturnCashLattersPage(driver);
		return IRcashlettr;
	}
	public InBoundReturnsPage getInBoundReturnsPage() {
		IBReturn = new InBoundReturnsPage(driver);
		return IBReturn;
	}

	public HomePage getHomePage() {
		homepage = new HomePage(driver);
		return homepage;
	}
	
	public LoginPage getLoginPagePage() {
		loginpage = new LoginPage(driver);
		return loginpage;
	}
	
	public OutboundReturnCashlettesPage getOutboundReturnCashlettesPage() {
		OutboundReturnCashlettesPage = new OutboundReturnCashlettesPage(driver);
		return OutboundReturnCashlettesPage;
	}

}
