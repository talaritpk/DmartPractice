package objectRepositort;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.AndroidGestureLibrary;
import genericLibrary.BaseClass;
import io.appium.java_client.android.AndroidDriver;

public class ChangeAdressPage extends BaseClass {
	
	AndroidGestureLibrary agl=new AndroidGestureLibrary(driver);
	
	@FindBy(id="in.dmart:id/llAddNewAddress")
	private WebElement addNewAdrrEle;
	
	@FindBy(id="in.dmart:id/etFullName")
	private WebElement fullName;
	
	@FindBy(id="in.dmart:id/etPinCode")
	private WebElement pinCode;
	
	@FindBy(id="in.dmart:id/areaEditText")
	private WebElement areaEle;
	
	@FindBy(id="in.dmart:id/etAddressDetails")
	private WebElement localityEle;
	
	@FindBy(id="in.dmart:id/etApartmentDetails")
	private WebElement floorEle;

	@FindBy(id="in.dmart:id/landmarkEditText")
	private WebElement landMarkEle;

	@FindBy(id="in.dmart:id/cityEditText")
	private WebElement cityEle;
	
	@FindBy(id="in.dmart:id/stateEditText")
	private WebElement stateEle;
	
	@FindBy(id="in.dmart:id/mobileEditText")
	private WebElement contactNoEle;
	
	@FindBy(id="in.dmart:id/btnProceed")
	private WebElement saveAdrrBook;
	
	@FindBy(id="in.dmart:id/llAddressContainer")
	private WebElement listParEle;
	
	@FindBy(id="in.dmart:id/btnUpdate")
	private WebElement saveAdrrEle;
	
	public ChangeAdressPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddNewAdrrEle() {
		return addNewAdrrEle;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getPinCode() {
		return pinCode;
	}

	public WebElement getAreaEle() {
		return areaEle;
	}

	public WebElement getLocalityEle() {
		return localityEle;
	}

	public WebElement getFloorEle() {
		return floorEle;
	}

	public WebElement getLandMarkEle() {
		return landMarkEle;
	}

	public WebElement getCityEle() {
		return cityEle;
	}

	public WebElement getStateEle() {
		return stateEle;
	}

	public WebElement getContactNoEle() {
		return contactNoEle;
	}

	public WebElement getSaveAdrrBook() {
		return saveAdrrBook;
	}
	
	public WebElement getListParEle() {
		return listParEle;
	}
	
	public WebElement getSaveAdrrEle() {
		return saveAdrrEle;
	}
	
	//Business Library******************


	public void addAdress()
	{
		getFullName().sendKeys("pavanKumar");
		getPinCode().sendKeys("530046");
		//getAreaEle().sendKeys("Visakhapatnam");
		getLocalityEle().sendKeys("Ukkunagaram");
		getFloorEle().sendKeys("307");
		getLandMarkEle().sendKeys("sector 10");
		//getCityEle().sendKeys("Visakhapatnam");
		agl.scrollGesture(listParEle, "down", (float) 0.75, 5000*393);
		//getStateEle().sendKeys("AndhraPradesh");
		getContactNoEle().clear();
		getContactNoEle().sendKeys("8464992137");
		getSaveAdrrBook().click();
		getSaveAdrrEle().click();
		
		
	}
	
	
	
	
	
	
	
	

}
