#Author: lenisalejo@gmail.com

Feature: User Sign In
  As a Web User
  I want to register on Advantage demo
  to buy something

  Scenario: AdvantageDemo Platform Sign in
    Given that user get to AdvantageDemo shopping page
    And   access to Sign In form
    When  I fill all the required fields
    Then  I should be successfully logged on

