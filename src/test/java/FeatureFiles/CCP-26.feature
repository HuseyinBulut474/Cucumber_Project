Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

#  Admin User should be able to Add Subject Categories
#  Edit Subject Categories
#  Delete Subject Categories
#  for setting different education details for schools.
#  Education > Setup tab. We should have an option to activate and deactivate Subject Categories

  Scenario:Create an Category
    And Click on the element in the left Nav
      | Education         |
      | Setupfour        |
      | SubjectCatagories |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | aaaaaaa |
      | codeInput | 000000  |

    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

    And User sending the keys in Dialog content
      | searchInput | aaaaaaa |

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | editButton2 |

    And User sending the keys in Dialog content
      | nameInput | aaaaaaa55 |

    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

    And User sending the keys in Dialog content
      | searchInput | aaaaaaa55 |

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | deleteButton    |
      | deleteDialogBtn |


    And Success message should be displayed

