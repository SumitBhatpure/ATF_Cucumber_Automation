package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.GenericUtils;
import Utils.TestBase;

public class IncomingPage {
	public WebDriver driver;

	public IncomingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "ProcessDate_from")
	private WebElement processdatefrom;

	@FindBy(name = "ProcessDate_to")
	private WebElement processdateto;

	@FindBy(name = "MaxResults")
	private WebElement maxresult;

	@FindBy(name = "Amount_from")
	private WebElement amountfrom;

	@FindBy(name = "Amount_to")
	private WebElement amountto;

	@FindBy(name = "AccountNumber_from")
	private WebElement accountnofrom;

	@FindBy(name = "AccountNumber_to")
	private WebElement AccountNumber_to;

	@FindBy(name = "searchAll")
	private WebElement searchfield;

	@FindBy(xpath = "//td[@class=\"MainInverse\"]")
	private WebElement Searchresult;

	@FindBy(name = "DifferenceAmount_from")
	private WebElement diferanceamtfrom;

	@FindBy(name = "DifferenceAmount_to")
	private WebElement diferanceamtto;

	@FindBy(name = "ItemNumber_from")
	private WebElement seqnofrom;

	@FindBy(name = "ItemNumber_to")
	private WebElement seqnoto;

	@FindBy(name = "SerialNumber_from")
	private WebElement checknofrom;

	@FindBy(name = "SerialNumber_to")
	private WebElement checknoto;

	@FindBy(name = "RoutingTransit_from")
	private WebElement routintrasfrom;

	@FindBy(name = "RoutingTransit_to")
	private WebElement routintrasto;

	@FindBy(name = "RoutingTransit_oper")
	private WebElement routintrasDrop;
	
	
	@FindBy(name = "ProcessDate_oper")
	private WebElement ProcessDate_Drop;

	public WebDriver EnterRoutineTrasiteDeatils(String RoutineTrasiteFrom, String RoutineTrasiteTo) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		routintrasfrom.sendKeys(RoutineTrasiteFrom);
		routintrasto.sendKeys(RoutineTrasiteTo);
		return driver;
	}

	public WebDriver EnterCheckNoDeatils(String SerialNoFrom, String SerialNoTo) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		checknofrom.sendKeys(SerialNoFrom);
		checknoto.sendKeys(SerialNoTo);
		return driver;
	}

	public WebDriver EnterSequenceNoDeatils(String SequenceNoFrom, String SequenceNoTo) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		seqnofrom.sendKeys(SequenceNoFrom);
		seqnoto.sendKeys(SequenceNoTo);
		return driver;
	}

	public WebDriver EnterDiffAmountDeatils(String DiffAccountFrom, String DiffAccountTo) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		diferanceamtfrom.sendKeys(DiffAccountFrom);
		diferanceamtto.sendKeys(DiffAccountTo);
		return driver;
	}

	public String SearchResult() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		return Searchresult.getText();
	}

	public WebDriver EnterAccountDeatils(String AccountFrom, String AccountTo) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		accountnofrom.sendKeys(AccountFrom);
		AccountNumber_to.sendKeys(AccountTo);
		return driver;
	}

	public WebDriver SeachAll() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		searchfield.click();
		return driver;
	}

	public WebDriver EnterProcessStartDate(String DateFrom) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		processdatefrom.sendKeys(DateFrom);
		return driver;
	}

	public WebDriver EnterProcessDate(String DateFrom, String DateTo) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		processdatefrom.sendKeys(DateFrom);
		processdateto.sendKeys(DateTo);
		return driver;
	}

	public WebDriver EnterStartdatefield(String DateFrom) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		processdatefrom.sendKeys(DateFrom);
		return driver;
	}

	public WebDriver EnterAmountDeatils(String AmountFrom, String AmountTo) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		amountfrom.sendKeys(AmountFrom);
		amountto.sendKeys(AmountTo);
		return driver;
	}

	public WebDriver EnterMaxResult(String i) throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		maxresult.clear();
		maxresult.sendKeys(i);
		return driver;
	}

	public String verifydropText() throws InterruptedException {
		GenericUtils gen=new GenericUtils(driver);
		Thread.sleep(2000);
		gen.SwitchFrames(1);
 String text1=gen.selectdropdwonText(routintrasDrop);
return text1;
	
	}
	
	public String verifyProcessDatedropText() throws InterruptedException {
		GenericUtils gen=new GenericUtils(driver);
		Thread.sleep(2000);
		gen.SwitchFrames(1);
 String text1=gen.selectdropdwonText(ProcessDate_Drop);
return text1;
	
	}
	
	public boolean verifyIncomingFields(String Element) {
		GenericUtils gen = new GenericUtils(driver);
		gen.SwitchFrames(1);
		boolean flag=false;
		if (Element.equalsIgnoreCase("date")) {
			String Attributevalue=processdateto.getText();
			System.out.println("......."+Attributevalue);
			if(Attributevalue.isEmpty()) {
				 flag=true;
			}
		}
		return flag;
	}
}
