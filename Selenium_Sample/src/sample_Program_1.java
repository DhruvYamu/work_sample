import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample_Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Drivers\\Firefox\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		
		FirefoxDriver ffDiver = new FirefoxDriver();
		
		ffDiver.navigate().to("https://www.amazon.in/");
		System.out.println("AMAZON LAUNCHED");
		JavascriptExecutor js = (JavascriptExecutor)ffDiver;
		js.executeScript("window.scrollBy(0,2500)");
		System.out.println("Scroll Performed");
	}

}
