#Author <Rohit>
  #Date : <24-03-2018>

Feature: Define Staff Type

  Background: Steps to open payroll manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click payroll manager logo

    #At page status default values should also be checked
  @Component @Scenario1
  Scenario: Verify define staff type page status while page load
    When user open define staff type page
    Then verify status of menu items displayed over define staff type page at page load
      | staff type textbox     | true  |
      | show on ecare checkbox | true  |
      | is hourly paid         | true  |
      | save Button            | true  |
      | view Button            | true  |
      | print Button           | true  |
      | cancel Button          | false |
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
      | staff - type                         | value supplied is not accepted | NaN                      |

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
  Scenario: Is Mendatory criteria over Define Staff Type Page
    When user open define staff type page
    And click on staff type textbox
    And click outside the staff type textbox
    Then a pop up message should be displayed for mendatory field correspoding to define staff type textbox
    But record should not be saved in define staff type table

  @Componenet @Scenario
  Scenario: Space acceptability at start in Defin Staff Type page
    When user open define staff type page
    And enter staff type as "  staff type A" and rest input fields over define staff type page for space acceptability at start
    And hit on save over define staff type page
    Then verify the space acceptability at start in straff type textbox

  @Componenet @Scenario
  Scenario: Space acceptability at end in Defin Staff Type page
    When user open define staff type page
    And enter staff type as "staff type B   " and rest input fields over define staff type page for space acceptability at end
    And hit on save over define staff type page
    Then verify the space acceptability at end in straff type textbox

  @Component @Scenario5
  Scenario: Action on cancel
    When user open define staff type page
    And enter staff type as "staff type C" and rest input fields over define staff type
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

  @Component @Scenario6
  Scenario: Action on view
    When user open define staff type page
    And click on view
    Then verify if a grid is opening then saved data should be displayed
    But if record is not saved in define staff table a pop up message will be displayed

  @Componenet @Scenario
  Scenario: Action on Save
    When user open define staff type page
    And enters staff type as "staff type D" in staff type textbox
    And check show on ecare checkbox
    And check is hourly paid checkbox
    And hit on save over define staff type page
    Then verify the action of save on define staff type page from database
    And verify the action of save on define staff type page from UI

  @Component @Scenario
  Scenario: Action on Modify
    When user open define staff type page
    And hit on view over define staff type page
    And hit on select over define staff type grid
    And store the status of the entry selected over define staff type page
    And modify the staff type entered over define staff type page
    And modify the is hourly paid checkbox status over define staff type page
    And modify the show on ecare checkbox over define staff type page
    And hit on modify over define staff type page
    Then verify the status of the record saved over define staff type page
    And verify status of menu items displayed over define staff type page on hit of modify
      | staff type textbox     | true  |
      | show on ecare checkbox | true  |
      | is hourly paid         | true  |
      | save Button            | true  |
      | view Button            | true  |
      | print Button           | true  |
      | cancel Button          | true  |
      | message box            | false |

  @Component @Scenario
  Scenario: Action on Delete
    When user open define staff type page
    And hit on view over define staff type page
    And hit on select over define staff type grid
    And store the selected entry over define staff type page
    And hit on delete over define staff type page
    Then verify the selected entry to be removed from define staff type table
    And verify status of menu items displayed over define staff type page on hit of delete
      | staff type textbox     | true  |
      | show on ecare checkbox | true  |
      | is hourly paid         | true  |
      | save Button            | true  |
      | view Button            | true  |
      | print Button           | true  |
      | cancel Button          | true  |
      | message box            | false |

  @Component @Scenario
  Scenario: Action on checkboxes 1
    When user open define staff type page
    And enter staff type as "staff type E" in staff type textbox
    And check the is hourly paid checkbox over define staff type page
    And verify show on ecare checkbox is uncheked if not then uncheck show on ecare checkbox
    And hit on save over define staff type page
    Then verify the action of save on define staff type page from database

  @Component @Scenario
  Scenario: Action on checkboxes 2
    When user open define staff type page
    And enter staff type as "staff type F" in staff type textbox
    And check the show on ecare checkbox over define staff type page
    And verify is hourly paid checkbox is uncheked if not then uncheck is hourly paid checkbox
    And hit on save over define staff type page
    Then verify the action of save on define staff type page from database

  @Component @Scenario
  Scenario: Action on checkboxes 3
    When user open define staff type page
    And enter staff type as "staff type F" in staff type textbox
    And check the show on ecare checkbox over define staff type page
    And check is hourly paid checkbox over define staff type page
    And hit on save over define staff type page
    Then verify the action of save on define staff type page from database

  @Component @Scenario
  Scenario: Checking duplicacy on define staff type page
    When user open define staff type page
    And hit on view over define staff type page
    And hit on select over define staff type grid
    And store the record fetched from define staff type page
    And hit on cancel over define staff type page
    Then enter staff type as the stored value and rest input fields over define staff type
    And verify pop-up message of record duplicacy at the bottom of the define staff type page