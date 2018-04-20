#Author <Rohit>
  #Date : <17-04-2018>

Feature: Define Designation

  Background: Steps to open payroll manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click payroll manager logo

  @Component @Scenario1
  Scenario: Verify define designation page status status while page load
    When user open define designation page
    Then verify status of menu items displayed over define designation page at page load
      | designation textbox | true  |
      | show in payroll     | true  |
      | save Button         | true  |
      | view Button         | true  |
      | print Button        | true  |
      | cancel Button       | true  |
      | message box         | false |

  @Component @Scenario2
  Scenario Outline: Acceptability in designation textbox
    When user open define profession page
    And enter designation as <Designation Entered For Acceptability> in designation textbox for acceptability
    Then verify <status> as acceptability and <Displayed Message> as message for <Designation Entered For Acceptability> in designation text box

    Examples:
      | Designation Entered For Acceptability | status                         | Displayed Message        |
      | staff                                 | value supplied is accepted     | NaN                      |
      | 123456                                | value supplied is not accpeted | Please enter valid data. |
      | 123 staff type                        | value supplied is not accpeted | Please enter valid data. |
      | staff type 123                        | value supplied is accepted     | NaN                      |
      | staff 123 type                        | value supplied is accepted     | NaN                      |
      | @#!-                                  | value supplied is not accpeted | Please enter valid data. |
      | @ staff type                          | value supplied is not accpeted | Please enter valid data. |
      | staff type @                          | value supplied is not accpeted | Please enter valid data. |
      | staff @ type                          | value supplied is not accpeted | Please enter valid data. |
      | -staff type                           | value supplied is not accpeted | Please enter valid data. |
      | /staff type                           | value supplied is not accpeted | Please enter valid data. |
      | staff type/                           | value supplied is accepted     | NaN                      |
      | staff type-                           | value supplied is accepted     | NaN                      |
      | staff / type                          | value supplied is accepted     | NaN                      |
      | staff - type                          | value supplied is accepted     | NaN                      |

  @Componenet @Scenario3
  Scenario Outline: Length limit of designation textbox
    When user open define designation page
    And enter designation as <Designation Entered For Length Limit> in designation textbox for length limit
    Then verify <status> as length limit and <Displayed Message> as message for <Designation Entered For Length Limit> in designation textbox

    Examples:
      | Designation Entered For Length Limit | status                       | Displayed Message                                |
      | staffstaffstaffstaffstaff            | Entered value is allowed     | NaN                                              |
      | staffstaffstaffstaffstafff           | Entered value is not allowed | Please enter less than or equal to 25 Characters |

  @Component @Scenario4
  Scenario: Is Mendatory criteria over Define Designation Page
    When user open define designation page
    And click on designation textbox
    And click outside the designation textbox
    Then a pop up message should be displayed for mendatory field correspoding to define designation textbox
#    But record should not be saved in define designation table

  @Component @Scenario5
  Scenario: Action on cancel
    When user open define designation page
    And enter designation as "designation" and rest input fields over define designation
    And hit on cancel over define designation page
    Then verify status of menu items displayed over define designation page on hit of cancel
      | designation textbox | true  |
      | show in payroll     | true  |
      | save Button         | true  |
      | view Button         | true  |
      | print Button        | true  |
      | cancel Button       | true  |
      | message box         | false |