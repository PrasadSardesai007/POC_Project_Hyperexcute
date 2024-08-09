package com.pncbank.qa.hyperexecute;

import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeOptions;

public class JUnitTodo {

	public void junitCapabilities() {
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("127");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "prasad.sardesai");
		ltOptions.put("accessKey", "eggZxKARjgMChcmUu0wfVlRTCMtOUIiZD5bUlGici2B4Odka2t");
		ltOptions.put("build", "PNC_Bank_Test_Build");
		ltOptions.put("project", "PNC_Bank_Test");
		ltOptions.put("smartUI.project", "PNC_Bank_Project");
		ltOptions.put("name", "Sample_Test");
		ltOptions.put("w3c", true);
		ltOptions.put("plugin", "java-junit");
		browserOptions.setCapability("LT:Options", ltOptions);
	}

	
}
