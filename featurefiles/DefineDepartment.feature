#Author <Rohit>
  #Date : <17-04-2018>

Feature: Define Department

  Background: Steps to open payroll manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click payroll manager logo

  @Component @Scenario1
  Scenario: Verify define department page status status while page load
    When user open define department page
    Then verify status of menu items displayed over define department page at page load
      | department textbox | true  |
      | save Button        | true  |
      | view Button        | true  |
      | print Button       | true  |
      | cancel Button      | true  |
      | message box        | false |

  @Component @Scenario2
  Scenario Outline: Acceptability in department textbox
    When user open define department page
    And enter department as <Department Entered For Acceptability> in department textbox for acceptability
    Then verify <status> as acceptability and <Displayed Message> as message for <Department Entered For Acceptability> in department text box

    Examples:
      | Department Entered For Acceptability | status                         | Displayed Message        |
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
  Scenario Outline: Length limit of department textbox
    When user open define department page
    And enter department as <Department Entered For Length Limit> in department textbox for length limit
    Then verify <status> as length limit and <Displayed Message> as message for <Department Entered For Length Limit> in department textbox

    Examples:
      | Department Entered For Length Limit | status                       | Displayed Message                                |
      | staffstaffstaffstaffstaff           | Entered value is allowed     | NaN                                              |
      | staffstaffstaffstaffstafff          | Entered value is not allowed | Please enter less than or equal to 25 Characters |

  @Component @Scenario4
  Scenario: Is Mendatory criteria over Define Department Page
    When user open define department page
    And click on department textbox
    And click outside the department textbox
    Then a pop up message should be displayed for mendatory field correspoding to define department textbox
#    But record should not be saved in define department table

  @Component @Scenario5
  Scenario: Action on cancel
    When user open define department page
    And enter department as "department" and rest input fields over define department
    And hit on cancel over define department page
    Then verify status of menu items displayed over define department page on hit of cancel
      | department textbox | true  |
      | save Button        | true  |
      | view Button        | true  |
      | print Button       | true  |
      | cancel Button      | true  |
      | message box        | false |