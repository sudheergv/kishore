package com.wordpress.stepdefinitions;

import com.wordpress.stepdefinitions.DriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.runtime.RuntimeOptions;

public class Hooks extends DriverFactory
{
		
		@Before public void beforeScenario_launchChrome()
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
