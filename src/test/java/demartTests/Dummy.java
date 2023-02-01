package demartTests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import genericLibrary.AndroidGestureLibrary;
import io.appium.java_client.android.AndroidDriver;
import objectRepositort.AddToCartPage;
import objectRepositort.HomePage;
import objectRepositort.CartPage;


public class Dummy {
	
	@Test
	public void addProductAndVerify() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy");
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("udid", "RZ8R30QM0BB");// HMMRBMLVBU9HGMJF RZ8R30QM0BB
		dc.setCapability("appPackage", "in.dmart");
		dc.setCapability("appActivity", ".activity.SplashActivity");
		dc.setCapability("noReset", "true");
		dc.setCapability("sessionOverride", "10");

		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AndroidGestureLibrary adl=new AndroidGestureLibrary(driver);
		
		HomePage hp=new HomePage(driver);
		CartPage cp=new CartPage(driver);
		AddToCartPage acp=new AddToCartPage(driver);
		CartPage ptco=new CartPage(driver);
		
		hp.getSearchTF().sendKeys("dryfruits");
		List<WebElement> suggEles=hp.getAutoSuggts();
		for(WebElement sugEle:suggEles)
		{
			String sugText=sugEle.getText();
			System.out.println(sugText);
			System.out.println(sugText);
			if(sugText.equals("dryfruits"))
			{
				sugEle.click();
			}
			break;
			
		}

}
}
