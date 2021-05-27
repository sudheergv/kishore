package com.wordpress.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/features/"},
		glue = {"com.wordpress.stepdefinitions"},
//		tags={"@smoke"},
		plugin ={ "pretty" , "html:target/cucumber", "json:target/report/json/"}
		)
public class AllRunner 
{

}


//NOTE - all the features files which are features folder will be executed
//features={"src/test/resources/features/"},
