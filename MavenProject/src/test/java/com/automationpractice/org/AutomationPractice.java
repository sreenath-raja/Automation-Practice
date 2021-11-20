 package com.automationpractice.org;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.baseclass.BaseClsMaven;
import com.project.pom.AddToCard;
import com.project.pom.HomePage;
import com.project.pom.SignInPage;

public class AutomationPractice extends BaseClsMaven {
	public static WebDriver driver;

	@BeforeTest
	public void automationSite() throws InterruptedException {
		driver = Getbrowser("chrome");
		geturl("http://automationpractice.com/index.php");
	}

	@Test(priority = 1)
	public void sitePages() throws Throwable {
		HomePage hp = new HomePage(driver);
		clickonElement(hp.getSignin());

		SignInPage sp = new SignInPage(driver);
		inputtoElement(sp.getMailId(), "vovogoh998@1heizi.com");
		inputtoElement(sp.getPwd(), "abc@123");
		clickonElement(sp.getSubmit());
	}
	
	@Test(priority = 2)
	public void paymentPage() throws Throwable {
		
		AddToCard atc = new AddToCard(driver);
		movetoElement(atc.getTitle());
		clickonElement(atc.getTshirts());
		clickonElement(atc.getBuy());
		frame(0);
		clickonElement(atc.getPlus());
		Selection(atc.getSize(), "byvalue", "2");
		clickonElement(atc.getAddtoCard1());
		Thread.sleep(3000);
		clickonElement(atc.getAddtocard2());
		Thread.sleep(2000);
		clickonElement(atc.getAddtoCard3());
		clickonElement(atc.getProceedtoCheckout());
		clickonElement(atc.getCheckbox());
		clickonElement(atc.getShipping());
		clickonElement(atc.getPayment());
		clickonElement(atc.getConfirmOrder());
	}

	@AfterTest
	public void browserClose() {
		driver.close();
	}

}
