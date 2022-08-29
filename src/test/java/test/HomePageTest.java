package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.ZerodhaHomePage;
import pom.ZerodhaLoginPage;
import utility.Parameterization;

public class HomePageTest {
	
WebDriver driver;

	@BeforeMethod
	public void lunchbrowser() throws EncryptedDocumentException, IOException, InterruptedException {
		driver = LaunchBrowser.ChromeBrowser();
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
//	public void SearchStockTest() {
//		ZerodhaHomePage zerodhahome = new ZerodhaHomePage(driver);
//		zerodhahome.searchstock("Reliance", driver);
//		int number = zerodhahome.getsearchresultnumber();
//		Assert.assertTrue(number >0);
//	}
	
//	@Test
//	public void SearchStockAndClickonbuy() {
//		ZerodhaHomePage zerodhahome = new ZerodhaHomePage(driver);
//		zerodhahome.searchstock("Tata", driver);
//		zerodhahome.searchAndselectDesirdeStock(driver, "TATACOFFEE");
//		zerodhahome.clickbuyforsearch();
//		}
//	
//	@Test
//	public void SearchStockAndClickonsell() {
//		ZerodhaHomePage zerodhahome = new ZerodhaHomePage(driver);
//		zerodhahome.searchstock("Tata", driver);
//		zerodhahome.searchAndselectDesirdeStock(driver, "TATACOFFEE");
//		zerodhahome.clicksellforsearch();
//		}
	@Test
//	public void SearchStockAndClickonchart() {
//		ZerodhaHomePage zerodhahome = new ZerodhaHomePage(driver);
//		zerodhahome.searchstock("Tata", driver);
//		zerodhahome.searchAndselectDesirdeStock(driver, "TATACOFFEE");
//		zerodhahome.clickchartforsearch();
//		}
////	
//	@Test
//	public void SearchStockAndClickondepth() {
//		ZerodhaHomePage zerodhahome = new ZerodhaHomePage(driver);
//		zerodhahome.searchstock("Tata", driver);
//		zerodhahome.searchAndselectDesirdeStock(driver, "TATACOFFEE");
//		zerodhahome.clickdepthforsearch();	
//		}
//	@Test
//	public void SearchStockAndClickonadd() {
//		ZerodhaHomePage zerodhahome = new ZerodhaHomePage(driver);
//		zerodhahome.searchstock("Tata", driver);
//		zerodhahome.searchAndselectDesirdeStock(driver, "TATACOFFEE");
//		zerodhahome.clickAddforsearch();
//		}
	
	public void withoutsearchbuy() {
		ZerodhaHomePage zerodhahome = new ZerodhaHomePage(driver);
		
		zerodhahome.withoutsearchtostock(driver,"ADANIGREEN");
		zerodhahome.clickwithoutsearchchart();
	}


	
	
}
