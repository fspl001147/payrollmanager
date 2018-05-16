Feature: bugs reported over bug tracker

  #DefineAcademicYear.feature
  @21958
  Scenario: Spelling of elements over define academic year page
    When user open define academic year page
    Then verify spelling of elements displayed over define academic year page
      | page title                  | Define Academic Year |
      | Academic Year label         | Academic Year        |
      | Start Year label            | Start Year           |
      | End Year label              | End Year             |
      | Start year year dd index 0  | Year                 |
      | End year year dd index 0    | Year                 |
      | Start year month dd index 0 | Month                |
      | End year month dd index 0   | Month                |
      | Start year day dd index 0   | Day                  |
      | End year day dd index 0     | Day                  |
      | Is Active checkbox          | Is Active            |

  Scenario: Spelling of elements over define academic year page on hit of view
    When user open define academic year page
    And hit on view over define academic year page
    Then verify spelling of elements displayed over define academic year page in view mode
      | Academic Year List          |
      | Show                        |
      | entries                     |
      | Sr No.                      |
      | Select                      |
      | Year Name                   |
      | Is Active                   |
      | Start Date                  |
      | End Date                    |
      | Modified Date               |
      | Search:                     |
      | Showing 1 to 8 of 8 entries |
      | Previous                    |
      | Next                        |

  @22919
  Scenario: Issue with display of loader over forms

  @24420
  Scenario: Verifying record after modifying active year over define academic year page without altering any detail
    When user open define academic year page
    And hit on view over define academic year page
    And select year which is active from define academic year view page
    And record the details of selected data over define academic year page
    And click on Modify over define academic year page
    Then verify the verifaction message as '' over define academic year page
    And hit on view over define academic year page
    And select year which is selected earlier from define academic year view page
    And verify entire details should not be changed after hit on modify over define academic year page


# DefineFinancialYear.feature
  @22920
  Scenario: Issue with display of loader over forms

  Scenario: Verifying record after modifying active year over define financial year page without altering any detail
    When user open define financial year page
    And hit on view over define financial year page
    And select year which is active from define financial year view page
    And record the details of selected data over define financial year page
    And click on Modify over define financial year page
    Then verify the verifaction message as '' over define financial year page
    And hit on view over define financial year page
    And select year which is selected earlier from define financial year view page
    And verify entire details should not be changed after hit on modify over define financial year page.

    #DefineStaffType.feature
  @16939
    Scenario: Data on view

  @20608
    Scenario:
  @21163
  @21164
  @21165
  @21166
  @21167
  @22241

    #DefineStaff.feature
  @20154
  @20217
  @20606
  @20610
  @20611
  @20616
  @20548
  @20549
  @20550
  @20551
  @20552
  @20553
  @20556
  @20557
  @20650
  @20671
  @20681
  @20777
  @21162
  @21178
  @21324
  @21328
  @21357
  @21358
  @21359
  @21360
  @21361
  @21363
  @21431
  @21465
  @22280
  @22638
  @22859
  @22944
  @22945
  @23493
  @26089

    #RejoinStaff.feature
  @20675
  @20678
  @20679
  @20721
  @20852
  @20853
  @21362
  @21364

  #DefineReminder.feature
  @21200
  @21201
  @21323
  @21430
  @22951

  #ModifyStaffInBulk.feature
  @20366
  @20369
  @20371
  @20555
  @20670
  @21366
  @21432
  @22574
  @22922

  #AssignTransportToStaff.feature
  @22181
  @22761
  @22953
  @24045

  #DefineGlobalSettings.feature
  @21469

  #ChangeAcademic.feature
  @17143

  #DynamicReportSettings.feature
  @23766