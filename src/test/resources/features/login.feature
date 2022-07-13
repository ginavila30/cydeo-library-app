@login @smoke
Feature: login

  User Story: As a user I should be able to login and successfully access Library page

  Background:
    Given User is on login page

  Scenario Outline: User logs in with valid username and valid password

    When  User enters valid username "<Username>" and User enters valid password "<Password>"
    Then User should see "<TitleName>" page title and URL should contain "<URLContains>"

    Examples:
      | Username           | Password | TitleName | URLContains |
      | student1@library   | i2A9TgXa | Library   | books       |
      | librarian1@library | rs4BNN9G | Library   | dashboard   |

  Scenario Outline: User logs in with invalid username and invalid password

    When  User enters invalid username "<Username>" and User enters invalid password "<Password>"
    Then User should see error message "Sorry, Wrong Email or Password"

    Examples:
      | Username             | Password    |
      | student1@libraries   | invalid123  |
      | librarian1@libraries | invalid 123 |

@testingExcel
  Scenario Outline: Verify user information "email"

    When I login using email <rowNum> <emailColNum> and password <passwordColNum>
    Then account holder name should be <rowNum> <nameColNum>

    Examples:
      | rowNum | emailColNum | passwordColNum | nameColNum |
      | 0      | 1           | 2              | 0          |
      | 1      | 1           | 2              | 0          |
      | 2      | 1           | 2              | 0          |
      | 3      | 1           | 2              | 0          |
      | 4      | 1           | 2              | 0          |
      | 5      | 1           | 2              | 0          |






