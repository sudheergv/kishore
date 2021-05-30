package com.wordpress.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.AppiumDriver;

public class LoginPage {

	WebDriver driver;

	@FindBy(how = How.ID, using = "usernameOrEmail")
	public WebElement userNameText;

	@FindBy(how = How.ID, using = "password")
	public WebElement passwordText;

	@FindBy(how = How.XPATH, using = "//button[text()='Continue']")
	public WebElement continueButton;

	@FindBy(how = How.XPATH, using = "//button[text()='Log In']")
	public WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//span[text()='User does not exist.']")
	public WebElement invalidMessage;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setUserName(String username) {
		userNameText.clear();
		userNameText.sendKeys(username);
	}

	public boolean isUserNameExists() {
		return userNameText.isDisplayed();
	}

	public void setPassword(String password) {
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		passwordText.clear();
		passwordText.sendKeys(password);
	}

	public void clickOnContinueButton() {

		continueButton.click();
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public boolean isUserIvalidMessageExists() {
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return invalidMessage.isDisplayed();
	}

}
