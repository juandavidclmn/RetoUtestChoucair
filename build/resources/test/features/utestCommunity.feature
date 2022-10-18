#Autor Juan Celemín

@stories
Feature: Utest Community
  As a user, I want to be able to register on the official website of Utest
  @scenario1
  Scenario Outline: Create a new user
    Given that Juan wants to register on the page
    When he enters the required information in the form
      |strName  |strLastName  |strEmail   |strPassword  |strConfirmPassword  |
      |<strName>|<strLastName>|<strEmail> |<strPassword>|<strConfirmPassword>|
    Then a successful registration message is displayed
    |strConfirmation|
    |<strConfirmation>|

    Examples:
      |strName   |strLastName  |strEmail       |strPassword     |strConfirmPassword    |strConfirmation                                                        |
      |Juan David|Celemin Rojas|juan58@gmail.com|Celemin.Rojas07 |Celemin.Rojas07      |Welcome to the world's largest community of freelance software testers!|