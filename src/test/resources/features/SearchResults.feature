Feature: TC#5 Data table task
  As a user, I should be able to login as a librarian 2 on env 1

  @table
  Scenario: Table columns names
    Given I am a librarian logged in on dashboard page
    When I click on "Users" link
    Then table should have following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |