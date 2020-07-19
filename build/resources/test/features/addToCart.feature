#Author: lenisalejo@gmail.com

Feature: AdvantageDemo Suite
  As a Web User
  I want to register on Advantage demo
  to buy something

  Scenario: AdvantageDemo Platform Sign in
    Given that Alejo get to shopping page
    When  he signs in with username "rosgordo" email "gordis19@outlook.com" and password "Gordolo123s"
    Then  he should be successfully logged on with username "rosgordo"

  Scenario: AdvantageDemo Platform Log in
    Given that Alejo get to shopping page
    When  he enters his valid data
    Then  he should be successfully logged on with username "rosgordo"

  Scenario: Add a product in shopping cart
    Given that Alejo get to shopping page
    When  he enters his valid data
    And   he choose a product
    Then  he should see the product in the cart

      ##that_susan_Wants_to_translate_some_words() --------------> Underscore
      ##thatSusanWantsToTranslateSomeWords()---------------------> Camel Case