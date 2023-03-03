Feature: search
@sanity
  Scenario: test searching feature
    Given user enter "phone" in search box
    When user clik on search button
    Then user Should see not found massage
