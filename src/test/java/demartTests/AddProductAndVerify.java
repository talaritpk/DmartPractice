package demartTests;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.AndroidGestureLibrary;
import genericLibrary.BaseClass;
import io.appium.java_client.AppiumBy;
import objectRepositort.AddToCartPage;
import objectRepositort.CartPage;
import objectRepositort.ChangeAdressPage;
import objectRepositort.CheckOutPage;
import objectRepositort.HomePage;
import objectRepositort.PayMentModePage;


public class AddProductAndVerify extends BaseClass {

	@Test
	public void addProductAndVerify() throws MalformedURLException {
		
		
		AndroidGestureLibrary adl=new AndroidGestureLibrary(driver);
		
		HomePage hp=new HomePage(driver);
		CartPage cp=new CartPage(driver);
		AddToCartPage acp=new AddToCartPage(driver);
		//CartPage ptco=new CartPage(driver);
		CheckOutPage cop=new CheckOutPage(driver);
		PayMentModePage pmp=new PayMentModePage(driver);
		ChangeAdressPage cap=new ChangeAdressPage(driver);
		
		
		hp.getSearchTF().sendKeys("dryfruits");
		List<WebElement> suggEles=hp.getAutoSuggts();
		for(WebElement sugEle:suggEles)
		{
			sugEle.click();
		}
		
		cp.getProductTitleDryF().click();
		acp.getAddToCartBtn().click();
		
		String price=acp.getPrice().getText().substring(2);
		String youPayText=acp.getYouPayText().getText().substring(10);
		
		if(youPayText.equals(price)){
			System.out.println(youPayText+"="+price +" -->same value is present passed");
			Reporter.log(youPayText+"="+price +" -->same value is present passed");
		}
		
		
		
		WebElement plus=driver.findElement(AppiumBy.id("in.dmart:id/pdButtonWidgetPlus"));
		adl.doubleClick(plus);
//		adl.doubleClick(plus);
//		acp.getEnterQtyEle().clear();
//		acp.getEnterQtyEle().sendKeys("25");
		//acp.getAddToCartUpdate().click();
		
		
		
		
		
		acp.getMinusBtn().click();
		String youPayTextup=acp.getYouPayText().getText().substring(10);
		acp.getBackBtn().click();
		acp.getBackBtn().click();
		
		//hp.getSearchTF().sendKeys("");
		
		
		hp.getAddToCartLookUpImage().click();
		
		String proText=cp.getProductTitleEles().getText();
		System.out.println(proText);
		Assert.assertEquals(proText, "Premia Mixed Dry Fruits : 200 gms");
		
		cp.getProceedToCheckOutBtn().click();
		
		cop.getChangeAdrr().click();
		cap.getAddNewAdrrEle().click();
		
		cap.addAdress();
		
		
		
		
		cop.getConfAdrr().click();
		cop.getCnfmTimeSlotEle().click();
		cop.getProceedToPayBtn().click();
		pmp.getCashCardDelBtn().click();
		
		String amountToBePaid=pmp.getAmountToBePaidEle().getText().substring(1);
		double amountTobePaid=Double.parseDouble(amountToBePaid);
		double youPay=Double.parseDouble(youPayTextup);
		Assert.assertEquals(youPay+49, amountTobePaid);
		System.out.println(amountTobePaid+"--"+(youPay+49)+" AreEqual"+"Passed");
		pmp.getCloseBtn().click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
