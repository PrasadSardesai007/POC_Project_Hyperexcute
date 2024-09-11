package com.pncbank.qa.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.pncbank.qa.stepdefinations", "com.pncbank.qa.apphooks" }, 
plugin = {
		"pretty" }, tags = "@Test1")
public class TestRunner {

}
