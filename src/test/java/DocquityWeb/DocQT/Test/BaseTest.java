package DocquityWeb.DocQT.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import DocquityWeb.DocQT.Page.Log;
import DocquityWeb.DocQT.Enums.*;
import DocquityWeb.DocQT.TestUtils.TestUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author yogesh.shinde
 *
 */

public abstract class BaseTest {

	public WebDriver driver;
	public static Properties prop;
	public File folder;
	public String PostURL;
	public String MobileNumber = TestUtils.getConfigData("MobileNumber");
	public String Otp1 = TestUtils.getConfigData("Otp1");
	public String Otp2 = TestUtils.getConfigData("Otp2");
	public String Otp3 = TestUtils.getConfigData("Otp3");
	public String Otp4 = TestUtils.getConfigData("Otp4");
	public String Country = TestUtils.getConfigData("Country");

	// public static ExtentReports extent;
	// public static ExtentTest extentLogger; //helps to generate logs in extent
	// test report
	// public static ExtentHtmlReporter reporter;

	private static final Logger LOGGER = LogManager.getLogger(BaseTest.class);

	public BaseTest() {
		String env = System.getProperty("env", String.valueOf(EnvType.stage));
		if (env.equalsIgnoreCase("stage")) {
			try {
				LOGGER.debug(
						"<br>*******************        Loading Stage Properties File        ****************************");
				prop = new Properties();
				FileInputStream fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\main\\java\\stage_config.properties");
				prop.load(fis);
			} catch (Exception e) {
				e.getMessage();
			}
		} else if (env.equalsIgnoreCase("production")) {
			try {
				LOGGER.debug(
						"<br>*******************        Loading Production Properties File        ****************************");
				prop = new Properties();
				FileInputStream fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\main\\java\\prod_config.properties");
				prop.load(fis);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {

	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		Log.initialiseExtentReport(LOGGER);
	}

	@AfterTest(alwaysRun = true)
	public void tearDownAfterTest() {
		Log.flushExtent(LOGGER);

	}

	@BeforeClass(alwaysRun = true)
	public void initialization() {
		LOGGER.debug("<br>*******************        Initializing Browser       ****************************");
		String browserType = System.getProperty("browserType", String.valueOf(BrowserType.locale));
		String browserName = System.getProperty("browserName", String.valueOf(BrowserName.chrome));
		initWebDriver(browserType, browserName);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		PostURL = prop.getProperty("url");
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(Method method) {
		Log.extentLogger = Log.extent.createTest(method.getName());
		LOGGER.debug("<br>****************************************************************************************");
		LOGGER.debug("<br>****************************************************************************************");
		LOGGER.debug("<br>$$$$$$$$$$$$$$$$$$$$              " + method.getName() + "       $$$$$$$$$$$$$$$$$$$$$$$");
		LOGGER.debug("<br>****************************************************************************************");
		LOGGER.debug("<br>****************************************************************************************");
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(Method method, ITestResult result) throws IOException {
		Log.afterMethodLogResult(method, result, driver);
		LOGGER.debug(
				"<br>XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");
		LOGGER.debug("<br>X");
		LOGGER.debug("<br>X");
		LOGGER.debug("<br>X");

	}

	@AfterClass(alwaysRun = true)
	public void afterMainClass() {
		LOGGER.debug("*******************    Driver Quit    *********************************");
		driver.quit();
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		LOGGER.debug("******************    Executing After Suites   ********************************");
		// EmailTestReportUtilities.SendMailSSLWithTestReport();
	}

	public void initWebDriver(final String browserType, final String browserName) {
		if (browserType.equalsIgnoreCase("locale")) {
			switch (browserName) {
			case "chrome":
				LOGGER.debug("<br>*******************        Opening Chrome Browser       ***************************");
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				options.addArguments("--disable-blink-features=AutomationControlled");
				options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
				options.addArguments("--incognito");
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				driver = new ChromeDriver(options);
				break;
			case "firefox":
				LOGGER.debug(
						"<br>*******************        Opening Firefox Browser       ***************************");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "ie":
				LOGGER.debug("<br>*******************        Opening IE Browser       ***************************");
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
			case "safari":
				LOGGER.debug("<br>*******************        Opening IE Browser       ***************************");
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
			default:
				throw new IllegalStateException("Invalid browser name: " + browserName);
			}
		}

		if (browserType.equalsIgnoreCase("remote")) {
			switch (browserName) {
			case "chrome":
				LOGGER.debug(
						"<br>*******************        Opening Remote Chrome Browser       ***************************");
				ChromeOptions browserOptions = new ChromeOptions();
				HashMap<String, Object> ltOptions = new HashMap<String, Object>();
				ltOptions.put("video", true);
				ltOptions.put("build", "DocquityWeb");
				ltOptions.put("project", "WebAutomation");
				ltOptions.put("name", "SampleTest");
				ltOptions.put("selenium_version", "4.1.2");
				ltOptions.put("w3c", true);
				browserOptions.setCapability("LT:Options", ltOptions);
				try {
					driver = new RemoteWebDriver(new URL(
							"https://abhishek.pandey:GnuOtUJXnhPjTadeHtyIOMgVj6krMlE7mDGpCXwjbHkZAV3inQ@hub.lambdatest.com/wd/hub"),
							browserOptions);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				break;
			case "firefox":
				LOGGER.debug(
						"<br>*******************        Opening Remote Firefox Browser       ***************************");
				FirefoxOptions ff_browserOptions = new FirefoxOptions();
				HashMap<String, Object> ff_ltOptions = new HashMap<String, Object>();
				ff_ltOptions.put("username", "abhishek.pandey");
				ff_ltOptions.put("accessKey", "GnuOtUJXnhPjTadeHtyIOMgVj6krMlE7mDGpCXwjbHkZAV3inQ");
				ff_ltOptions.put("video", true);
				ff_ltOptions.put("build", "DocquityWeb");
				ff_ltOptions.put("project", "WebAutomation");
				ff_ltOptions.put("w3c", true);
				ff_browserOptions.setCapability("LT:Options", ff_ltOptions);
				try {
					driver = new RemoteWebDriver(new URL(
							"https://abhishek.pandey:GnuOtUJXnhPjTadeHtyIOMgVj6krMlE7mDGpCXwjbHkZAV3inQ@hub.lambdatest.com/wd/hub"),
							ff_browserOptions);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				break;
			case "ie":
				LOGGER.debug(
						"<br>*******************        Opening Remote IE Browser       ***************************");
				InternetExplorerOptions ie_browserOptions = new InternetExplorerOptions();
				HashMap<String, Object> ie_ltOptions = new HashMap<String, Object>();
				ie_ltOptions.put("username", "abhishek.pandey");
				ie_ltOptions.put("accessKey", "GnuOtUJXnhPjTadeHtyIOMgVj6krMlE7mDGpCXwjbHkZAV3inQ");
				ie_ltOptions.put("video", true);
				ie_ltOptions.put("build", "DocquityWeb");
				ie_ltOptions.put("project", "WebAutomation");
				ie_ltOptions.put("w3c", true);
				ie_browserOptions.setCapability("LT:Options", ie_ltOptions);
				try {
					driver = new RemoteWebDriver(new URL(
							"https://abhishek.pandey:GnuOtUJXnhPjTadeHtyIOMgVj6krMlE7mDGpCXwjbHkZAV3inQ@hub.lambdatest.com/wd/hub"),
							ie_browserOptions);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				break;
			case "safari":
				LOGGER.debug(
						"<br>*******************        Opening Remote Safari Browser       ***************************");
				SafariOptions safari_browserOptions = new SafariOptions();
				HashMap<String, Object> safari_ltOptions = new HashMap<String, Object>();
				safari_ltOptions.put("username", "abhishek.pandey");
				safari_ltOptions.put("accessKey", "GnuOtUJXnhPjTadeHtyIOMgVj6krMlE7mDGpCXwjbHkZAV3inQ");
				safari_ltOptions.put("video", true);
				safari_ltOptions.put("build", "DocquityWeb");
				safari_ltOptions.put("project", "WebAutomation");
				safari_ltOptions.put("w3c", true);
				safari_browserOptions.setCapability("LT:Options", safari_ltOptions);
				try {
					driver = new RemoteWebDriver(new URL(
							"https://abhishek.pandey:GnuOtUJXnhPjTadeHtyIOMgVj6krMlE7mDGpCXwjbHkZAV3inQ@hub.lambdatest.com/wd/hub"),
							safari_browserOptions);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				break;
			default:
				throw new IllegalStateException("Invalid browser name: " + browserName);
			}
		}
	}
}
