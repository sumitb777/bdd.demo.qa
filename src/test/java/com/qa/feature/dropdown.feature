Feature: qa fox

  Background: open chrome browser
     open "http://omayo.blogspot.com" website


  @Smoke
  Scenario: dropdown selection
    Given dropdown webelement
    When select swift
    Then swift shoul selected

  @sanity
  Scenario: dropdown select2
    Given dropdwon elemnt
    When selected doc3 option
    Then doc3 shiuld selected
