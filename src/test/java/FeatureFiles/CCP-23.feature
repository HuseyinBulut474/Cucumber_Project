Feature: Document Types

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @CCP-23
  Scenario: Create Document Types and edit and Delete
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | documentTypes |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput  | ikametgah |

    And User choose the stage option
      | stage |
      | certificate |

    And Robot press esc

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | nameInput | Suleyman |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And Click on the element in the Dialog
      | deleteButton |
      | deleteDialogBtn    |

    And Success message should be displayed