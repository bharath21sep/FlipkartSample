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
