package pom;

    import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;



	public class ZerodhaLoginPage {

		@FindBy(xpath = "//input[@id='userid'] ") private WebElement username;
		@FindBy(xpath = "//input[@id='password']") private WebElement pwd;
		@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement login;
		@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
		
		@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement continu;
		@FindBy(xpath = "//a[text()='Forgot user ID or password?']") private WebElement forgot;
		@FindBy(xpath = "//input[@placeholder='User ID']") private WebElement uID;
		@FindBy(xpath = "//input[@placeholder='PAN']") private WebElement panno ;
		@FindBy(xpath = "//input[@placeholder='E-mail (as on account)']") private WebElement emailid ;
		@FindBy(xpath = "//button[@type='submit']") private WebElement Reset ;
		@FindBy(xpath = "//a[@class='text-xsmall text-light reset-account-button']") private WebElement back ;
		@FindBy(xpath = "//input[@value='sms']") private WebElement smss ;
		@FindBy(xpath = "//input[@placeholder='Mobile number (as on account)']") private WebElement mobno ;
		@FindBy (xpath = "//img[@class='logo-img']") private WebElement logo;
		@FindBy(xpath = "//input[@id='user_mobile']") private WebElement mob;
		@FindBy (xpath = "//button[@id='open_account_proceed_form']") private WebElement cont;
		
		public ZerodhaLoginPage (WebDriver driver) {
			PageFactory.initElements(driver,this);
			}
		
		public void enterusername(String un) {
			username.sendKeys(un);
			}
		public void enterpassword(String pw) {
			pwd.sendKeys(pw);
		}
		public void clicklogin() {
			login.click();
		}
		public void clickforgot() {
			forgot.click();
		}
		public void enteruserid(String userid) {
			uID.sendKeys(userid);
		}
		public void enterpanno(String pan) {
			panno.sendKeys(pan);
		}
		public void enteremail(String emid) {
			emailid.sendKeys(emid);
		}
		public void selectsms() {
			Select select1 = new Select(smss);
			select1.selectByValue("sms");
		}
		public void entermobno(String mb) {
			mobno.sendKeys(mb);
		}
		public void clickreset() {
			Reset.click();
		}
		public void backlog() {
			back.click();
		}
		
		public void enterpin(String pn) {
			pin.sendKeys(pn);
		}
		public void clickcontinue() {
			continu.click();
		}
		public void switchtoSignup(WebDriver driver) {
				WebElement Signup = driver.findElement(By.xpath("//a[@class='text-light']"));
			Signup.click();
			

			Set<String> handles = driver.getWindowHandles();
			Iterator<String> i = handles.iterator();

			while (i.hasNext()) {
				String handle = i.next();
				driver.switchTo().window(handle);
				String CurrentTitle = driver.getTitle();
				if(CurrentTitle.equals("Signup and open Zerodha trading and demat account online and star investing-zerodha")) {
				break;
				}
		}
		}

		public void entermobandcontinue(String mbn) {
			mob.sendKeys(mbn);
			cont.click();
			
		}
	}




