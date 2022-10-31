Feature: Register in to E-commerce
  Scenario: Successful register
    Given Brayan Arias has not an account
    When he sends their valid data
    Then he should has a new account