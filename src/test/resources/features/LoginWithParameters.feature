@TC#3
Feature: TC#3
  Create 2 scenarios for different user logins with parameterization:
  - librarian
  - student

  Background:
    Given I am on the log in page

  @parameterization1
  Scenario: Login as Librarian 1
    When I enter username "librarian1@library" and password "rs4BNN9G" and click the sign in button
    Then URL should contains "dashboard"

  @parameterization2
  Scenario: Login as Student 1
    When I enter username "student1@library" and password "i2A9TgXa" and click the sign in button
    Then URL should contains "books"
