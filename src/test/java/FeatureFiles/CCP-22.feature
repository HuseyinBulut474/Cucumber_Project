Feature: Attestations Menu

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

    @CCP-22
    Scenario: Add, Edit, Delete from Attestations
      And Click on the element in the left Nav
        | humanResources |
        | setupThree     |
        | attestations   |

      And Click on the element in the Dialog
        | addButton |

      And User sending the keys in Dialog content
        | nameInput  | Met14 |

      And Click on the element in the Dialog
        | saveButton |

      And Success message should be displayed

      And Click on the element in the Dialog
        | editButton |

      And User sending the keys in Dialog content
        | nameInput | Meted4 |

      And Click on the element in the Dialog
        | saveButton |

      And Success message should be displayed

      And Click on the element in the Dialog
        | deleteButton    |
        | deleteDialogBtn |

      And Success message should be displayed