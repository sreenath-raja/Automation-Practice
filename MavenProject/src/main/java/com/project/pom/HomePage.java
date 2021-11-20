package com.project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver1) {
		this.driver= driver1;
		PageFactory.initElements(driver, this );
	}
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;
	
	public WebElement getSignin() {
		return signin;
	}

	
	

}
