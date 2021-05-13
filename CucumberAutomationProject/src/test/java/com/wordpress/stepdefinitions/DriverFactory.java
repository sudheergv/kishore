package com.wordpress.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.wordpress.utils.ReadProperties;

public class DriverFactory {
	static WebDriver driver;
	public static ReadProperties configProp = new ReadProperties("./src/test/resources/config/config.properties");

	public void initializeDriver() {
		if (driver == null) {
			String browser = configProp.getPropertyValue("browser_name");
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"/usr/local/geckodriver_mac");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/usr/local/chromedriver_mac");
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
}
