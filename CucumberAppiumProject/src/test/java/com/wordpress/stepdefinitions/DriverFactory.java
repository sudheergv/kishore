package com.wordpress.stepdefinitions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.wordpress.utils.ReadProperties;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {
	static AppiumDriver<WebElement> driver;
	public static ReadProperties configProp = new ReadProperties("./src/test/resources/config/config.properties");

	public void initializeDriver() throws MalformedURLException {
		if (driver == null) {
			String platform_name = configProp.getPropertyValue("platform_name");
			String platform_version = configProp.getPropertyValue("platform_version");
			String device_name = configProp.getPropertyValue("device_name");
			String browser_name = configProp.getPropertyValue("browser_name");
			if (platform_name.equalsIgnoreCase("android")) {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platform_name);
				caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platform_version);
				caps.setCapability(MobileCapabilityType.DEVICE_NAME, device_name);
				caps.setCapability(MobileCapabilityType.BROWSER_NAME, browser_name); // "chrome"
				caps.setCapability("avd", "Nexus_4_API_21");
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			}else {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platform_name);
				caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platform_version);
				caps.setCapability(MobileCapabilityType.DEVICE_NAME, device_name);
				File file = new File("/Users/dnreddy/Documents/Appium/iosHybrid.app");
				caps.setCapability(MobileCapabilityType.APP,file );
				driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			}
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

			driver.manage().window().maximize();

		}
	}
}
