package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.ZerodhaLoginPage;
import utility.Parameterization;

public class LoginPageTest {

	WebDriver driver;
	@BeforeMethod
	public void lunchbrowser() {
		driver = LaunchBrowser.ChromeBrowser();
	}
	
	@Test
public void ZerodhaLoginTest() throws EncryptedDocumentException, IOException, InterruptedException {
	
	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String un = Parameterization.getData("Sheet1", 1, 1);
		String pw = Parameterization.getData("Sheet1", 2, 1);
	String pin = Parameterization.getData("Sheet1", 3, 1);
	zerodhaLoginPage.enterusername(un);
	zerodhaLoginPage.enterpassword(pw);
	zerodhaLoginPage.clicklogin();
	Thread.sleep(2000);
	zerodhaLoginPage.enterpin(pin);
	zerodhaLoginPage.clickcontinue();
	
	
	}
//	@Test
//	public void Signuptest() {
//		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
//		zerodhaLoginPage.switchtoSignup(driver);
//		zerodhaLoginPage.entermobandcontinue("123456");
//	}
	
	
}
