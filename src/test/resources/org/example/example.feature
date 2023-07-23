Feature: An example

  Scenario: Valid email US
    Given I am on the main page
    When the email value of "tester@tester.com" is inputted
    And the submit button is clicked

  Scenario: Valid email RO
    Given I am on the main page
    When the email value of "kljjlkdjf@jkhdj.com" is inputted
    And the submit button is clicked

  Scenario: Click on Fundamentals Read More button
    Given I am on the main page
    When the learn the fundamentals read more button is clicked

  Scenario: Click on What You'll Learn Button
    Given I am on the main page
    When the what you'll learn button is clicked

  Scenario: Click on Enrollment Button
    Given I am on the main page
    When the Start Enrollment Button is clicked

  Scenario: (Negative) Sign Up
    Given I am on the Sign Up page
    When the first name value of "alex" is inputted
    And the last name value of "man" is inputted
    And the next button on Sign Up page is clicked

 Scenario: (Positive) Sign Up
   Given I am on the Sign Up page
   When the first name value of "Alex" is inputted
   And the last name value of "man" is inputted
   * the username value of "alex first" is inputted
   * the password value of "abc" is inputted
   * the confirm password of "abc" is inputted
   * the next button on Sign Up page is clicked

 Scenario: Contact Information
   Given I am on the contact information page
   When the email value on contact information page of "alex@gild.com" is inputted
   And the phone number of "08563839470" is inputted
   * the country value of "China" is inputted






