Feature: An example

  Scenario: Valid email US
    Given I am on the main page
    When the email value of "tester@tester.com" is inputted
    And the submit button is clicked
    Then the newsletter confirmation pop-up appears

  Scenario: (Negative) Invalid email US
    Given I am on the main page
    When the email value of "agsb" is inputted
    And the submit button is clicked
    Then the newsletter confirmation pop-up appears

  Scenario: (end to end) Click on What You'll Learn Button
    Given I am on the main page
    When the what you'll learn button is clicked
    And the button scrolls down to "Learn The Fundamentals" section
    * the learn the fundamentals read more button is clicked
    Then the page "Fundamentals" opens

  Scenario: Click on Enrollment Button
    Given I am on the main page
    When the Start Enrollment Button is clicked
    Then the page "Software Testing | Enrollment" opens

 Scenario: (End to End) Payment Information Page
   Given I am on the payment information page
   When the card holder name of "XXX JJJ" is inputted
   And the card number of "978493783498" is inputted
   * the cvc value of "3456" is inputted
   * the month on expiry date section is clicked
   * the year on expiry date section is clicked
   * the next button on payment information page is clicked
   Then the 5th page "Success!" opens
   And the return to homepage button is clicked
   Then the page "Software Testing Course" opens


  Scenario: (Negative) Payment Information Page
    Given I am on the payment information page
    When the card holder name of "XXX JJJ" is inputted
    And the card number of "978493783498" is inputted
    * the month on expiry date section is clicked
    * the year on expiry date section is clicked
    * the next button on payment information page is clicked
    Then the 4th page "Payment information" opens

   Scenario: Questions sector
     Given I am on the main page
     When the questions button is clicked
     And the where is your institution located button is click
     Then the questions information slides down
     And the what do I need to know beforehand button is clicked







