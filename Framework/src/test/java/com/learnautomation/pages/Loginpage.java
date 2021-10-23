package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	WebDriver driver;
//this is a new commit by pearly
	public Loginpage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(name = "email")
	WebElement uname;
	@FindBy(name = "password")
	WebElement pass;
	@FindBy(xpath = "//div[text()='Login']")
	WebElement loginbutton;

	public void LoginToCRM(String usernameApplication, String passwordApplication) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		uname.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginbutton.click();
	}

}
