package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pageobjectmodel.LoginPom;
import org.utilities.BaseClassMethods;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;

public class FlipkarkLogin extends LoginPom {
	LoginPom lp;

	@Given("launch the chrome browser")
	public void launch_the_chrome_browser() {
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
		lp = new LoginPom();
		passValue(lp.getNameInput(), "9585527700");
		passValue(lp.getPasswordInput(), "bharath1996");

	}

	@When("click login button")
	public void click_login_button() throws InterruptedException {
		btnclick(lp.getSubmitBtn());
		driver.navigate().refresh();

	}

	@Then("validate username")
	public void validate_username() {
		lp = new LoginPom();
		String text = lp.getNameValidate().getText();
		System.out.println(text);
		Assert.assertEquals("Login Successful", "Bharath", text);
	}

	@Given("Search first product and add to cart")
	public void search_first_product_and_add_to_cart() {
		lp = new LoginPom();
		passValue(lp.getSearchBox(), "headphones");
		btnclick(lp.getSumbitBtn2());
		driver.navigate().refresh();
		btnclick(lp.getHeadPhoneProduct1());
		switchWindows();

		btnclick(lp.getAddCartBtn());

	}

	@SuppressWarnings("deprecation")
	@Given("Search second product and add to card")
	public void search_second_product_and_add_to_card() {

		lp = new LoginPom();

		passValue(lp.getSearchBox(), "shoes");
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
		passValue(lp.getSearchBox(), "laptops");
		btnclick(lp.getSumbitBtn2());
		driver.navigate().refresh();
		btnclick(lp.getLaptopProduct3());
		switchWindows();
		btnclick(lp.getAddCartBtn());

	}

	@Given("Search fourth product and add to cart")
	public void search_fourth_product_and_add_to_cart() {
		passValue(lp.getSearchBox(), "smart watches");
		btnclick(lp.getSumbitBtn2());
		driver.navigate().refresh();
		btnclick(lp.getSmartWatchProduct4());
		switchWindows();
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(lp.getAddCartBtn()));
		btnclick(lp.getAddCartBtn());

	}

	@Given("click cart button")
	public void click_cart_button() {
		lp = new LoginPom();
		btnclick(lp.getCartBtn());
	}

	@Given("Validate the cart with lowest price")
	public void validate_the_cart_with_lowest_price() throws InterruptedException {
		lp = new LoginPom();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(lp.getCartProduct1()));
		String price1 = lp.getCartProduct1().getText();
		String replace = price1.replace("₹", "");
		System.out.println(replace);
		String replace2 = replace.replace(",", "");
		int productPrice1 = Integer.valueOf(replace2);
		System.out.println(productPrice1);
		String price2 = lp.getCartProduct2().getText();
		String replace3 = price2.replace("₹", "");
		String replace6 = replace3.replace(",", "");
		int productPrice2 = Integer.valueOf(replace6);
		System.out.println(productPrice2);
		String price3 = lp.getCartProduct3().getText();
		String replace4 = price3.replace("₹", "");
		String replace7 = replace4.replace(",", "");
		int productPrice3 = Integer.valueOf(replace7);
		System.out.println(productPrice3);
		String price4 = lp.getCartProduct4().getText();
		String replace5 = price4.replace("₹", "");
		String replace8 = replace5.replace(",", "");
		int productPrice4 = Integer.valueOf(replace8);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		System.out.println(productPrice4);
		if (productPrice4 >= productPrice1 || productPrice4 >= productPrice2 || productPrice4 >= productPrice3) {
			w.until(ExpectedConditions.elementToBeClickable(lp.getRemoveProduct4()));
			j.executeScript("arguments[0].click()", lp.getRemoveProduct4());
        	switchWindows();
			w.until(ExpectedConditions.elementToBeClickable(lp.getRemoveBtn()));
			j.executeScript("arguments[0].click()", lp.getRemoveBtn());
		}
		if (productPrice3 >= productPrice4 || productPrice3 >= productPrice1 || productPrice3 >= productPrice2) {
			w.until(ExpectedConditions.elementToBeClickable(lp.getRemoveProduct3()));
			j.executeScript("arguments[0].click()", lp.getRemoveProduct3());
			switchWindows();
			j.executeScript("arguments[0].click()", lp.getRemoveBtn());
		}
		if (productPrice2 >= productPrice3 || productPrice2 >= productPrice4 || productPrice2 >= productPrice1) {
			w.until(ExpectedConditions.elementToBeClickable(lp.getRemoveProduct2()));
			j.executeScript("arguments[0].click()", lp.getRemoveProduct2());
			switchWindows();
			w.until(ExpectedConditions.elementToBeClickable(lp.getRemoveBtn()));
			j.executeScript("arguments[0].click()", lp.getRemoveBtn());
		}
		if (productPrice1 >= productPrice2 || productPrice1 >= productPrice3 || productPrice1 >= productPrice4) {
			w.until(ExpectedConditions.elementToBeClickable(lp.getRemoveProduct1()));
			j.executeScript("arguments[0].click()", lp.getRemoveProduct1());
			switchWindows();
			w.until(ExpectedConditions.elementToBeClickable(lp.getRemoveBtn()));
			j.executeScript("arguments[0].click()", lp.getRemoveBtn());
		}

	}

	@Given("place order")
	public void place_order() {
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.elementToBeClickable(lp.getPlaceOrderBtn()));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", lp.getPlaceOrderBtn());

}}
