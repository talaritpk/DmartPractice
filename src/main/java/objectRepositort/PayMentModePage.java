package objectRepositort;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PayMentModePage {
	
	@FindBy(xpath="//android.widget.TextView[@text='CASH / CARD ON DELIVERY']")
	private WebElement cashCardDelBtn;
	
	@FindBy(id="in.dmart:id/ivCloseCODConfirmation")
	private WebElement closeBtn;
	
	@FindBy(id="in.dmart:id/ivSummaryDownArrow")
	private WebElement sumDownArrowEle;
	
	@FindBy(id="in.dmart:id/tvAmountToBePaidValueTxt")
	private WebElement amountToBePaidEle;
	
	public PayMentModePage(AndroidDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCashCardDelBtn() {
		return cashCardDelBtn;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getSumDownArrowEle() {
		return sumDownArrowEle;
	}

	public WebElement getAmountToBePaidEle() {
		return amountToBePaidEle;
	}
	
	
	
	

}
