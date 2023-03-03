package com.qa.stepdefition;

import java.io.IOException;

import com.qa.base.base;
import com.qa.pageobject.qafoxhome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class searchsteps extends base {
	qafoxhome qa=new qafoxhome(driver);
	@Given("user enter {string} in search box")
	public void user_enter_in_search_box(String string) {
	   qa.searchbox(string);
	}
	@When("user clik on search button")
	public void user_clik_on_search_button() {
		qa.submit().click();
	    
	}
	@Then("user Should see not found massage")
	public void user_should_see_not_found_massage() {
	  String text=qa.message().getText();
	  System.out.println(text);
	  assertEquals("No posts matching the query: phone. Show all posts",text);
	}

	
	
	

}
