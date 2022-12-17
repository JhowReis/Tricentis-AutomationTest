@sendEmail
Feature: Send email.
  A Tricentis user wants to send an email.

  Background:
    Given the Automobile Insurance Page is displayed


  @successEmail
  Scenario: Send email successfully
    When the user fills Enter Vehicle Data tab
    And the user fills Enter Insurance tab
    And the user fills Enter Product Data tab
    And the user fills Select Price Options tab
    And the user fills Send Quote tab
    And the user sends the email
    Then the success message appears
