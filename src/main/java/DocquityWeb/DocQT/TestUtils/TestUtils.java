package DocquityWeb.DocQT.TestUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Function;
import com.google.common.io.Files;
import DocquityWeb.DocQT.Page.Log;
import net.bytebuddy.utility.RandomString;

/**
 * @author SarabjitSingh
 *
 */
public class TestUtils {

	public static int PAGE_LOAD_TIMEOUT = 100;
	public static int IMPLICIT_WAIT = 30;
	private static final Logger LOGGER = LogManager.getLogger(TestUtils.class);

	public static void performRightClick(WebElement element, WebDriver driver) {
		Log.debug("Trying to perform right click", LOGGER);
		Actions actions = new Actions(driver);
		WebElement elementLocator = element;
		actions.contextClick(elementLocator).perform();
	}

	public static void performEnterAction(WebDriver driver) {
		Log.debug("Trying to perform Enter Action", LOGGER);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
	}

	public static void performAcceptAlert(WebDriver driver) {
		Log.debug("Trying to accept alert", LOGGER);
		driver.switchTo().alert().accept();
	}

	public static void refresh(WebDriver driver) {
		Log.debug("Trying to refresh the Page", LOGGER);
		driver.navigate().refresh();
	}

	public static void back(WebDriver driver) {
		Log.debug("Trying to back the Page", LOGGER);
		driver.navigate().back();
	}

	public static void performAcceptChildBrowser(WebDriver driver) {
		Log.debug("Trying to accept Child Browser", LOGGER);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
	}

	public static void performChildBrowser(WebDriver driver) {
		String parentHandle = driver.getWindowHandle();
		Set<String> allWindowHandle = driver.getWindowHandles();
		for (String currentHandle : allWindowHandle) {
			System.out.println("Current Window handle is" + currentHandle);
			if (!currentHandle.equalsIgnoreCase(parentHandle)) {
				driver.switchTo().window(currentHandle);
			}
		}
	}

	public static void performScrollTillElement(WebDriver driver, WebElement element) {
		Log.debug("Trying to Perform Scroll Till Element", LOGGER);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
	}

	public static void performScrollUpTillElement(WebDriver driver, WebElement element) {
		Log.debug("Trying to Perform Scroll Till Element", LOGGER);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_UP).build().perform();

	}

	public static WebElement waitForVisibilityOf(WebDriver driver, WebElement element) {
		TestUtils.ThreadSleep(00);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}

	public static WebElement waitShortTimeForVisibility(WebDriver driver, WebElement element, int time) {
		Log.debug("Waiting for element to be visible", LOGGER);
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}

	public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement element) {
		Log.debug("Waiting for element to be clickable ", LOGGER);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}

	public static void waitTillAlertIsPresent(WebDriver driver) {
		Log.debug("Waiting for alert to be present ", LOGGER);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void waitForElementToBeInvisible(WebDriver driver, WebElement element) {
		Log.debug("Waiting for element to be invisible", LOGGER);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public static void calculatePageLoadTime(WebDriver driver) {
		Log.debug("Calculating the page load time", LOGGER);
		double loadTime = 0;
		WebDriverWait wait = new WebDriverWait(driver, 50);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// time of the process of navigation and page load
		loadTime = (Double) js.executeScript(
				"return (window.performance.timing.loadEventEnd - window.performance.timing.navigationStart) / 1000");
		Log.info("Page load time calculated in seconds is " + loadTime, LOGGER);
	}

	public static void moveToElement(WebDriver driver, WebElement element) {
		Log.debug("Moving to element", LOGGER);
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
	}

	public static void scrollTillElementIsVisible(WebDriver driver, WebElement element) {
		Log.debug("Scroll till element is visible", LOGGER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void uploadFile(WebDriver driver, WebElement element, final String fileName) {
		Log.debug("Trying to upload the file - " + fileName, LOGGER);
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\TestUploadFiles\\" + fileName;
		System.out.println("path*****" + path);
		waitForElementToBeClickable(driver, element);
		// file path passed as parameter to StringSelection
		StringSelection ss = new StringSelection(path);
		// Clipboard copy
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		// Robot Object Creation
		try {
			Robot r = new Robot();
			r.delay(2000);
			// pressing enter
			r.keyPress(KeyEvent.VK_ENTER);
			// releasing enter
			r.keyRelease(KeyEvent.VK_ENTER);
			// pressing ctrl+v
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			// releasing ctrl+v
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			// pressing enter
			r.keyPress(KeyEvent.VK_ENTER);
			// releasing enter
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void clickElementUsingJavaScriptExecutor(WebDriver driver, WebElement element) {
		Log.debug("Trying to click element using JavaScript Executor", LOGGER);
		waitForVisibilityOf(driver, element);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public static String currentDate() {
		Log.debug("Returning the current date", LOGGER);
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		return formatter.format(date);
	}

	public static Object[] scrollTillElementIsVisible(final String articleTitle, final List<WebElement> element,
			WebDriver driver) {
		Log.debug("Scrolling till the element is visible", LOGGER);
		Object[] arr = new Object[2];
		int loopStart = 0;
		int summariesAfterScroll = 0;
		arr[0] = false;
		do {
			for (int j = loopStart; j < element.size(); j++) {
				if (element.get(j).getText().equals(articleTitle)) {
					arr[0] = true;
					arr[1] = j;
					break;
				}
			}

			if ((Boolean) arr[0] == false) {
				loopStart = element.size();
				TestUtils.scrollTillNextOffset(driver, element.get(element.size() - 1));
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				summariesAfterScroll = element.size();
			}
		} while (summariesAfterScroll - loopStart > 0 && (Boolean) arr[0] == false);
		return arr;
	}

	public static void scrollTillNextOffset(WebDriver driver, WebElement element) {
		Log.debug("Scroll till next offset", LOGGER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void scrollByPixelSize(WebDriver driver, int PixelSize) {
		Log.debug("Scroll by pixel size", LOGGER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + PixelSize + ")", "");
	}

	public static void scrollUsingJSTillElementIsVisible(WebDriver driver, WebElement element) {
		Log.debug("Scroll till element is visible", LOGGER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void clickUsingDynamicXpath(WebDriver driver, String xpath) {
		Log.debug("Click on the element using dynamic xpath", LOGGER);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath(xpath)));
		}
	}

	public static void scrollTillElmenetIsDisplay(WebDriver driver, WebElement ScrollableElement,
			WebElement ScrollTillElement, int pixelHeight) throws InterruptedException {
		TestUtils.waitForVisibilityOf(driver, ScrollableElement);
		int i = 0;
		do {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0," + pixelHeight + ")", "");
			Thread.sleep(500);
			try {
				if (ScrollTillElement.isDisplayed()) {
					Thread.sleep(500);
					js.executeScript("window.scrollBy(0," + pixelHeight + ")", "");
					break;
				}
			} catch (Exception e) {
				i++;
				if (i == 50) {
					break;
				}
			}
		} while (ScrollableElement.isDisplayed());

	}

	public static String randomString(int numberOfAlphabet) {
		String Alphabet = RandomString.make(numberOfAlphabet);
		return Alphabet;
	}

	public static void ThreadSleep(int wait) {
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static String getConfigData(String key) {
		Properties prop = new Properties();
		FileInputStream fis = null;
		 try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/prod_config.properties"); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String PostURL = prop.getProperty(key);
		return PostURL;
	}

	public static String getCurrentTimeStamp() {
		return Long.toString(System.currentTimeMillis());
	}
}
