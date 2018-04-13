#Author <Rohit>
  #Date : <24-03-2018>

Feature: Define Staff Type

  Background: Steps to open payroll manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click payroll manager logo

  @Component @Scenario1
  Scenario: verify page status status while page load
    When user open define staff type page
    Then verify status of menu items displayed over define staff type page at page load
      | staff type textbox     | true  |
      | show on ecare checkbox | true  |
      | is hourly paid         | true  |
      | save Button            | true  |
      | view Button            | true  |
      | print Button           | true  |
      | cancel Button          | true  |
      | message box            | false |

    # Acceptability in staff type textbox
  @Component @Scenario2
  Scenario Outline: Acceptability in staff type textbox
    When user open define staff type page
    And enter staff type as <Staff Type Entered For Acceptability> in staff type textbox for acceptability
    Then verify <status> as acceptability and <Displayed Message> as message for <Staff Type Entered For Acceptability> in staff type text box

    Examples:
      | Staff Type Entered For Acceptability | status                         | Displayed Message        |
      | staff                                | value supplied is accepted     | NaN                      |
      | 123456                               | value supplied is not accpeted | Please enter valid data. |
      | 123 staff type                       | value supplied is not accpeted | Please enter valid data. |
      | staff type 123                       | value supplied is accepted     | NaN                      |
      | staff 123 type                       | value supplied is accepted     | NaN                      |
      | @#!-                                 | value supplied is not accpeted | Please enter valid data. |
      | @ staff type                         | value supplied is not accpeted | Please enter valid data. |
      | staff type @                         | value supplied is not accpeted | Please enter valid data. |
      | staff @ type                         | value supplied is not accpeted | Please enter valid data. |
      | -staff type                          | value supplied is not accpeted | Please enter valid data. |
      | /staff type                          | value supplied is not accpeted | Please enter valid data. |
      | staff type/                          | value supplied is accepted     | NaN                      |
      | staff type-                          | value supplied is accepted     | NaN                      |
      | staff / type                         | value supplied is accepted     | NaN                      |
      | staff - type                         | value supplied is accepted     | NaN                      |

    #Length Limit of Staff Type Textbox
  @Componenet @Scenario3
  Scenario Outline: Length limit of staff type textbox
    When user open define staff type page
    And enter staff type as <Staff Type Entered For Length Limit> in staff type textbox for length limit
    Then verify <status> as length limit and <Displayed Message> as message for <Staff Type Entered For Length Limit> in staff type textbox

    Examples:
      | Staff Type Entered For Length Limit                 | status                       | Displayed Message                                |
      | stafftypeestafftypeestafftypeestafftypeestafftypee  | Entered value is allowed     | NaN                                              |
      | stafftypeestafftypeestafftypeestafftypeestafftypeee | Entered value is not allowed | Please enter less than or equal to 50 Characters |

  @Component @Scenario4
  Scenario: Action on cancel
    When user open define staff type page
    And enter staff type as "staff type" and rest input fields over define staff type and
    And hit on cancel
    Then verify status of menu items displayed over define staff type page on hit of cancel
      | staff type textbox     | true  |
      | show on ecare checkbox | true  |
      | is hourly paid         | true  |
      | save Button            | true  |
      | view Button            | true  |
      | print Button           | true  |
      | cancel Button          | true  |
      | message box            | false |

#    Scenario: Action on view
#      When user open define staff type page
#      And click on view
#      Then verify if no a pop up message is shown then there is no data saved and if