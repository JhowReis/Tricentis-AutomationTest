Feature: Send email.
  A Tricentis user wants to send an email.

@success
 Scenario: Send email successfully
    Given the Automobile Insurance is displayed
    When the user fills in all tabs correctly
    And the user sends the email
    Then the success message appears
