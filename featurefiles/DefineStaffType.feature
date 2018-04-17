#Author <Rohit>
  #Date : <24-03-2018>

Feature: Define Staff Type

  Background: Steps to open payroll manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click payroll manager logo

  @Component @Scenario1
  Scenario: Verify define staff type page status status while page load
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

  @Componenet @Scenario3
  Scenario Outline: Length limit of staff type textbox
    When user open define staff type page
    And enter staff type as <Staff Type Entered For Length Limit> in staff type textbox for length limit
    Then verify <status> as length limit and <Displayed Message> as message for <Staff Type Entered For Length Limit> in staff type textbox

    Examples:
      | Staff Type Entered For Length Limit                 | status                       | Displayed Message                                |
      | stafftypeestafftypeestafftypeestafftypeestafftypee  | Entered value is allowed     | NaN                                              |
      | stafftypeestafftypeestafftypeestafftypeestafftypeee | Entered value is not allowed | Please enter less than or equal to 50 Characters |

#  @Component @Scenario
#  Scenario: Is Mendatory criteria over Define Staff Type Page
#    When user open define staff type page
#    And click on staff type textbox
#    And click outside the textbox
#    Then a pop up message should be displayed for mendatory field correspoding to define staff type textbox
#    But record should not be saved in define staff type table

  @Component @Scenario4
  Scenario: Action on cancel
    When user open define staff type page
    And enter staff type as "staff type" and rest input fields over define staff type and
    And hit on cancel over define staff type page
    Then verify status of menu items displayed over define staff type page on hit of cancel
      | staff type textbox     | true  |
      | show on ecare checkbox | true  |
      | is hourly paid         | true  |
      | save Button            | true  |
      | view Button            | true  |
      | print Button           | true  |
      | cancel Button          | true  |
      | message box            | false |
#
#  Scenario: Action on view
#    When user open define staff type page
#    And click on view
#    Then verify if a grid is opening then saved data should be displayed
#    But if record is not saved in define staff table a pop up message will be displayed