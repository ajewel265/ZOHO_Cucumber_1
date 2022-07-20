Feature: Sign Up Now


  Scenario: Register new Account

    Given User should be in SignUpNow page
    When Enter Company Name
    When Email Address
    And Mobile Number
    And Password
    Then Select the Country
