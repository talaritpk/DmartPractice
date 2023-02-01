package objectRepositort;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage {
	
	
	
	@FindBy(id="in.dmart:id/et_home_search_value")
	private WebElement searchTF;
	
	@FindBy(id="in.dmart:id/img_home_search")
	private WebElement searchBtn;
	
	@FindBy(id="in.dmart:id/ic_cart_icon")
	private WebElement addToCartLookUpImage;
	
	@FindBy(id="in.dmart:id/rowSuggestion")
	private List<WebElement> autoSuggts;
	
	public HomePage(AndroidDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getSearchTF() {
		return searchTF;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getAddToCartLookUpImage() {
		return addToCartLookUpImage;
	}

	public List<WebElement> getAutoSuggts() {
		return autoSuggts;
	}
	
	
	

}
