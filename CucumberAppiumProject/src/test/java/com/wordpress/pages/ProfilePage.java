package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.AppiumDriver;

public class ProfilePage 
{
	
		WebDriver driver;
		
		@FindBy(how=How.ID,using="first_name")
		public WebElement firstNameText;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Settings saved successfully!']")
		public WebElement savesucessfullMsg;
		
		@FindBy(how = How.XPATH, using = "//button[text()='Save Profile Details']")
		public WebElement saveProfileButton;
		
		@FindBy(how = How.ID, using = "last_name")
		public WebElement lastNameText;

		@FindBy(how = How.ID, using = "display_name")
		public WebElement displayNameText;

		@FindBy(how = How.ID, using = "description")
		public WebElement aboutMeText;
		
		
					
		public ProfilePage(WebDriver driver)
		{
			this.driver = driver;
		}
		
		
		public boolean isFirstNameExists()
		{
			return firstNameText.isDisplayed();
		}
		public void setFirstName(String firstName)
		{
			firstNameText.clear();
			firstNameText.sendKeys(firstName);
		}
		
		public void setLastName(String lastName)
		{
			lastNameText.clear();
			lastNameText.sendKeys(lastName);
		}
		
		public void setDisplayName(String displayName)
		{
			displayNameText.clear();
			displayNameText.sendKeys(displayName + System.currentTimeMillis());
		}
		
		public void setAboutMe(String aboutMe)
		{
			aboutMeText.clear();
			aboutMeText.sendKeys(aboutMe);
		}
		
		public void clickOnSaveProfileButton()
		{
			saveProfileButton.click();
		}
		
		public boolean isProfileSaveSuccesfulNoteDisplayed()
		{
			return savesucessfullMsg.isDisplayed();
		}
}
