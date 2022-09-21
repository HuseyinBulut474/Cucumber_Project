Feature: Human Resources

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @CCP-21
  Scenario: Create Human Resources, edit and Delete
    And Click on the element in the left Nav
      | humanResources |
      | setupThree     |
      | position       |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | Cloud474 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | nameInput | CloudEnd |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | CloudEnd |

    And Success message should be displayed