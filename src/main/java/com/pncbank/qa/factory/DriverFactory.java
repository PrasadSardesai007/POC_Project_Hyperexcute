package com.pncbank.qa.factory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public RemoteWebDriver driver;
	//public WebDriver driver;
	public static ThreadLocal<RemoteWebDriver> tlDriver = new ThreadLocal<RemoteWebDriver>();
	//public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	
	public WebDriver init_driver(String browser) throws MalformedURLException {

		System.out.println("Browser Value is: " + browser);

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			// Use local ChromeDriver if needed
		tlDriver.set(new ChromeDriver());

		} else if (browser.equalsIgnoreCase("remote")) {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("browserName", "Chrome");
			capabilities.setCapability("browserVersion", "127");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "prasad.sardesai");
			ltOptions.put("accessKey", "eggZxKARjgMChcmUu0wfVlRTCMtOUIiZD5bUlGici2B4Odka2t");
			ltOptions.put("platformName", "Windows 10");
			ltOptions.put("project", "Untitled Project");
			ltOptions.put("build", "Build 1");
			ltOptions.put("name", "Sample Test");
			//ltOptions.put("selenium_version", "4.8.0");
			capabilities.setCapability("LT:Options", ltOptions);
			
			String gridURL = "hub.lambdatest.com/wd/hub";
			String username = ltOptions.get("username").toString();
			String accessKey = ltOptions.get("accessKey").toString();
			tlDriver.set(new RemoteWebDriver(new URL("http://prasad.sardesai:eggZxKARjgMChcmUu0wfVlRTCMtOUIiZD5bUlGici2B4Odka2t@hub.lambdatest.com/wd/hub"), capabilities));
			
		} else {

			System.out.println("Please pass the correct browser value: " + browser);
		}

		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		return getDriver();
	}

	/*
	 * This is used to get driver with ThreadLocal
	 */
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}

}
