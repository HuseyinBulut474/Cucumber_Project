Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario:Create an Category
    And Click on the element in the left Nav
      | humanResources |
      | setupThree     |
      | position       |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | AAAAAAAAAAAA |
    And Click on the element in the Dialog
      | saveButton  |
      | editButton2 |
    And User sending the keys in Dialog content
      | nameInput | AAAAAAAAAAAAaaaaa |
    And Click on the element in the Dialog
      | saveButton      |
      | deleteButton    |
      | deleteDialogBtn |
    And Success message should be displayed





