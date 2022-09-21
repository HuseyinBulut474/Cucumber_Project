Feature: Grade Level

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @CCP-30
  Scenario: Create Grade create edit and Delete
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | gradeLevel |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput  | Cloud474 |
      | shortName  | Cloudy   |
      | orderInput | 5        |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And Click on the element in the Dialog
      | editButtonOption |

    And User sending the keys in Dialog content
      | nameInput | CloudEnd |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And Click on the element in the Dialog
      | deleteButtonOption |
      | deleteDialogBtn    |

    And Success message should displayed