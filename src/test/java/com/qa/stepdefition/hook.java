package com.qa.stepdefition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.base.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hook extends base{
	
	@Before
	public void beforeclass() {
		 base.intilization();
		 driver.get("http://omayo.blogspot.com" );
		
		
	}
	
@After
public void afterclass(Scenario sc) {
	if(sc.isFailed()) {
		final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(screenshot, "image/png", sc.getName());
		driver.quit();
		
		
	}
	
	driver.quit();
}


}
