package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static WebDriver ChromeBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mayur\\OneDrive\\Documents\\subodh Sir\\selenium\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver.setup();
WebDriver driver = new ChromeDriver(option);
driver.navigate().to("https://kite.zerodha.com/");
return driver;

	}
	
}
