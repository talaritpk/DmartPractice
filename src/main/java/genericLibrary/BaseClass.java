package genericLibrary;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public AndroidDriver driver;
	
	@BeforeSuite
	public void bsConfig()
	{
		
	}
	
	@BeforeClass
	public void bcConfig() throws MalformedURLException
	{
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

		driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@BeforeMethod
	public void bmConfig()
	{
		
	}

}
