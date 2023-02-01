package objectRepositort;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddToCartPage {
	@FindBy(id="in.dmart:id/llAddToCartBtn")
	private WebElement addToCartBtn;
	
	@FindBy(id="in.dmart:id/pdButtonWidgetPlus")
	private WebElement plusBtn;
	
	@FindBy(id="in.dmart:id/pdButtonWidgetMinus")
	private WebElement minusBtn;
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	private WebElement backBtn;
	
	
	@FindBy(id="in.dmart:id/pdDMartPriceTxt")
	private WebElement price;
	
	@FindBy(id="in.dmart:id/pdButtonWidgetYouPayTxt")
	private WebElement youPayText;
	
	@FindBy(id="in.dmart:id/maxQtyPopupQtyEditTxt")
	private WebElement enterQtyEle;
	
	@FindBy(id="in.dmart:id/maxQtyPopupUpdateBtn")
	private WebElement addToCartUpdate;
	
	
	public AddToCartPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}


	public WebElement getPlusBtn() {
		return plusBtn;
	}


	public WebElement getMinusBtn() {
		return minusBtn;
	}


	public WebElement getBackBtn() {
		return backBtn;
	}


	public WebElement getPrice() {
		return price;
	}


	public WebElement getYouPayText() {
		return youPayText;
	}


	public WebElement getEnterQtyEle() {
		return enterQtyEle;
	}


	public WebElement getAddToCartUpdate() {
		return addToCartUpdate;
	}
	
	
	
	
	
	
}
