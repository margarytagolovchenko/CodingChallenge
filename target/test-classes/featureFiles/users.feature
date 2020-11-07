Feature: Automate As an Engineer Candidate I need to automate http://www.way2automation.com/angularjs-protractor/webtables/ So I can show my automation capabilities

  Background:
    Given I am on a Way2Automation website

  @AddUser
  Scenario Outline: Add a user and validate the user has been added to the table
    When I click the Add User button
    Then I enter "<FirstName>", "<LastName>", "<UserName>","<Password>", "<Customer>" ,  "<Role>", "<E-mail>", "<CellPhone>"
    And I click Save button
    And I validate the user has been added to the table "<FirstName>", "<LastName>","<UserName>"


    Examples:
      | FirstName | LastName | UserName | Password | Customer   | Role     | E-mail                     |  CellPhone  |
      | TestOne   | TestTwo  | testing  | 12345    | Company AAA| Customer | margaryta@evisortteam.com  | 12345444    |

  @DeleteUser
  Scenario Outline: Delete user and validate the user has been deleted
    When I click Delete button for "<FirstName>" and "<LastName>"
    Then I click OK button
    And the User "<FirstName>","<LastName>" is removed from the table

    Examples:
      | FirstName | LastName |
      | Mark      | Novak    |
