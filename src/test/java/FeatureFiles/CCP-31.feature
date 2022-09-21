Feature: Attestation

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @CCP-31
  Scenario: Create Attestations
    And Click on the element in the left Nav
      | humanResources |
      | setupThree     |
      | attestations   |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | samedis |

    And Click on the element in the Dialog
      | saveButton2 |

    And Success message should be displayed

  @CCP-31
  Scenario: Edit Attestations
    And Click on the element in the left Nav
      | humanResources |
      | setupThree     |
      | attestations   |

    And User sending the keys in Dialog content
      | searchInput | samedis |

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | editButton2 |

    And User sending the keys in Dialog content
      | nameInput | samedis2 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

  @CCP-31
  Scenario: Delete Attestations
    And Click on the element in the left Nav
      | humanResources |
      | setupThree     |
      | attestations   |

    And User sending the keys in Dialog content
      | searchInput | samedis2 |

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | deleteButton2 |

    And Click on the element in the Dialog
      | deleteButton3 |

    And Success message should be displayed












