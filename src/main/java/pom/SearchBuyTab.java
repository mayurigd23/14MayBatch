package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchBuyTab {

@FindBy(xpath="//input[@title='CashNCarry: Longterm investment. Requires full upfront margin.']")private WebElement longterm;
@FindBy(xpath="//input[@rules='[object Object],[object Object],[object Object]']") private WebElement quatity;
@FindBy(xpath="//label[text()='Price']")private WebElement price;
@FindBy(xpath="//label[text()='Trigger price']")private WebElement triggerprice;
@FindBy(xpath="//input[@title='Buy at a preferred price with a stoploss']")private WebElement stocklimit;
@FindBy(xpath="//span[@data-balloon='More options']")private WebElement more;
@FindBy(xpath="//input[@title='Valid throughout the day until executed']")private WebElement validity;
@FindBy(xpath="//button[@class='submit']")private WebElement buybutton;
@FindBy (xpath = "//form[@class='order-window layer-2 place buy']")  private WebElement Buytab;


//public SearchBuyTab (WebDriver driver) {
	//PageFactory.initElements(driver,this);
	//}
	
public void selectlongterm() {
	boolean status = longterm.isSelected();
	System.out.println(status);
	longterm.click();
}

public void enterquatity( String qu) {
	quatity.sendKeys(qu);
}

public void enterprice(String pr) {
	price.sendKeys(pr);
}

public void entertriggerprice(String trprice) {
	triggerprice.sendKeys(trprice);
}

public void Selectstock(String val) {
	Select select = new Select(stocklimit);
	select.selectByValue(val);
}

public void clickmore(String valu) throws InterruptedException {
	more.click();
	Thread.sleep(2000);
	Select sc = new Select(validity);
	sc.selectByValue(valu);
}

public void clickbuybutton() {
	buybutton.click();
}
}
