package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils {
	public WebDriver driver;

	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public String getcurrentpageTitle() {
		return driver.getTitle();
	}

	public WebDriver SwitchFrames(int num) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(num);
		return driver;
	}

	public void navigateback() {
		driver.navigate().back();
	}

	public String getAlertText() {
		String popupmsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return popupmsg;

	}

	public String getalerttext() {
		String popupmsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return popupmsg;
	}

	public String selectdropdwonText(WebElement element) {

		Select select = new Select(element);
		String text = select.getFirstSelectedOption().getText();
		System.out.println(text);
		return text;
	}
	
	public void selectDropdwon(WebElement element ,String operator) {
		Select select = new Select(element);
		select.selectByValue(operator);
	}
	
	

}
