package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.GenericUtils;
import Utils.TextContextSetup;


public class OutboundReturnCashlettesPage {
	public WebDriver driver;

	public OutboundReturnCashlettesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "RCAmount_from")
	private WebElement RCAmount_from;

	@FindBy(name = "RCAmount_to")
	private WebElement RCAmount_to;

	@FindBy(name = "RCAmount_oper")
	private WebElement RCAmount_Drop;

	@FindBy(name = "RCEndpointNumber_from")
	private WebElement RCEndpointNumber_from;

	@FindBy(name = "RCEndpointNumber_to")
	private WebElement RCEndpointNumber_to;

	@FindBy(name = "RCEndpointNumber_oper")
	private WebElement RCEndpointNumber_Drop;

	@FindBy(name = "RCAdviceNumber_oper")
	private WebElement RCAdviceNumber_drop;

	@FindBy(name = "RCAdviceNumber_from")
	private WebElement RCAdviceNumber_from;

	@FindBy(name = "RCAdviceNumber_to")
	private WebElement RCAdviceNumber_to;
	
	public WebDriver EnterEndpointdetails(String OBendpointFrom, String OBEndpointTo) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		RCEndpointNumber_from.sendKeys(OBendpointFrom);
		RCEndpointNumber_to.sendKeys(OBEndpointTo);
		return driver;
	}

	public WebDriver EnterOBamountdetails(String OBamountFrom, String OBamountlNoTo) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		RCAmount_from.sendKeys(OBamountFrom);
		RCAmount_to.sendKeys(OBamountlNoTo);
		return driver;
	}

	public String dropcheck() {
		GenericUtils gen = new GenericUtils(driver);
		gen.SwitchFrames(1);
		String text1 = gen.selectdropdwonText(RCAmount_Drop);
		return text1;
	}
	
	public void SelectdropDownOption(String operator){
		GenericUtils gen = new GenericUtils(driver);
		gen.SwitchFrames(1);
		gen.selectDropdwon(RCAmount_Drop, operator);
	}
	
	public boolean verifyUpperField() {
		GenericUtils gen = new GenericUtils(driver);
		gen.SwitchFrames(1);
		
		String Attributevalue=RCAmount_to.getText();
		System.out.println(Attributevalue);
		boolean flag=false;
		if(Attributevalue.isEmpty()) {
			 flag=true;
		}
		return flag;
	}
	
	public boolean verifyTest(String Element) {
		GenericUtils gen = new GenericUtils(driver);
		gen.SwitchFrames(1);
		boolean flag=false;
		if (Element.equalsIgnoreCase("amountField")) {
			String Attributevalue=RCAmount_to.getText();
			System.out.println("......."+Attributevalue);
			if(Attributevalue.isEmpty()) {
				 flag=true;
			}
		}if(Element.equalsIgnoreCase("endpointnumbr")) {
			String Attributevalue=RCEndpointNumber_to.getText();
			if(Attributevalue.isEmpty()) {
				 flag=true;
			}
		}if(Element.equalsIgnoreCase("adviceNo")) {
			String Attributevalue=RCAdviceNumber_to.getText();
			if(Attributevalue.isEmpty()) {
				 flag=true;
			}
		}
		return flag;
		
	}
	
	public boolean checkuniquelyTitledResult() throws InterruptedException {
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		List<WebElement> titleFieldcheck = driver.findElements(By.xpath("//table//tr[@class=\"columnHeader\"][1]"));
		boolean dataStatus= false;
		for (WebElement ele : titleFieldcheck) {
			String value = ele.getText();
			String s1[] = value.split(" ");
			System.out.println(s1.length);
			for (int i = 0; i < s1.length - 1; i++) {
				for (int j = i + 1; j < s1.length; j++) {
					if (s1[i] != s1[j]) {
						dataStatus = true;
					}
				}
			}
		}
		return dataStatus;
	}
}
