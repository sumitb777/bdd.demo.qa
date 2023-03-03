package com.qa.stepdefition;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.base;
import com.qa.pageobject.qafoxhome;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reuseable.waits;

public class dropdownsteps extends base {
	
	Select select;
	Select select2;
	qafoxhome qa=new qafoxhome(driver);;
	
	@Given("dropdown webelement")
	public void dropdown_webelement() {
		 select=new Select(qa.drop());
	   
	     
	}
	@When("select swift")
	public void select_swift() {
		   
        select.selectByIndex(1);
       
	}
	@Then("swift shoul selected")
	public void swift_shoul_selected() {
		 
		boolean s=	qa.swift().isSelected();
		  assertEquals(true,s);
	    }

	@Given("dropdwon elemnt")
	public void dropdwon_elemnt() {
		select2=new Select(qa.drop2());
	   
	}
	@When("selected doc3 option")
	public void selected_doc3_option() {
	waits.excipicitlywait(qa.doc3());	
		select2.selectByVisibleText("doc 3");

	    
	}
	@Then("doc3 shiuld selected")
	public void doc3_shiuld_selected() {
		boolean a=qa.doc3().isSelected(); 
		
		assertEquals(true,a);
	    
	}





}
