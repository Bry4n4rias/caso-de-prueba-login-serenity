Feature: Login in to E-commerce
  Scenario: Successful login
    Given Brayan Arias has an active account
    When he sends their valid credentials
    Then he should have access to his account