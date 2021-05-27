package com.wordpress.stepdefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends DriverFactory
{
		
		@Before public void beforeScenario_launchChrome() throws MalformedURLException
		{
			initializeDriver();
		}
		
		@After
		public void afterScenario(Scenario s) {
			System.out.println("afterScenario");
			if (s.isFailed()) {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				s.embed(screenshot, "image/png");
			}
			driver.close();
			driver = null;
		}
}
