package genericLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class AndroidGestureLibrary {
	public AndroidDriver driver;
	
	public AndroidGestureLibrary(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickGesture(WebElement element)
	{
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()
			));
	}
	
	
	public void clickByCoordinates(int x,int y,int time)
	{
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			    "x",x,"y",y,"duration",time			));
	}
	
	
	public void longClickGesture(WebElement element,int time)
	{
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"duration",time));
	}
	
	public void longClickGestureWithCoordinates(int x,int y,int time)
	{
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "x",x,"y",y,"duration",time));
	}
	
	public void doubleClick(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()
			));
	}
	
	public void doubleClickwithCoordinates(int x,int y)
	{
		((JavascriptExecutor)driver).executeScript("mobile: doubleClickGesture",ImmutableMap.of("x",x,"y",y));
	}
	
	public void dragGesture(WebElement element,int x,int y)
	{
		((JavascriptExecutor)driver).executeScript("mobile: dragGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"endX",x,"endY",y));
	}
	
	public void dragGesturewithstartCor(WebElement element,int sX,int sY,int x,int y)
	{
		((JavascriptExecutor)driver).executeScript("mobile: dragGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"startX",sX,"startY",sY,"endX",x,"endY",y));
	}
	
	public void swipeGesture(AndroidDriver driver,WebElement element,String direction,float per)
	{
		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"direction",direction,"percent",per));
	}
	
	public void swipeGestureWithArea(int l,int t,int w,int h,String direction,float per)
	{
		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture",ImmutableMap.of("left",l,"top",t,"width",w,"height",h,"direction",direction,"percent",per));
	}
	
	public void pinchOpenGesture(WebElement element,float per)
	{
		((JavascriptExecutor)driver).executeScript("mobile: pinchOpenGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"percent",per));
	}
	
	public void pinchCloseGesture(WebElement element,float per)
	{
		((JavascriptExecutor)driver).executeScript("mobile: pinchCloseGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"percent",per));
	}
	
	public void scrollGesturewithBoundingArea(int leftCor,int rightCor,int widCor,int heightCor,String direction,int per)
	{
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", leftCor, "top", rightCor, "width", widCor, "height", heightCor,
			    "direction", direction,
			    "percent", per
			));
	}
	
	public void scrollGesture(WebElement element,String direction,float per,int spdValue)
	{
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId(),
			    "direction", direction,
			    "percent", per,"speed",spdValue
			));
	}
	
	public Boolean scrollGestureBoolean(WebElement element,String direction,float per)
	{
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId(),
			    "direction", direction,
			    "percent", per
			));
		return canScrollMore;
	}
	
	
	public void scrollFromElementToElement()
	{
		
	}

}
