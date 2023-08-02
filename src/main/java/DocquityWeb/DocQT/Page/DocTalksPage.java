package DocquityWeb.DocQT.Page;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Function;
import DocquityWeb.DocQT.TestUtils.TestUtils;

public class DocTalksPage extends BasePage {

	public static SoftAssert sf;
	private WebDriver driver;
	private static final Logger LOGGER = LogManager.getLogger(DocTalksPage.class);

	public DocTalksPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "searchBox")
	private WebElement SEARCH_BAR;

	@FindBy(xpath = "//h4[@data-testid='data-testId-doc-talks-list-heading-24']")
 	private WebElement DOCTALKS_NAME_TEXT;
	
	@FindBy(xpath = "//b[@data-testid='data-testId-doc-talks-section-heading-features_videos-24']")
 	private WebElement FEATURED_VIDEOS_TEXT;
	
	@FindBy(xpath = "//span[@data-testid='data-testId-doc-talks-section-view-all-features_videos-24']")
 	private WebElement FEATURED_VIDEOS_VIEW_ALL_BUTTON;
	
	@FindBy(xpath = "//div[@class='bg-white p-3 rounded mb-2 ng-star-inserted']//h4")
	private WebElement FEATURED_VIDEOS_HEADER_TITLE;
	
	@FindBy(xpath = "//p[@class='float-left mt-2 text-very-dark']//b[text()='Top Speakers']")
 	private WebElement TOP_SPEAKERS_TEXT;
	
	@FindBy(xpath = "//span[@data-testid='data-testId-doc-talks-section-view-all-top_speakers-24']")
 	private WebElement TOP_SPEAKERS_VIEW_ALL_BUTTON;
	
	@FindBy(xpath = "//div[@class='bg-white p-3 rounded mb-2 ng-star-inserted']//h4[text()='Top Speakers']")
 	private WebElement TOP_SPEAKERS_TITLE;
	
	@FindBy(xpath = "//b[@data-testid='data-testId-doc-talks-section-heading-speciality-24']")
 	private WebElement SPECIALITIES_TEXT;
	
	@FindBy(xpath = "//span[@data-testid='data-testId-doc-talks-section-view-all-speciality-24']")
 	private WebElement SPECIALITIES_VIEW_ALL_BUTTON;
	
	@FindBy(xpath = "//div[@class='bg-white p-3 rounded mb-2 ng-star-inserted']//h4")
	private WebElement SPECIALITIES_HEADER_TITLE;
			
	@FindBy(xpath = "//b[@data-testid='data-testId-doc-talks-section-heading-user_speciality-24']")
	private WebElement CARDIOLOGY_VIDEOS_FOR_YOU_TEXT;
	
	@FindBy(xpath = "//span[@data-testid='data-testId-doc-talks-section-view-all-user_speciality-24']")
	private WebElement CARDIOLOGY_VIDEOS_TEXT_VIEW_ALL_BUTTON;
	
	@FindBy(xpath = "//div[@class='bg-white p-3 rounded mb-2 ng-star-inserted']//h4")
	private WebElement CARDIOLOGY_VIDEOS_FOR_YOU_HEADER_TITLE;
	
	@FindBy(xpath = "//b[@data-testid='data-testId-doc-talks-section-heading-doctalks_series-24']")
 	private WebElement SERIES_TEXT;
	
	@FindBy(xpath = "//span[@data-testid='data-testId-doc-talks-section-view-all-doctalks_series-24']")
    private WebElement SERIES_TEXT_VIEW_ALL_BUTTON;
	
	@FindBy(xpath = "//div[@class='bg-white p-3 rounded mb-2 ng-star-inserted']//h4")
	private WebElement SERIES_TEXT_HEADER_TITLE;
	
	@FindBy(xpath = "(//div[@class='col-12 pr-0'])[9]/p/b")
 	private WebElement SERIES_NAME;
 
 	@FindBy(xpath = "(//div[@class='cursor-pointer col-12'])[8]/p[1]/span")
 	private WebElement SERIES_SPECIALITY;
 
 	@FindBy(xpath = "(//div[@class='cursor-pointer col-12'])[8]/p[2]/span")
 	private WebElement SERIES_VIEWS_COUNT;
 
 	@FindBy(xpath = "(//div[@class='col-2 p-0 text-right'])[9]/app-ngb-drop-down/span/span")
 	private WebElement SERIES_REPORT_SHARE_ICON;
 
 	@FindBy(xpath = "(//div[contains(@class,'common-dropdown-')])[9]/div[1]/a")
 	private WebElement SERIES_REPORT_TEXT;
 
 	@FindBy(xpath = "(//div[contains(@class,'common-dropdown-')])[9]/div[2]/a")
 	private WebElement SERIES_SHARE_TEXT;
 
	@FindBy(xpath = "//span[@data-testid='data-testId-doc-talks-detail-title-0']")
	private WebElement DACTALKS_TITLE;

	@FindBy(xpath = "//div[@class='row']/div/p/b")
	private List<WebElement> DOCTALKS_FEATURED_VIDEOS_NAME;

	@FindBy(xpath = "//b[@data-testid='data-testId-doc-talks-detail-title-81']")
	private WebElement SERIES_HEADER_TITLE_NAME;

	@FindBy(xpath = "//span[@data-testid='data-testId-doc-talks-detail-views-81']")
	private WebElement SERIES_VIDEO_VIEWS;

	@FindBy(xpath = "//span[text()='Likes']")
	private WebElement SERIES_LIKES_COUNT;

	@FindBy(xpath = "//p[@data-testid='data-testId-doc-talks-detail-description-81']")
	private WebElement SERIES_DETAILS_TEXT;

	@FindBy(xpath = "(//span[@data-testid='data-testId-doc-talks-detail-speciality-81'])[1]")
	private WebElement SERIES_FIRST_SPECIALITY;

	@FindBy(xpath = "(//span[@data-testid='data-testId-doc-talks-detail-speciality-81'])[2]")
	private WebElement SERIES_SECOND_SPECIALITY;

	@FindBy(xpath = "(//span[@data-testid='data-testId-doc-talks-detail-speciality-81'])[3]")
	private WebElement SERIES_THIRD_SPECIALITY;

	@FindBy(xpath = "(//span[@data-testid='data-testId-doc-talks-detail-speciality-81'])[4]")
	private WebElement SERIES_FOURTH_SPECIALITY;

	@FindBy(xpath = "//p[@data-testid='data-testId-doc-talks-detail-speakers-detail-label-81']")
	private WebElement SERIES_SPEAKER_DETAILS_TEXT;

	@FindBy(xpath = "(//div[@class='d-table-cell align-middle']//p)[1]")
	private WebElement SERIES_SPEAKER_DETAILS_FIRST_NAME;

	@FindBy(xpath = "(//div[@class='d-table-cell align-middle']//p)[2]")
	private WebElement SERIES_SPEAKER_DETAILS_SECOND_NAME;

	@FindBy(xpath = "//button[@data-testid='data-testId-doc-talks-detail-play-episode-button-81']//span")
	private WebElement SERIES_PLAY_EPISODE_NOW_BUTTON;

	@FindBy(xpath = "//button[@class='position-absolute close']")
	private WebElement PLAY_EPISODE_NOW_CLOSE_BUTTON;

	@FindBy(xpath = "//span[text()='Liked']")
	private WebElement SERIES_LIKED_BUTTON;

	@FindBy(xpath = "//span[@data-testid='data-testId-doc-talks-detail- bookmark-button-81']//span")
	private WebElement SERIES_BOOKMARKED_ICON;

	@FindBy(xpath = "//button[@data-testid='data-testId-doc-talks-detail-share-button-81']")
	private WebElement SERIES_SHARE_ICON;

	@FindBy(xpath = "//div[contains(@class,'modal-header d-block')]/div/div[2]/span")
	private WebElement SERIES_SHARE_CROSS_ARROW;

	@FindBy(xpath = "//b[@data-testid='data-testId-doc-talks-section-heading-episode-24']")
	private WebElement SERIES_EPISODE_TEXT;

	@FindBy(xpath = "//p[@data-testid='data-testId-doc-talks-card-title-333']//b")
	private WebElement SERIES_EPISODE_ONE;

	@FindBy(xpath = "//p[@data-testid='data-testId-doc-talks-card-title-329']//b")
	private WebElement SERIES_EPISODE_TWO;

	@FindBy(xpath = "//p[@data-testid='data-testId-doc-talks-card-title-242']//b")
	private WebElement SERIES_EPISODE_THREE;

	@FindBy(xpath = "//textarea[contains(@class,'cdk-textarea-autosize w-10')]")
	private WebElement SERIES_TEXT_AREA;

	@FindBy(xpath = "//div[@class='col-12 pl-0']/span/span")
	private WebElement SERIES_POST_ICON;

	@FindBy(xpath = "//span[@class='d-inline-block float-right mt-1 ng-star-inserted dropdown']//span")
	private WebElement THREE_DOTMENU_FIRST_COMMENT;

	@FindBy(xpath = "(//a[@class='dropdown-item cursor-pointer'])[2]")
	private WebElement FIRST_COMMENT_DELETE_BUTTON;

	@FindBy(xpath = "//span[contains(@class,'border text-white rounde')]")
	private WebElement YES_BUTTON_DELETE_DIALOG;

 		@Override
	public DocTalksPage waitForPage() {
		// This method will make the script wait until the page is loaded
		Log.info("Waiting for home page to be visible", LOGGER);
		TestUtils.calculatePageLoadTime(driver);
		TestUtils.waitForVisibilityOf(driver, SEARCH_BAR);
		return this;
	}

	public void verifyDoctalksNameIsVisible(final String doctalksNameText) {
		Log.info("Verify visibility of Doctalks under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, DOCTALKS_NAME_TEXT).getText(), doctalksNameText,
				"Doctalks Name Text is not visible");
	}

	public void verifyFeaturedVideosIsVisible(final String featuredVideosText) {
		Log.info("Verify visibility of Featured Videos under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, FEATURED_VIDEOS_TEXT).getText(), featuredVideosText,
				"Featured Videos Text is not visible");
	}

	public void verifyFeaturedVideosRedirectToFeaturedVideosIsVisible(final String featuredVideosText) {
		Log.info("Click on the View All Button", LOGGER);
		FEATURED_VIDEOS_VIEW_ALL_BUTTON.click();
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, FEATURED_VIDEOS_HEADER_TITLE).getText(), featuredVideosText,
				"Featured Videos Title Text is not visible");
		TestUtils.back(driver);
	}

	public void verifyTopSpeakersIsVisible(final String topSpeakersText) {
		Log.info("Verify visibility of Top Speakers under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, TOP_SPEAKERS_TEXT).getText(), topSpeakersText,
				"Top Speakers Text is not visible");
	}

	public void scrollDownTillTopSpeakers() {
		Log.info("Scroll down till Specialities is visible", LOGGER);
		TestUtils.scrollTillElementIsVisible(driver, TOP_SPEAKERS_VIEW_ALL_BUTTON);
	}

	public void verifyTopSpeakersRedirectToTopSpeakersIsVisible(final String topSpeakersText) {
		Log.info("Click on the View All Button", LOGGER);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, TOP_SPEAKERS_VIEW_ALL_BUTTON);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, TOP_SPEAKERS_TITLE).getText(), topSpeakersText,
				"Top Speakers Title Text is not visible");
		TestUtils.back(driver);
	}

	public void scrollDownTillSpecialities() {
		Log.info("Scroll down till Specialities is visible", LOGGER);
		TestUtils.scrollTillElementIsVisible(driver, SPECIALITIES_TEXT);
	}

	public void verifySpecialitiesIsVisible(final String specialitiesText) {
		Log.info("Verify visibility of Specialities under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SPECIALITIES_TEXT).getText(), specialitiesText,
				"Specialities Text is not visible");
	}

	public void verifySpecialitiesRedirectToSpecialitiesIsVisible(final String specialitiesTitleText) {
		Log.info("Click on the View All Button", LOGGER);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, SPECIALITIES_VIEW_ALL_BUTTON);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SPECIALITIES_HEADER_TITLE).getText(), specialitiesTitleText,
				"Specialities Title Text is not visible");
		TestUtils.back(driver);
	}

	public void verifyCardiologyvideosforyouIsVisible(final String cardiologyvideosforyouText) {
		Log.info("Verify visibility of General Practitioner videos for you under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, CARDIOLOGY_VIDEOS_FOR_YOU_TEXT).getText(),
				cardiologyvideosforyouText, "cardiology videos for you Text is not visible");
	}

	public void verifyCardiologyvideosforyouRedirectToCardiologyvideosforyouIsVisible(final String cardiologyvideosforyouText) {
		Log.info("Click on the View All Button", LOGGER);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, CARDIOLOGY_VIDEOS_TEXT_VIEW_ALL_BUTTON);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, CARDIOLOGY_VIDEOS_FOR_YOU_HEADER_TITLE).getText(), cardiologyvideosforyouText,
				"Specialities Title Text is not visible");
		TestUtils.back(driver);
	}
	
	public void scrollDownTillSeries() {
		Log.info("Scroll down till Series is visible", LOGGER);
		TestUtils.scrollTillElementIsVisible(driver, SERIES_TEXT);
	}

	public void verifyDoctalksSeriesIsVisible(final String seriesText) {
		Log.info("Verify visibility of Series under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SERIES_TEXT).getText(), seriesText,
				"Series Text is not visible");
	}

	public void verifyDoctalksSeriesRedirectToSeriesIsVisible(final String seriesText) {
//		Log.info("Click on the View All Button", LOGGER);
//		TestUtils.clickElementUsingJavaScriptExecutor(driver, SERIES_TEXT_VIEW_ALL_BUTTON);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SERIES_TEXT_HEADER_TITLE).getText(), seriesText,
				"Series Title Text is not visible");
		TestUtils.back(driver);
	}

	public void clickOnSeriesViewAllBtn() {
		TestUtils.performScrollTillElement(driver, SERIES_TEXT_VIEW_ALL_BUTTON);
		Log.info("Click on the View All Button", LOGGER);
		SERIES_TEXT_VIEW_ALL_BUTTON.click();
	}

	public void verifyDoctalksDetailsIsVisibleOnSeries(final String nameText) {
		Log.info("Verify visibility Series Title Text under the Doctalks", LOGGER);
		Object[] arr = TestUtils.scrollTillElementIsVisible(nameText, DOCTALKS_FEATURED_VIDEOS_NAME, driver);
		Assert.assertTrue((Boolean) arr[0]);
	}

	public void clickOnTheDoctalksCardWithTitle(final String SearchWithTitleText) throws InterruptedException {
		Log.info("Verify visibility of Doctalks Title Text", LOGGER);
		Object[] arr = TestUtils.scrollTillElementIsVisible(SearchWithTitleText, DOCTALKS_FEATURED_VIDEOS_NAME, driver);
		String cardXpath = "(//p[@data-testid='data-testId-doc-talks-card-title-81']//b[text()=' AUTOMATION TEST DATA _DOCTALKS_ABCD '])[3]";
		TestUtils.clickUsingDynamicXpath(driver, cardXpath);
		TestUtils.performScrollUpTillElement(driver, SERIES_HEADER_TITLE_NAME);
		Thread.sleep(1000);
	}
		
	public void verifySeriesVideosViewsCountIsVisible(final String SeriesviewsCount) {
		Log.info("Verify visibility of Series Views Count under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SERIES_VIDEO_VIEWS).getText(), SeriesviewsCount,
				"Doctalks Series Views Count is not Visible");
	}

	public void verifySeriesLikesCountIsVisible(final String likesCount) throws Exception {
		System.out.println("Doctalks Series Likes Count Text is " + SERIES_LIKES_COUNT.getAttribute("class"));
		if (!SERIES_LIKES_COUNT.isDisplayed()) {
			throw new Exception("Doctalks Series Likes Count is not displayed");
		}
	}

	public void verifySeriesDetailsIsVisible(final String detailsText) throws Exception {
		System.out.println("Doctalks Series Details Text is " + SERIES_DETAILS_TEXT.getAttribute("class"));
		if (!SERIES_DETAILS_TEXT.isDisplayed()) {
			throw new Exception("Doctalks Series Details Text is not displayed");
		}
	}

	public void verifySeriesFirstSpecialityIsVisible(final String firstSpecialityText) {
		Log.info("Verify visibility of first Speciality Text under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SERIES_FIRST_SPECIALITY).getText(),
				firstSpecialityText, "first Speciality Text is not visible");
	}

	public void verifySeriesSecondSpecialityIsVisible(final String secondSpecialityText) {
		Log.info("Verify visibility of Second Speciality Text under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SERIES_SECOND_SPECIALITY).getText(),
				secondSpecialityText, "Second Speciality Text is not visible");
	}

	public void verifySeriesThirdSpecialityIsVisible(final String thirdSpecialityText) {
		Log.info("Verify visibility of Third Speciality Text under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SERIES_THIRD_SPECIALITY).getText(),
				thirdSpecialityText, "Third Speciality Text is not visible");
	}

	public void verifySeriesFourthSpecialityIsVisible(final String fourthSpecialityText) {
		Log.info("Verify visibility of Fourth Speciality Text under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SERIES_FOURTH_SPECIALITY).getText(),
				fourthSpecialityText, "Fourth Speciality Text is not visible");
	}
	
	public void verifySeriesSpeakerDetailsIsVisible(final String speakerDetailsText) {
		Log.info("Verify visibility of Series Speaker Details under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SERIES_SPEAKER_DETAILS_TEXT).getText(),
				speakerDetailsText, "Series Speaker Details Text is not visible");
	}

	public void verifySeriesSpeakerFirstNameIsDisplayed() throws Exception {
		if (!SERIES_SPEAKER_DETAILS_FIRST_NAME.isDisplayed()) {
			throw new Exception("Doctalks Series Speaker First Text is not displayed");
		}
	}
	
	public void verifySeriesSpeakerSecondNameIsDisplayed() throws Exception {
		if (!SERIES_SPEAKER_DETAILS_SECOND_NAME.isDisplayed()) {
			throw new Exception("Doctalks Series Speaker Second Name Text is not displayed");
		}
	}
	
	public void verifySeriesPlayEpisodeButtonIsVisible(final String playEpisodeButton) {
		Log.info("verify Series Play Episode Visible Series Play Episode Button under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SERIES_PLAY_EPISODE_NOW_BUTTON).getText(),
				playEpisodeButton, "Series Play Now Button is not Visible");
	}

	public void clickOnSeriesPlayEpisode() throws InterruptedException {
		Log.info("Click on the Series liked Button under the Doctalks", LOGGER);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, SERIES_PLAY_EPISODE_NOW_BUTTON);
		Thread.sleep(3000);
	}

	public void clickOnSeriesPlayEpisodeCloseBtn() throws InterruptedException {
		Log.info("Click on the Series Play Episode Close under the Doctalks", LOGGER);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, PLAY_EPISODE_NOW_CLOSE_BUTTON);
		Thread.sleep(3000);
	}
	
	public void clickOnSeriesLikedButton() {
		Log.info("Click on the Series liked Button under the Doctalks", LOGGER);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, SERIES_LIKED_BUTTON);
	}

	public void clickOnSeriesBookmarkedIcon() {
		Log.info("Click on the Series Bookmarked Icon under the Doctalks", LOGGER);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, SERIES_BOOKMARKED_ICON);
	}

	public void clickOnSeriesShareIcon() throws InterruptedException {
		Log.info(" Series Share Icon under the Doctalks", LOGGER);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, SERIES_SHARE_ICON);
		Thread.sleep(2000);
	}
    
	public void clickOnSeriesShareButtonCrossArrow() {
		Log.info("Click on the Series Share Button Cross Arrow under the Doctalks", LOGGER);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, SERIES_SHARE_CROSS_ARROW);
	}

	public void verifySeriesEpisodeIsDisplayed() throws Exception {
		if (!SERIES_EPISODE_TEXT.isDisplayed()) {
			throw new Exception("Doctalks Series Episode Text is not displayed");
		}
	}

	public void verifySeriesEpisodeOneIsDisplayed() throws Exception {
		scrollDownTSeriesEpisodeOne();
		if (!SERIES_EPISODE_ONE.isDisplayed()) {
			throw new Exception("Doctalks Series Episode One Text is not displayed");
		}
	}
	
	public void scrollDownTSeriesEpisodeOne() {
		Log.info("Scroll down till element is visible", LOGGER);
		TestUtils.scrollTillElementIsVisible(driver, SERIES_EPISODE_ONE);
	}
	
	public void verifySeriesEpisodeTwoIsDisplayed() throws Exception {
		scrollDownTSeriesEpisodeOne();
		if (!SERIES_EPISODE_TWO.isDisplayed()) {
			throw new Exception("Doctalks Series Episode Two Text is not displayed");
		}
	}

	public void verifySeriesEpisodeThreeIsDisplayed() throws Exception {
		scrollDownTSeriesEpisodeOne();
		if (!SERIES_EPISODE_THREE.isDisplayed()) {
			throw new Exception("Doctalks Series Episode Three Text is not displayed");
		}
	}

	public void postACommentOnDetailsPage(final String CommentText) {
		TestUtils.performScrollTillElement(driver, SERIES_TEXT_AREA);
		String commentText = CommentText;
		Log.info("Post a comment on Series Details Page " + commentText, LOGGER);
		TestUtils.waitForVisibilityOf(driver, SERIES_TEXT_AREA).sendKeys(commentText);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, SERIES_POST_ICON);
	}

	public void postACommentOnPostDetailsPage(final String CommentText) {
		TestUtils.performScrollTillElement(driver, SERIES_TEXT_AREA);
		String commentText = CommentText;
		Log.info("Post a comment on Cases Details Page " + commentText, LOGGER);
		TestUtils.waitForVisibilityOf(driver, SERIES_TEXT_AREA).sendKeys(commentText);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, SERIES_POST_ICON);
	}

	public void deleteCommentFromCasesDetailsPage() throws InterruptedException {
		Log.info("Deleting comment from Cases Details Page", LOGGER);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, THREE_DOTMENU_FIRST_COMMENT);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, FIRST_COMMENT_DELETE_BUTTON);
		TestUtils.clickElementUsingJavaScriptExecutor(driver, YES_BUTTON_DELETE_DIALOG);
		Thread.sleep(2000);
	}

	public void verifySeriestitleIsVisible(final String titleText) {
		Log.info("Verify visibility of Series Title under the Doctalks", LOGGER);
		TestUtils.performScrollUpTillElement(driver, SERIES_HEADER_TITLE_NAME);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SERIES_HEADER_TITLE_NAME).getText(), titleText,
				"Series Title Text is not visible");
	}

	public void verifySeriesSpecialityIsVisible(final String specialityText) {
		Log.info("Verify visibility of Series Speciality under the Doctalks", LOGGER);
		TestUtils.performScrollUpTillElement(driver, SERIES_HEADER_TITLE_NAME);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SERIES_SPECIALITY).getText(), specialityText,
				"Series Speciality Text is not visible");
	}

	public void verifySeriesViewsCountIsVisible() throws Exception {
		TestUtils.performScrollUpTillElement(driver, SERIES_HEADER_TITLE_NAME);
		int size = driver.findElements(By.xpath("(//div[@class='cursor-pointer col-12'])[8]/p[2]/span")).size();
		sf = new SoftAssert();
		if ((size == 1)) {
			sf.assertEquals(size, 1, "Views Count is not visible");
		}
	}

	public void clickOnSeriesReportShareIcon() {
		Log.info("Click on the Series Report-Share Icon", LOGGER);
		SERIES_REPORT_SHARE_ICON.click();
	}

	public void verifySeriesReportIsVisible(final String reportText) {
		clickOnSeriesReportShareIcon();
		Log.info("Verify visibility of Series Report under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SERIES_REPORT_TEXT).getText(), reportText,
				"Series Report Text is not visible");
		clickOnSeriesReportShareIcon();
	}

	public void verifySeriesShareIsVisible(final String shareText) {
		clickOnSeriesReportShareIcon();
		Log.info("Verify visibility to Series Share under the Doctalks", LOGGER);
		Assert.assertEquals(TestUtils.waitForVisibilityOf(driver, SERIES_SHARE_TEXT).getText(), shareText,
				"Series Share Text is not visible");
	}

	public void VerifyRedirectionToDocTalksLink(String DocTalksTitleText) {
		Log.info("trying to get DocTalks Title Title", LOGGER);
		String DocTalksTitle = TestUtils.waitForElementToBeClickable(driver, DACTALKS_TITLE).getText();
		Assert.assertEquals(DocTalksTitle, DocTalksTitleText);
	}
}
