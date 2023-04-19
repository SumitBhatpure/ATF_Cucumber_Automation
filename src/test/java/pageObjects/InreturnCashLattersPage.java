package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Utils.GenericUtils;
import Utils.TestBase;



public class InreturnCashLattersPage {
	public WebDriver driver;

	public InreturnCashLattersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "RCAmount_from")
	private WebElement amountfromfield;

	@FindBy(name = "RCAmount_to")
	private WebElement RCAmount_tofield;

	@FindBy(name = "RCSourceId_from")
	private WebElement RCSourceId_fromfield;

	@FindBy(name = "RCSourceId_to")
	private WebElement RCSourceId_tofield;
	
	@FindBy(name = "searchAll")
	private WebElement CashLetter;
	
	@FindBy(name = "ProcessDate_oper")
	private WebElement processdatedrop;
	
	@FindBy(xpath = "//tr[@class=\"columnHeader\"][3]")
	private WebElement scroll;
	
	public boolean scrollcheck() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement LastElement = scroll;
		js.executeScript("arguments[0].scrollIntoView();", LastElement);
		boolean flag = false;
		if (LastElement.isDisplayed() == true) {
			System.out.println("List is Scrollable");
			flag = true;
		}
		return flag;
	}
	
	public String getDropText() {
		GenericUtils gen=new GenericUtils(driver);
		gen.SwitchFrames(1);
		Select S2 = new Select(processdatedrop);
		String msgDrop = S2.getFirstSelectedOption().getText();
		return msgDrop;
	}

	public WebDriver IBR_Cashlettr() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		CashLetter.click();
		return driver;
	}

	public WebDriver EnterRCAmountDeatils(String RCamountFrom, String RCamountlNoTo) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		amountfromfield.sendKeys(RCamountFrom);
		RCAmount_tofield.sendKeys(RCamountlNoTo);
		return driver;
	}

	public WebDriver EnterRCSourceIDDeatils(String RCSourceIDFrom, String RCSourceIDTo) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		RCSourceId_fromfield.sendKeys(RCSourceIDFrom);
		RCSourceId_tofield.sendKeys(RCSourceIDTo);
		return driver;
	}
	
	public String verify_date_Field() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		String Datecheck=driver.findElement(By.xpath("//table[@class=\"contentBody\"]//tr[3]//td[2]")).getText();
		return Datecheck;
	}
	
	public boolean verifycolomHeadings() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scroll(0,1000)", "");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		List<WebElement> headercheck = driver.findElements(By.xpath("//tr[@class=\"columnHeader\"]"));
		boolean dataStatus = false;
		for (WebElement ele : headercheck) {
			String value = ele.getText();
			if (value.contains("Process Date Ltr Seq Source Id Source Description Amount Item Count")) {
				dataStatus = true;
			}
			
		}
		return dataStatus;
	}
	public boolean checkbutton() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		List<WebElement> buttoncheck = driver.findElements(By.xpath("//tr[@class=\"topbody\"]//tr[14]/td"));
		boolean dataStatus = false;
		for (WebElement ele : buttoncheck) {
			boolean value = ele.isDisplayed();
			if (value == true) {
				dataStatus = true;
			}
	}
		return dataStatus;
	}
	
	public void verifySelectedItemViewtoView() {
		
		
	}
}
