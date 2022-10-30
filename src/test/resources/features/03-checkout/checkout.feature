Feature: Carry out the payment process
  Scenario: Your order on My Store is complete
    Given Brayan Arias wants to buy a product
    When he logs and complete all steps of the order
    Then He should have the purchase confirmation and order number