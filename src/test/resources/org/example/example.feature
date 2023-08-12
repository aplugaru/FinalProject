Feature: An example

  Scenario: Valid email US
    Given I am on the main page
    When the email value of "tester@tester.com" is inputted
    And the submit button is clicked
    Then the newsletter confirmation pop-up appears

  Scenario: Valid email RO
    Given I am on the main page
    When the email value of "kljjlkdjf@jkhdj.com" is inputted
    And the submit button is clicked
    Then the newsletter confirmation pop-up appears

  Scenario: Click on Fundamentals Read More button
    Given I am on the main page
    When the learn the fundamentals read more button is clicked
    Then the page "Fundamentals" opens

  Scenario: Click on What You'll Learn Button
    Given I am on the main page
    When the what you'll learn button is clicked
    Then the button scrolls down to "Fundamentals Page section" section

  Scenario: Click on Enrollment Button
    Given I am on the main page
    When the Start Enrollment Button is clicked
    Then the page "Software Testing | Enrollment" opens


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
   Then the 2nd page "Contact information" opens

 Scenario: Contact Information
   Given I am on the contact information page
   When the email value on contact information page of "alex@gild.com" is inputted
   And the phone number of "08563839470" is inputted
   * the country value of "China" is inputted
   * the city value of "Pong" is inputted
   * the postal code value of "364780" is inputted
   * the next button on contact information page is clicked
   Then the 3d page of "Course options" opens

Scenario: Course Options
  Given I am on the course options page
  When the button for Software Testing-Manual tester certificate is clicked
  And the next button on Course Option page is clicked
  Then the 4th page "Payment information" opens

 Scenario: Payment Information
   Given I am on the payment information page
   When the card holder name of "XXX JJJ" is inputted
   And the card number of "978493783498" is inputted
   * the cvc value of "3456" is inputted
   * the month on expiry date section is clicked
   * the year on expiry date section is clicked
   * the next button on payment information page is clicked






