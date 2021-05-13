package com.wordpress.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/features/Profile.feature"},
		glue = {"com.wordpress.stepdefinitions"},
		tags = {"@chrome"},
		plugin ={ "pretty" , "html:target/cucumber", "json:target/report/json/report-profile.json"}
		)
public class ProfileTestRunner {

}
