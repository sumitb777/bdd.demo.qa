package com.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class qafoxhome  {
	
	public WebDriver driver;
	public qafoxhome (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='multiselect1']")
		WebElement drop;
	
	public WebElement drop() {
		return drop;
	}
@FindBy(xpath="//option[@value='swiftx']")
WebElement swift;
public WebElement swift() {
	return swift;
}

@FindBy(id="drop1")
WebElement drop2;
public WebElement drop2() {
	
	return drop2;
}
@FindBy(id="ironman4")
WebElement doc3;
public WebElement doc3() {
	return doc3;
}

@FindBy(xpath="//input[@name='q']")
WebElement searchbox;
@FindBy(xpath="//input[@type='submit']")
WebElement submit;

@FindBy(xpath="//div[@class='status-msg-body']")
WebElement message;

public void searchbox(String ph) {
this.searchbox.sendKeys(ph);

}
public WebElement submit() {
	return submit;
	
}
public WebElement message() {
	return message;
	
}

}
