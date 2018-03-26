#Author <Rohit>
  #Date : <24-03-2018>

Feature: Define Profession

  Background: Steps to open payroll manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click payroll manager logo


  @component @Scenario1
  Scenario: Acceptability in staff type textbox
    When user open define staff type
    And enter values in staff type textbox for acceptability and verify on each row
      | NumericValue          | 123456              |
      | AlphaNumericValue     | stafftype15         |
      | SpecialCharacterValue | stafftype-stafftype |
      | CharacterValue        | stafftype           |


  @component @Scenario2
  Scenario: Allowed length limit in staff type textbox
    When user open define staff type
    And enter values in staff type textbox for length limit
      | With49Characters | stafftypeestafftypeestafftypeestafftypeestafftype   |
      | With50Characters | stafftypeestafftypeestafftypeestafftypeestafftypee  |
      | With51Characters | stafftypeestafftypeestafftypeestafftypeestafftypeee |
    Then verify the length limit of staff type textbox




