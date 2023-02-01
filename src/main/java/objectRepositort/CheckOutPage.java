package objectRepositort;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CheckOutPage {
	
	@FindBy(id="in.dmart:id/tvHdTitleText")
	private WebElement homeDel;
	
	@FindBy(id="in.dmart:id/tvConfirmAddressBtn")
	private WebElement confAdrr;
	
	@FindBy(id="in.dmart:id/tvPickUpLocationChangeBtn")
	private WebElement changeAdrr;
	
	@FindBy(id="in.dmart:id/tvConfirmTimeSlotBtn")
	private WebElement cnfmTimeSlotEle;
	
	@FindBy(id="in.dmart:id/tvProceedToPayBtn")
	private WebElement proceedToPayBtn;;
	
	public CheckOutPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getHomeDel() {
		return homeDel;
	}

	public WebElement getConfAdrr() {
		return confAdrr;
	}

	public WebElement getChangeAdrr() {
		return changeAdrr;
	}

	public WebElement getCnfmTimeSlotEle() {
		return cnfmTimeSlotEle;
	}

	public WebElement getProceedToPayBtn() {
		return proceedToPayBtn;
	}
	
	
	
	

}
