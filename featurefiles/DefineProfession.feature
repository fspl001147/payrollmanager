#Author <Rohit>
  #Date : <17-04-2018>

Feature: Define Profession

  Background: Steps to open payroll manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click payroll manager logo

  @Component @Scenario1
  Scenario: Verify define profession page status status while page load
    When user open define profession page
    Then verify status of menu items displayed over define profession page at page load
      | profession textbox | true  |
      | save Button        | true  |
      | view Button        | true  |
      | print Button       | true  |
      | cancel Button      | true  |
      | message box        | false |

  @Component @Scenario2
  Scenario Outline: Acceptability in profession textbox
    When user open define profession page
    And enter profession as <Profession Entered For Acceptability> in profession textbox for acceptability
    Then verify <status> as acceptability and <Displayed Message> as message for <Profession Entered For Acceptability> in profession text box

    Examples:
      | Profession Entered For Acceptability | status                         | Displayed Message            |
      | staff                                | value supplied is accepted     | NaN                          |
      | 123456                               | value supplied is not accpeted | Please enter alphabets only. |
      | 123 staff type                       | value supplied is not accpeted | Please enter alphabets only. |
      | staff type 123                       | value supplied is accepted     | Please enter alphabets only. |
      | staff 123 type                       | value supplied is accepted     | Please enter alphabets only. |
      | @#!-                                 | value supplied is not accpeted | Please enter alphabets only. |
      | @ staff type                         | value supplied is not accpeted | Please enter alphabets only. |
      | staff type @                         | value supplied is not accpeted | Please enter alphabets only. |
      | staff @ type                         | value supplied is not accpeted | Please enter alphabets only. |
      | -staff type                          | value supplied is not accpeted | Please enter alphabets only. |
      | /staff type                          | value supplied is not accpeted | Please enter alphabets only. |
      | staff type/                          | value supplied is accepted     | Please enter alphabets only. |
      | staff type-                          | value supplied is accepted     | Please enter alphabets only. |
      | staff / type                         | value supplied is accepted     | Please enter alphabets only. |
      | staff - type                         | value supplied is accepted     | Please enter alphabets only. |

  @Componenet @Scenario3
  Scenario Outline: Length limit of profession textbox
    When user open define profession page
    And enter profession as <Profession Entered For Length Limit> in profession textbox for length limit
    Then verify <status> as length limit and <Displayed Message> as message for <Profession Entered For Length Limit> in profession textbox

    Examples:
      | Profession Entered For Length Limit                 | status                       | Displayed Message                                |
      | stafftypeestafftypeestafftypeestafftypeestafftypee  | Entered value is allowed     | NaN                                              |
      | stafftypeestafftypeestafftypeestafftypeestafftypeee | Entered value is not allowed | Please enter less than or equal to 50 Characters |

  @Component @Scenario4
  Scenario: Action on cancel
    When user open define profession page
    And enter profession as "profession" and rest input fields over define profession and
    And hit on cancel over define profession page
    Then verify status of menu items displayed over define profession page on hit of cancel
      | staff type textbox     | true  |
      | show on ecare checkbox | true  |
      | is hourly paid         | true  |
      | save Button            | true  |
      | view Button            | true  |
      | print Button           | true  |
      | cancel Button          | true  |
      | message box            | false |