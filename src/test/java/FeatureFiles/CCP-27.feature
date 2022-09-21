Feature: Locations

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

    @CCP-27
    Scenario: Add, Edit and Delete School Locations
      And Click on the element in the left Nav
        | setupOne    |
        | schoolSetup |
        | locations   |

      And Click on the element in the Dialog
        | addButton |

      And User sending the keys in Dialog content
        | nameInput  | Ataturk |
        | shortName  | ATA     |
        | capacity   | 1938    |

      And Click on the element in the Dialog
        | locType  |

      And Click on the element in the Dialog
        | activeButton |
        | saveButton   |

      And Success message should be displayed

      And Click on the element in the Dialog
        | editButton |

      And User sending the keys in Dialog content
        | nameInput  | M.Kemal |
        | shortName  | MKA     |
        | capacity   | 1881    |

      And Click on the element in the Dialog
        | locType  |

      And Click on the element in the Dialog
        | activeButton |
        | saveButton   |

      And Success message should be displayed

      And Click on the element in the Dialog
        | deleteButton    |
        | deleteDialogBtn |

      And Success message should be displayed

