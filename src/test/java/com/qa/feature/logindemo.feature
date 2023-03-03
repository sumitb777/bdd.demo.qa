Feature: logindemo

  Scenario: user should log in
    Given website is open
    When user enter username and pass
    And user Click login
    Then massege should shown
