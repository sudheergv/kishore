package com.wordpress.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.pages.DashboardPage;
import com.wordpress.pages.HomePage;
import com.wordpress.pages.LoginPage;
import com.wordpress.pages.ProfilePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProfileStepDefintion extends DriverFactory{
	
	ProfilePage pPage = PageFactory.initElements(driver, ProfilePage.class);
	DashboardPage dPage = PageFactory.initElements(driver, DashboardPage.class);
	
	@When("click on profile icon")
	public void click_on_profile_icon() {
		dPage.clickOnProfileIcon();
	}

	@Then("profile page should display")
	public void profile_page_should_display() {
		boolean result = pPage.isFirstNameExists();
		Assert.assertTrue("Profile page should be displayed",  result);
	}

	@When("enter first name {string}")
	public void enter_first_name(String firstName) {
		pPage.setFirstName(firstName);
	}

	@When("enter last name {string}")
	public void enter_last_name(String lastName) {
		pPage.setLastName(lastName);
	}

	@When("enter display name {string}")
	public void enter_display_name(String displayName) {
		pPage.setDisplayName(displayName);
	}

	@When("enter about me {string}")
	public void enter_about_me(String aboutMe) {
		WebElement element = driver.findElement(By.id("description"));
		element.clear();
		element.sendKeys(aboutMe);
	}

	@When("click on save profile button")
	public void click_on_save_profile_button() {
		pPage.clickOnSaveProfileButton();
	}

	@Then("profile page should be successfully saved")
	public void profile_page_should_be_successfully_saved() {
		boolean result = pPage.isProfileSaveSuccesfulNoteDisplayed();
		Assert.assertTrue("Note should be displayed",result);
	}
}
