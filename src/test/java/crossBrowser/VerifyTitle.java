package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class VerifyTitle {
WebDriver driver;
@Test
@Parameters("browser")
public void verifyPageTitle(String browserName) {
	if(browserName.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver", "/Users/fatemaislam/Downloads/geckodriver");   
	 driver=new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver");   
	 driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com/");
	System.out.println(driver.getTitle());
	driver.quit();
}
}
