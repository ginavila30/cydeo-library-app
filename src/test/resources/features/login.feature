@login @smoke
Feature: login

  User Story: As a user I should be able to login and successfully access Library page

  Scenario Outline: User logs in with valid username and valid password

    Given User is on login page
    When  User enters valid username "<Username>" and User enters valid password "<Password>"
    Then User should see "<TitleName>" page title and URL should contain "<URLContains>"

    Examples:
      | Username           | Password | TitleName | URLContains |
      | student1@library   | i2A9TgXa | Library   | books       |
      | librarian1@library | rs4BNN9G | Library   | dashboard   |




