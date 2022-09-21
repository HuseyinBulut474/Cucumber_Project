Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

#Admin User should be able to Add Positions,
#Edit Positions and Delete Positions for setting up
#human resources details for management of schools.
#Positions tab should be under Human Resources > Setup tab.
  Scenario:Create an Category
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | departments |
    And Click on the element in the Dialog
      | stage     |
      | newauch   |
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | aaa    |
      | codeInput | 200020 |
    And Click on the element in the Dialog
      | saveButton |
    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | searchInput | AAAAAAAA |
    And Click on the element in the Dialog
      | saveButton |
    And Click on the element in the Dialog
      | deleteButton    |
      | deleteDialogBtn |
    And Success message should be displayed





