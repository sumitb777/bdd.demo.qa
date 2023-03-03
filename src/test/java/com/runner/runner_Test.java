package com.runner;





import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\qa\\feature",glue = "com\\qa\\stepdefition",plugin={"pretty",
		"json:target/json-report/cucumber.json"
,"html:target/htmlreport/cucumber.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class runner_Test {
	
	
	
	
}
