package org.stepdefinition;




import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pageobjectmodel.LoginPom;
import org.utilities.BaseClassMethods;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;


public class FlipkarkLogin extends LoginPom{
	LoginPom lp;
	@Given("launch the chrome browser")
	public  void launch_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		parentWindow();
	 
	}

	

	@When("Enter the URL")
	public void enter_the_URL() throws InterruptedException {
		loadUrl("https://www.flipkart.com");
	    windMax();

	   
	}

	@When("Type the valid username and valid password")
	public void type_the_valid_username_and_valid_password() {
		lp=new LoginPom();
	    passValue(lp.getNameInput(),"9585527700");
	    passValue(lp.getPasswordInput(),"bharath1996");
		
		
	}


	@When("click login button")
	public void click_login_button() throws InterruptedException  {
		btnclick(lp.getSubmitBtn());
		driver.navigate().refresh();
		
	   
	}
	@Then("validate username")
	public void validate_username() {
		lp= new LoginPom();
		String text = lp.getNameValidate().getText();
		System.out.println(text);
Assert.assertEquals("Login Successful", "Bharath", text);	 	
	}
	@Given("Search first product and add to cart")
	public void search_first_product_and_add_to_cart() {
		lp= new LoginPom();
		passValue(lp.getSearchBox(),"headphones");
		btnclick(lp.getSumbitBtn2());
		driver.navigate().refresh();
		btnclick(lp.getHeadPhoneProduct1());
		switchWindows();
		
		btnclick(lp.getAddCartBtn());
		

	    
	}

	@SuppressWarnings("deprecation")
	@Given("Search second product and add to card")
	public void search_second_product_and_add_to_card() {

		lp=new LoginPom();
	
		passValue(lp.getSearchBox(),"shoes");
		btnclick(lp.getSumbitBtn2());
		driver.navigate().refresh();
		btnclick(lp.getShoeProduct2());
		switchWindows();
		btnclick(lp.getSelectSize());
		
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(lp.getAddCartBtn()));
		
		btnclick(lp.getAddCartBtn());
		
		
	   
	}

	@Given("serach third product and add to cart")
	public void serach_third_product_and_add_to_cart() {
		passValue(lp.getSearchBox(),"laptops");
		btnclick(lp.getSumbitBtn2());
		driver.navigate().refresh();
		btnclick(lp.getLaptopProduct3());
		switchWindows();
		btnclick(lp.getAddCartBtn());
		
	}

	@Given("Search fourth product and add to cart")
	public void search_fourth_product_and_add_to_cart() {
		passValue(lp.getSearchBox(),"smart watches");
		btnclick(lp.getSumbitBtn2());
		driver.navigate().refresh();
		btnclick(lp.getSmartWatchProduct4());
		switchWindows();
		btnclick(lp.getAddCartBtn());
		quitWindow();
		
	}



}
