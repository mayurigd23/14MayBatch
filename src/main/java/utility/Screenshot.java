package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void screenshotmethod(WebDriver driver,String name) throws IOException {
		TakesScreenshot sc = ((TakesScreenshot)driver);
		File Source = sc.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\mayur\\OneDrive\\Documents\\subodh Sir\\selenium\\"+name+".jpg");
		FileHandler.copy(Source, destination);

	}
}
