package com.wordpress.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.pages.DashboardPage;
import com.wordpress.pages.HomePage;
import com.wordpress.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import static io.github.bonigarcia.wdm.DriverManagerType.FIREFOX;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefintions extends DriverFactory
{
	HomePage hPage = new HomePage(driver); //without page factory
	LoginPage lPage = PageFactory.initElements(driver, LoginPage.class); //with page factory
	DashboardPage dPage = PageFactory.initElements(driver, DashboardPage.class);
	
	@Given("open the browser and load the wordpress")
	public void open_the_browser_and_load_the_wordpress() {
		driver.get("https://wordpress.com/");  
	}

	@When("click on login link")
	public void click_on_login_link() {
		hPage.clickOnLoginLink();
	}

	@Then("login page should be displayed")
	public void login_page_should_be_displayed() {
		boolean result = lPage.isUserNameExists();
		 Assert.assertTrue("Dashboard page should be displayed",result);
	}

	@When("enter user name {string}")
	public void enter_user_name(String username) {
		lPage.setUserName(username);
	}

	@When("click on continue button")
	public void click_on_continue_button() {
		lPage.clickOnContinueButton();
	}

	@When("enter password {string}")
	public void enter_password(String password) {
		lPage.setPassword(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
		lPage.clickOnLoginButton();
	}

	@Then("dashboard page should be displayed")
	public void dashboard_page_should_be_displayed() {
		 boolean result  = dPage.isProfileIconExists();
		 Assert.assertTrue("Dashboard page should be displayed",result);
	}
	
	@Then("userName error message should appear")
	public void username_error_message_should_appear() {
		 boolean result = lPage.isUserIvalidMessageExists();
		  Assert.assertTrue("UserName Error Msg should appear",result);
	}
	
	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
		driver = null;
	}
	
	@Then("Login should be failed")
	public void login_should_be_failed() {
	   
	}

}
