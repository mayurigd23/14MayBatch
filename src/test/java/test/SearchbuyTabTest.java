package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.SearchBuyTab;
import pom.ZerodhaHomePage;
import pom.ZerodhaLoginPage;
import utility.Parameterization;



public class SearchbuyTabTest {
WebDriver driver;
	@Test (priority = 1)
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
		
	@Test (priority = 2)
	public void SearchStockAndClickonbuy() {
		ZerodhaHomePage zerodhahome = new ZerodhaHomePage(driver);
		zerodhahome.searchstock("Tata", driver);
		zerodhahome.searchAndselectDesirdeStock(driver, "TATACOFFEE");
		zerodhahome.clickbuyforsearch();
		}
	
	@Test (priority = 3)
	public void Buytab() throws InterruptedException {
	
		SearchBuyTab bt = new SearchBuyTab();
		bt.selectlongterm();
		bt.Selectstock("SL");
		bt.enterquatity("3");
		bt.enterprice("300");
		bt.entertriggerprice("290");
		bt.clickmore("IOC");
			}
	
	}

