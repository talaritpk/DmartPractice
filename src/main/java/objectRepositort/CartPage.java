package objectRepositort;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CartPage {
	
	@FindBy(id="in.dmart:id/txtCartWidgetProductName")
	private WebElement productTitleEles;
	
	@FindBy(id="in.dmart:id/btnProceedToCheckout")
	private WebElement proceedToCheckOutBtn;
	
	
	public CartPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getProductTitleEles() {
		return productTitleEles;
	}


	public WebElement getProceedToCheckOutBtn() {
		return proceedToCheckOutBtn;
	}
	
	@FindBy(id="in.dmart:id/txt_listitem_plp_title")
	private WebElement productTitleDryF;
	
	



	public WebElement getProductTitleDryF() {
		return productTitleDryF;
	}
	
	
	

}
