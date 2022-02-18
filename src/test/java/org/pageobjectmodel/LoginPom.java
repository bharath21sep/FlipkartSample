package org.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClassMethods;

public class LoginPom extends BaseClassMethods {
	public LoginPom() {

	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement nameInput;
	@FindBy(css="input[type=password]")
	private WebElement passwordInput;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submitBtn;
	@FindBy(xpath="(//div[@class='exehdJ'])[1]")
	private WebElement nameValidate;
	@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement searchBox;
	@FindBy(xpath="(//img[@class='_396cs4 _3exPp9'])[1]")
	private WebElement headPhoneProduct1;
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addCartBtn;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement sumbitBtn2;
	@FindBy(xpath="(//img[@class='_2r_T1I'])[3]")
	private WebElement shoeProduct2;
	@FindBy(xpath="(//a[@class='_1fGeJ5 _2UVyXR _31hAvz'])[2]")
	private WebElement selectSize;
	@FindBy(xpath="(//img[@class='_396cs4 _3exPp9'])[2]")
	private WebElement laptopProduct3;
	@FindBy(xpath="(//img[@class='_396cs4 _3exPp9'])[8]")
	private WebElement smartWatchProduct4;
	@FindBy(xpath="//a[@class='_3SkBxJ']")
	private WebElement cartBtn;
	@FindBy(xpath="(//div[@class='zab8Yh _10k93p']//span[@class='_2-ut7f _1WpvJ7'])[1]")
    private WebElement cartProduct1;
	@FindBy(xpath="(//div[@class='zab8Yh _10k93p']//span[@class='_2-ut7f _1WpvJ7'])[2]")
	private WebElement cartProduct2;	
	@FindBy(xpath="(//div[@class='zab8Yh _10k93p']//span[@class='_2-ut7f _1WpvJ7'])[3]")
	private WebElement cartProduct3;
		
	@FindBy(xpath="(//div[@class='zab8Yh _10k93p']//span[@class='_2-ut7f _1WpvJ7'])[4]")
	private WebElement cartProduct4;
	@FindBy(xpath="(//div[@class='_3dsJAO'])[2]")
	private WebElement removeProduct1;
	@FindBy(xpath="(//div[@class='_3dsJAO'])[4]")
	private WebElement removeProduct2;
	@FindBy(xpath="(//div[@class='_3dsJAO'])[6]")
	private WebElement removeProduct3;
	@FindBy(xpath="(//div[@class='_3dsJAO'])[8]")
	private WebElement removeProduct4;
	@FindBy(xpath="//div[@class='_3dsJAO _24d-qY FhkMJZ']")
	private WebElement removeBtn;
	@FindBy(xpath="//span[text()='Place Order']")
	private WebElement placeOrderBtn;
	
	public WebElement getPlaceOrderBtn() {
		return placeOrderBtn;
	}
	public WebElement getRemoveProduct1() {
		return removeProduct1;
	}
	public WebElement getRemoveProduct2() {
		return removeProduct2;
	}
	public WebElement getRemoveProduct3() {
		return removeProduct3;
	}
	public WebElement getRemoveProduct4() {
		return removeProduct4;
	}
	public WebElement getRemoveBtn() {
		return removeBtn;
	}
	public WebElement getCartBtn() {
		return cartBtn;
	}
	public WebElement getCartProduct1() {
		return cartProduct1;
	}
	public WebElement getCartProduct2() {
		return cartProduct2;
	}
	public WebElement getCartProduct3() {
		return cartProduct3;
	}
	public WebElement getCartProduct4() {
		return cartProduct4;
	}
	public WebElement getSmartWatchProduct4() {
		return smartWatchProduct4;
	}
	public WebElement getSelectSize() {
		return selectSize;
	}
	public WebElement getShoeProduct2() {
		return shoeProduct2;
	}
	public WebElement getSumbitBtn2() {
		return sumbitBtn2;
	}

	
		
		public WebElement getSearchBox() {
		return searchBox;
	}
	public WebElement getHeadPhoneProduct1() {
		return headPhoneProduct1;
	}
	public WebElement getAddCartBtn() {
		return addCartBtn;
	}
		public WebElement getNameValidate() {
		return nameValidate;
	}
		public WebElement getNameInput() {
		return nameInput;
	}
	public WebElement getPasswordInput() {
		return passwordInput;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public WebElement getLaptopProduct3() {
		return laptopProduct3;
	}
	
	
	
	
	
	
}
