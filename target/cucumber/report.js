$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featureFiles/users.feature");
formatter.feature({
  "name": "Automate As an Engineer Candidate I need to automate http://www.way2automation.com/angularjs-protractor/webtables/ So I can show my automation capabilities",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add a user and validate the user has been added to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddUser"
    }
  ]
});
formatter.step({
  "name": "I click the Add User button",
  "keyword": "When "
});
formatter.step({
  "name": "I enter \"\u003cFirstName\u003e\", \"\u003cLastName\u003e\", \"\u003cUserName\u003e\",\"\u003cPassword\u003e\", \"\u003cCustomer\u003e\" ,  \"\u003cRole\u003e\", \"\u003cE-mail\u003e\", \"\u003cCellPhone\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I click Save button",
  "keyword": "And "
});
formatter.step({
  "name": "I validate the user has been added to the table \"\u003cFirstName\u003e\", \"\u003cLastName\u003e\",\"\u003cUserName\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "UserName",
        "Password",
        "Customer",
        "Role",
        "E-mail",
        "CellPhone"
      ]
    },
    {
      "cells": [
        "TestOne",
        "TestTwo",
        "testing",
        "12345",
        "Company AAA",
        "Customer",
        "margaryta@evisortteam.com",
        "12345444"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on a Way2Automation website",
  "keyword": "Given "
});
formatter.match({
  "location": "testSteps.i_am_on_a_way2automation_website()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a user and validate the user has been added to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddUser"
    }
  ]
});
formatter.step({
  "name": "I click the Add User button",
  "keyword": "When "
});
formatter.match({
  "location": "testSteps.i_click_the_add_user_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"TestOne\", \"TestTwo\", \"testing\",\"12345\", \"Company AAA\" ,  \"Customer\", \"margaryta@evisortteam.com\", \"12345444\"",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.i_enter(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Save button",
  "keyword": "And "
});
formatter.match({
  "location": "testSteps.i_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the user has been added to the table \"TestOne\", \"TestTwo\",\"testing\"",
  "keyword": "And "
});
formatter.match({
  "location": "testSteps.i_validate_the_user_has_been_added_to_the_table(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Delete user and validate the user has been deleted",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DeleteUser"
    }
  ]
});
formatter.step({
  "name": "I click Delete button for \"\u003cFirstName\u003e\" and \"\u003cLastName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click OK button",
  "keyword": "Then "
});
formatter.step({
  "name": "the User \"\u003cFirstName\u003e\",\"\u003cLastName\u003e\" is removed from the table",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName"
      ]
    },
    {
      "cells": [
        "Mark",
        "Novak"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on a Way2Automation website",
  "keyword": "Given "
});
formatter.match({
  "location": "testSteps.i_am_on_a_way2automation_website()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete user and validate the user has been deleted",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DeleteUser"
    }
  ]
});
formatter.step({
  "name": "I click Delete button for \"Mark\" and \"Novak\"",
  "keyword": "When "
});
formatter.match({
  "location": "testSteps.i_click_delete_button_for_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click OK button",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.i_click_ok_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User \"Mark\",\"Novak\" is removed from the table",
  "keyword": "And "
});
formatter.match({
  "location": "testSteps.the_user_is_removed_from_the_table(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});