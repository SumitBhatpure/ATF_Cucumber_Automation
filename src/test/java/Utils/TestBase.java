package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	public WebDriver driver;
	public Properties prop;

	public WebDriver Setup() throws IOException {
		// properties file
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\Utils\\ATFdata.properties");
		prop.load(fis);

		if (driver == null) {
			// browser selection
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\chromedriver.exe");
				ChromeOptions opts = new ChromeOptions();
				opts.setAcceptInsecureCerts(true);
				driver = new ChromeDriver(opts);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get(prop.getProperty("site"));
			} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				// need to add exe file and path for firefox
				System.setProperty("webdriver.geco.driver", "F:\\\\Workspace_Sumit\\\\chromedriver.exe\"");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get(prop.getProperty("site"));
			} else if (prop.getProperty("browser").equalsIgnoreCase("ie")) {
				// need to add exe file and path for geco
				System.setProperty("webdriver.geco.driver", "F:\\\\Workspace_Sumit\\\\chromedriver.exe\"");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get(prop.getProperty("site"));
			}
		}
		return driver;

	}

}
