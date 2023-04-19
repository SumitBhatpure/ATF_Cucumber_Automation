package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utils.TestBase;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// @FindBy(xpath="")
	// private WebElement ;

	@FindBy(xpath = "//a[normalize-space()='Incoming']")
	private WebElement incominglick;

	@FindBy(xpath = "//a[normalize-space()='Logoff']")
	private WebElement logoutfield;

	@FindBy(xpath = "// a[normalize-space()='InReturn C/Ls']")
	private WebElement IRCclick;
	
	@FindBy(xpath = "//a[normalize-space()='Inbound Returns']")
	private WebElement IBR_click;

	@FindBy(xpath = "//a[normalize-space()='OutReturn C/Ls']")
	private WebElement OutbondCL_click;
	
	public WebDriver OutbondCL_click() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		OutbondCL_click.click();
		return driver;
	}
	
	public WebDriver IR_cashlettrs_Click() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		IRCclick.click();
		return driver;
	}

	public String verifyhomepageTitle() {
		return driver.getTitle();
	}

	public WebDriver incomming_Click() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		incominglick.click();
		return driver;
	}

	public WebDriver InboundReturn_Click() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		IBR_click.click();
		return driver;
	}
	public WebDriver logout_Click() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		logoutfield.click();
		return driver;
	}
}
