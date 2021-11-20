package com.project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	public WebDriver driver;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement MailId;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement submit;

	public SignInPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMailId() {
		return MailId;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getSubmit() {
		return submit;
	}
	

}
