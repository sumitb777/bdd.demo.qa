package com.qa.stepdefition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.base;
import com.qa.pageobject.qa;

import static org.junit.Assert.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepd extends base{

	
	qa q;
	@Given("website is open")

	public void website_is_open() {
	
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,1450)", "");
	}

	@When("user enter username and pass")
	public void user_enter_username_and_pass() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='userid']")));
		q=new qa(driver);
		q.user();
	   q.pass();
	}

	@And("user Click login")
	public void user_click_login() {
	   q.login();
	}

	@Then("massege should shown")
	public void massege_should_shown() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert a=wait.until(ExpectedConditions.alertIsPresent());
		String s=a.getText();
		a.accept();
	    assertEquals("Error Password or Username",s);
	}

	
}
