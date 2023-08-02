package DocquityWeb.DocQT.Test;



import org.testng.annotations.Test;

import DocquityWeb.DocQT.Page.LoginPage;

public class LoginTest extends BaseTest {

	LoginPage loginPage;

	@Test
	public void verifySuccessfullyNewUserLogin() {
		loginPage = new LoginPage(driver);
		driver.get(PostURL);
		loginPage.clickAcceptCookiesButton();
		loginPage.loginWithMobileAndCountry("8092845969", "1", "2", "3", "4", "india");
		System.out.println("hello");
	}

	

}
