package com.project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCard {
	
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement title;
	
	public AddToCard(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTitle() {
		return title;
	}
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[1]")
	private WebElement Tshirts;

	public WebElement getTshirts() {
		return Tshirts;
	}
	
	@FindBy(xpath = "//img[@alt='Faded Short Sleeve T-shirts']")
	private WebElement buy;

	public WebElement getBuy() {
		return buy;
	}
	
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement plus;

	public WebElement getPlus() {
		return plus;
	}
	
	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement size;

	public WebElement getSize() {
		return size;
	}
	
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement AddtoCard1;

	public WebElement getAddtoCard1() {
		return AddtoCard1;
	}
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement Addtocard2;

	public WebElement getAddtocard2() {
		return Addtocard2;
	}
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement AddtoCard3;

	public WebElement getAddtoCard3() {
		return AddtoCard3;
	}
	
	@FindBy(xpath = "(//button[@type='submit'])[2]" )
	private WebElement ProceedtoCheckout;

	public WebElement getProceedtoCheckout() {
		return ProceedtoCheckout;
	}
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;

	public WebElement getCheckbox() {
		return checkbox;
	}
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement Shipping;

	public WebElement getShipping() {
		return Shipping;
	}
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement Payment;

	public WebElement getPayment() {
		return Payment;
	}
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
	private WebElement ConfirmOrder;

	public WebElement getConfirmOrder() {
		return ConfirmOrder;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
