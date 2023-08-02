package DocquityWeb.DocQT.Page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import DocquityWeb.DocQT.TestUtils.TestUtils;

/**
 * @author SarabjitSingh
 *
 */
public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private WebDriver driver;
	private static final Logger LOGGER = LogManager.getLogger(LoginPage.class);

	@FindBy(xpath = "//button[text()=' Accept']")
	private WebElement ACCEPT_COOKIES;

	@FindBy(xpath = "//img[contains(@class,'ml-4 cursor-')]")
	private WebElement CANCEL_COOKIES_NOTIFICATION;

	@FindBy(xpath = "//input[@id='mobile_no']")
	private WebElement MOBILE_NUMBER;

	@FindBy(xpath = "//span[@class='c-list']")
	private WebElement COUNTRY_DROPDOWN;

	@FindBy(xpath = "//span[text()='India']")
	private WebElement COUNTRY_INDIA;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement COUNTRY_SEARCH;

	@FindBy(xpath = "//li[@class='pure-checkbox']")
	private WebElement FIRST_COUNTRY;

	@FindBy(xpath = "//div[text()=' +1 ']")
	private WebElement DEFAULT_COUNTRY;

	@FindBy(xpath = "//button[@id='requestOtpClick']")
	private WebElement REQUEST_OTP;

	@FindBy(xpath = "//input[@id='verifyOtp']")
	private WebElement INTER_OTP;

	@FindBy(xpath = "//input[contains(@id, 'otp_0')]") // Need explanation
	private WebElement INTER_OTP_BOX1;

	@FindBy(xpath = "//input[contains(@id, 'otp_1')]") // Need explanation
	private WebElement INTER_OTP_BOX2;

	@FindBy(xpath = "//input[contains(@id, 'otp_2')]") // Need explanation
	private WebElement INTER_OTP_BOX3;

	@FindBy(xpath = "//input[contains(@id, 'otp_3')]") // Need explanation
	private WebElement INTER_OTP_BOX4;

	@FindBy(id = "1")
	private WebElement OTP_TEXTFIELD;

	@FindBy(xpath = "//button[@id='requestOtpClick']")
	private WebElement VERIFY_BTN;

	@FindBy(xpath = "//button[@class='btn btn-success px-4 py-2 cursor-pointer suspicious-activity-button']")
	private WebElement SUBMIT_BTN;

	@FindBy(xpath = "//button[contains(text(),'Okay ')]")
	private WebElement OKAY_BTN;

	@FindBy(xpath = "//p[text()='Your account has temporarily suspended for 30 minutes.'] | //p[text()='Session expired. Please try again']")
	private WebElement SESSION_EXPIRED_OR_TERMINATE;

	public void clickAcceptCookiesButton() {
//		Log.info("Trying to click on the Accept Button", LOGGER);
		TestUtils.waitForElementToBeClickable(driver, ACCEPT_COOKIES).click();
	}

	public void clickOnCancelCookies() {
		Log.info("Trying to click on cancel cookies ", LOGGER);
		TestUtils.waitForVisibilityOf(driver, CANCEL_COOKIES_NOTIFICATION).click();
	}

	public void enterMobileNumber(final String mobileNumber) {
		Log.info("entering the mobile number", LOGGER);
		TestUtils.waitForVisibilityOf(driver, MOBILE_NUMBER).sendKeys(mobileNumber);
	}

	public void clickCountryDropdown() {
		Log.info("Trying to click on country dropdown", LOGGER);
		TestUtils.waitForVisibilityOf(driver, COUNTRY_DROPDOWN).click();
	}

	public void selectCountryIndiaFromDropDown() {
		Log.info("Selecting country from dropdown", LOGGER);
		TestUtils.waitForElementToBeClickable(driver, COUNTRY_INDIA).click();
	}

	public void selectCountryFromDropdown(final String country) {
		Log.info("Selecting country from the dropdown - " + country, LOGGER);
		TestUtils.waitForElementToBeClickable(driver, COUNTRY_SEARCH).sendKeys(country);
		TestUtils.waitForVisibilityOf(driver, FIRST_COUNTRY).click();
	}

	public void clickRequestOTP() {
		Log.info("trying to click on requiest otp button", LOGGER);
		TestUtils.waitForElementToBeClickable(driver, REQUEST_OTP).click();
	}

	public void clickOnVerifyBtn() {
		Log.info("Trying to click on the verify button", LOGGER);
		TestUtils.waitForVisibilityOf(driver, VERIFY_BTN).click();
	}

	public void enterOTP(final String otp1, final String otp2, final String otp3, final String otp4) {
		Log.info("Trying to enter the OTP" + otp1, LOGGER);
		try {
			TestUtils.waitShortTimeForVisibility(driver, INTER_OTP_BOX1, 5).isDisplayed();
			
		} catch (Exception a) {
			try {
				for (int i = 2; i <= 5; i++) {
					if (SESSION_EXPIRED_OR_TERMINATE.isDisplayed()) {
						MOBILE_NUMBER.clear();
						enterMobileNumber("930708090" + i + Keys.ENTER);
						TestUtils.ThreadSleep(3000);
					}
				}
			} catch (Exception b) {
				System.out.println(b);
			}
		} finally {
			TestUtils.waitForVisibilityOf(driver, INTER_OTP_BOX1).sendKeys(otp1);
			TestUtils.waitForVisibilityOf(driver, INTER_OTP_BOX2).sendKeys(otp2);
			TestUtils.waitForVisibilityOf(driver, INTER_OTP_BOX3).sendKeys(otp3);
			TestUtils.waitForVisibilityOf(driver, INTER_OTP_BOX4).sendKeys(otp4);
		}

	}



	public void clickOnSubmitBtn() {
		Log.info("Trying to click on the submit button", LOGGER);
		try {
			Thread.sleep(2000);
			TestUtils.waitForVisibilityOf(driver, SUBMIT_BTN).click();
		} catch (Exception e) {
			TestUtils.waitForVisibilityOf(driver, SUBMIT_BTN).click();
		}
	}

	public void clickOnOkayBtn() throws InterruptedException {
		Log.info("Trying to click on the okay button", LOGGER);
		Thread.sleep(2000);
		TestUtils.waitForVisibilityOf(driver, OKAY_BTN).click();

	}

	public String getMobileNumber() {
		Log.info("Trying to click on the okay button", LOGGER);
		return TestUtils.waitForVisibilityOf(driver, MOBILE_NUMBER).getAttribute("ng-reflect-model");
	}

	public void verifyDefaultUserCountry(String CountryCode) {
		String DefaultCountry = TestUtils.waitForVisibilityOf(driver, COUNTRY_DROPDOWN).getText();
		Assert.assertEquals(DefaultCountry, CountryCode);
	}

	public void loginWithMobileAndCountry(final String number, final String otp1, final String otp2,
			final String otp3, final String otp4, final String country) {
		clickCountryDropdown();
		selectCountryFromDropdown(country);
		enterMobileNumber(number);
		clickRequestOTP();
		enterOTP(otp1, otp2, otp3, otp4);
	}

	@Override
	public LoginPage waitForPage() {
		// TODO Auto-generated method stub
		TestUtils.calculatePageLoadTime(driver);
		return this;
	}

}