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
		
		@After public void afterScenario()
		{
			driver.close();
			driver = null;
		}
}
