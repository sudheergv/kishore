package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.AppiumDriver;

public class DashboardPage {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[text()='My Profile']")
	public WebElement profileIcon;

	public DashboardPage(AppiumDriver<WebElement> driver) {
		this.driver = driver;
	}

	public void clickOnProfileIcon() {

		profileIcon.click();
	}

	public boolean isProfileIconExists() {
		boolean result = profileIcon.isEnabled();
		return result;
	}
}
