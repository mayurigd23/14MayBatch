package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaHomePage {

	@FindBy (xpath = "//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']") private WebElement search;
	@FindBy (xpath = "//span[@class='tradingsymbol']") private List<WebElement> searchResult;
	@FindBy (xpath = "//button[@data-balloon='Buy']")  private WebElement Buyforsearch;
	@FindBy (xpath = "//button[@data-balloon='Sell']") private WebElement sellforsearch;
	@FindBy (xpath = "//button[@data-balloon='Chart']") private WebElement chartforsearch;
	@FindBy (xpath = "//button[@data-balloon='Market depth widget']") private WebElement depthforsearch;
	@FindBy (xpath = "//button[@data-balloon='Add']") private WebElement Addshareforsearch;
	@FindBy (xpath = "//span[@class='nice-name']") private List<WebElement> withoutsearchResult;
	@FindBy (xpath = "//button[@class='button-blue buy']") private WebElement withoutsearchbuy ;
	@FindBy (xpath = "//button[@class='button-orange sell']") private WebElement withoutsearchsell;
	@FindBy (xpath = "//button[@class='button-outline']") private WebElement withoutsearchdepth;
	@FindBy (xpath = "//span[@data-balloon='Chart (C)']") private WebElement withoutsearchchart;
	@FindBy (xpath = "//span[@data-balloon='Delete (del)']") private WebElement withoutsearchdelete;
	@FindBy (xpath = "//span[@class='icon icon-ellipsis']") private WebElement withoutsearchmore;
	
	public ZerodhaHomePage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	public void searchstock(String stock, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(1000));
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys(stock);
	}
	
	public int getsearchresultnumber() {
		int listsize = searchResult.size();
		return listsize;
	}
	
	public void searchAndselectDesirdeStock(WebDriver driver ,String Requiredstock) {
		for(int a = 0; a< searchResult.size(); a++) {
			
			WebElement s = searchResult.get(a);
			String stockname = s.getText();
			if(stockname.equals(Requiredstock));
			{
				Actions actions = new Actions(driver);
				actions.moveToElement(s);
				actions.perform();
				break;
			}
		}
	}
	
	public void clickbuyforsearch() {
		Buyforsearch.click();
	}
	public void clicksellforsearch() {
		sellforsearch.click();
	}	
	public void clickchartforsearch() {
		chartforsearch.click();
	}
	public void clickdepthforsearch() {
		depthforsearch.click();
	}
	public void clickAddforsearch() {
		Addshareforsearch.click();
	}
	public int getresultnumber() {
		int listsize = withoutsearchResult.size();
		return listsize;
	}
	
	public void withoutsearchtostock(WebDriver driver ,String stockss) {
		
		for(int b = 0; b< withoutsearchResult.size(); b++) {
			
		
				WebElement sw = withoutsearchResult.get(b);
				String stockname = sw.getText();
				if(stockname.equals(stockss));
				{
					Actions actions = new Actions(driver);
					actions.moveToElement(sw);
					actions.perform();
					break;
				}
	}
	}
	public void clickwithoutsearchbuy() {
		withoutsearchbuy.click();
	}
	public void clickwithoutsearchsell() {
		withoutsearchsell.click();
	}
	public void clickwithoutsearchdepth() {
		withoutsearchdepth.click();
	}
	public void clickwithoutsearchchart() {
		withoutsearchchart.click();
	}
	public void clickwithoutsearchdelete() {
		withoutsearchdelete.click();
	}
	public void clickwithoutsearchmore() {
		withoutsearchmore.click();
	}
	
	
	
	
}
