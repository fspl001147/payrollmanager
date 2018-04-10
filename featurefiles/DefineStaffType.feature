#Author <Rohit>
  #Date : <24-03-2018>

Feature: Define Staff Type

  Background: Steps to open payroll manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click payroll manager logo

    # Acceptability in staff type textbox
  @Component @Scenario1
  Scenario Outline: Acceptability in staff type textbox
    When user open define staff type page
    And enter staff type as <Staff Type For Acceptability> in staff type textbox for acceptability
    Then verify acceptability as per <Staff Type For Acceptability> in staff type textbox for acceptability

    Examples:
      | Staff Type For Acceptability |
      | staff                        |
      | 123456                       |
      | 123 staff type               |
      | staff type 123               |
      | staff 123 type               |
      | @#!-                         |
      | @ staff type                 |
      | staff type @                 |
      | staff @ type                 |
      | -staff type                  |
      | /staff type                  |
      | staff type/                  |
      | staff type-                  |
      | staff / type                 |
      | staff - type                 |

    #Length Limit of Staff Type Textbox
  @Componenet @Scenario2
  Scenario Outline: Length limit of staff type textbox
    When user open define staff type page
    And enter staff type as <Staff Type For Length Limit> in staff type textbox for length limit
    Then verify acceptability as per <Staff Type For Length Limit> in staff type textbox for length limit

    Examples:
      | Staff Type For Length Limit                         |
      | stafftypeestafftypeestafftypeestafftypeestafftypee  |
      | stafftypeestafftypeestafftypeestafftypeestafftypeee |