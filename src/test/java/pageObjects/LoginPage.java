package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.TestBase;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='j_username']")
	private WebElement usernamefield;

	@FindBy(xpath = "//input[@name='j_password']")
	private WebElement Passwordfield;

	@FindBy(xpath = "//input[@name='action']")
	private WebElement submitfield;

	@FindBy(xpath = "//input[@name='reset']")
	private WebElement clearfield;

	@FindBy(xpath = "//td[@class=\"mainError\"]")
	private WebElement errormessage;

	public String LoginErrorText() {
		String errortext = errormessage.getText();
		return errortext;
	}

	public WebDriver loginMethod(String un, String pwd) {
		usernamefield.sendKeys(un);
		Passwordfield.sendKeys(pwd);
		submitfield.click();
		return driver;
	}

}
