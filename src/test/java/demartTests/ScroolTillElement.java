package demartTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibrary.AndroidGestureLibrary;
import genericLibrary.BaseClass;
import io.appium.java_client.AppiumBy;

public class ScroolTillElement extends BaseClass {
	
	@Test
	public void scroollAddToCart() throws InterruptedException
	{
		AndroidGestureLibrary agl=new AndroidGestureLibrary(driver);
		driver.findElement(By.xpath("//android.widget.TextView[@text='DMart Exclusive']")).click();
		List<WebElement> ele=driver.findElements(AppiumBy.xpath("//android.widget.TextView[@text='Royal Rasgulla : 1 kg']"));
		//boolean scroll= true;
		while(ele.isEmpty()) {
			
			agl.scrollGesturewithBoundingArea(100, 280, 500, 2100, "down", 1);
			
			ele=driver.findElements(AppiumBy.xpath("//android.widget.TextView[@text='Royal Rasgulla : 1 kg']"));
			
		}
		driver.findElement(AppiumBy.xpath("//*[@text='Royal Rasgulla : 1 kg']/..//*[@resource-id='in.dmart:id/includeAddViewAddToCart']")).click();
	}

}
