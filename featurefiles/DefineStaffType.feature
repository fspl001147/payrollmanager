#Author <Rohit>
  #Date : <24-03-2018>

Feature: Define Profession

  Background: Steps to open payroll manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click payroll manager logo

    # Acceptability in staff type textbox
  Scenario Outline: Acceptability in staff type textbox
    When user open define staff type page
    And enter staff type as <StaffType> in staff type textbox
    Then verify acceptability as per <StaffType> in staff type textbox

    Examples:
      | StaffType      |
      | staff          |
      | 123 staff type |
      | staff type 123 |
