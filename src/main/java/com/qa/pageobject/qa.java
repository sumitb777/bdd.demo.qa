package com.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class qa {
WebDriver driver;
	
	public qa(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(xpath="//input[@name='userid']")
	WebElement user;
	
	@FindBy(xpath="//input[@name='pswrd']")
	WebElement pass;
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	public void user() {
		this.user.sendKeys("sumit");
	}
	public void pass() {
		this.pass.sendKeys("123");
		
	}
	public void login() {
		this.login.click();
		
		
	}
	
	}

