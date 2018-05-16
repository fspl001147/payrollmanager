#Author <Rohit>
  #Date : <21-04-2018>

Feature: Define Staff

  Background: Steps to open payroll manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click payroll manager logo

  @Component @Scenario
  Scenario: Verify define staff page status status while page load
    When user open define staff page
    Then verify status of menu items displayed over define staff page at page load
      | staff registration tab                                                      |       |
      | staff salary details tab                                                    |       |
      | staff salary head tab                                                       |       |
      | search bar                                                                  | true  |
      | search button                                                               | true  |
      | pref no textbox                                                             | true  |
      | pref no  message box                                                        | false |
      | get button                                                                  | true  |
      | first name dd                                                               | true  |
      | first name textbox                                                          | true  |
      | first name message box                                                      | false |
      | middle name textbox                                                         | true  |
      | middle name message box                                                     | false |
      | last name textbox                                                           | true  |
      | last name messagebox                                                        | false |
      | gender radio button                                                         | true  |
      | email textbox                                                               | true  |
      | email messagebox                                                            | false |
      | alternate email textbox                                                     | true  |
      | alternate email messagebox                                                  | false |
      | phone textbox                                                               | true  |
      | phone messagebox                                                            | false |
      | mobile textbox                                                              | true  |
      | mobile messagebox                                                           | false |
      | alternate mobile textbox                                                    | true  |
      | alternate mobile messagebox                                                 | false |
      | emergency mobile textbox                                                    | true  |
      | emergency mobile messagebox                                                 | false |
      | wings dropdown                                                              | true  |
      | active checkbox                                                             | true  |
      | profile picture button                                                      | true  |
      | marital status radio button                                                 | true  |
      | date of birth textbox                                                       | true  |
      | date of birth messagebox                                                    | false |
      | date of anniversary textbox                                                 | true  |
      | date of anniversary messagebox                                              | false |
      | date of joining calender                                                    | true  |
      | date of joining messagebox                                                  | false |
      | date of retire calender                                                     | true  |
      | date of retire messagebox                                                   | false |
      | extend checkbox                                                             | true  |
      | address textbox                                                             | true  |
      | address messagebox                                                          | false |
      | current address textbox                                                     | true  |
      | current address messagebox                                                  | false |
      | father/spouse name textbox                                                  | true  |
      | father/spouse name messagebox                                               | false |
      | father/spouse mobile textbox                                                | true  |
      | father/spouse mobile messagebox                                             | false |
      | father/spouse relation dd                                                   | true  |
      | blood group dd                                                              | true  |
      | staff type dd                                                               | true  |
      | designation dd                                                              | true  |
      | department dd                                                               | true  |
      | religion dd                                                                 | true  |
      | aadhar card no textbox                                                      | true  |
      | aadhar card no messagebox                                                   | false |
      | save button                                                                 | true  |
      | view button                                                                 | true  |
      | print button                                                                | true  |
      | cancel button                                                               | true  |
      | emp no textbox                                                              |       |
      | emp no messagebox                                                           |       |
      | pan no textbox                                                              |       |
      | pan no messagebox                                                           |       |
      | bank name dd                                                                |       |
      | bank acc no dd                                                              |       |
      | generate salary checkbox                                                    |       |
      | salary to bank checkbox                                                     |       |
      | machine no textbox                                                          |       |
      | machine no messagebox                                                       |       |
      | gratuity code textbox                                                       |       |
      | gratuity code messagebox                                                    |       |
      | pf no textbox                                                               |       |
      | pf no messagebox                                                            |       |
      | esi no textbox                                                              |       |
      | esi no messagebox                                                           |       |
      | uan no textbox                                                              |       |
      | uan no messagebox                                                           |       |
      | emp acc no textbox                                                          |       |
      | emp acc no messagebox                                                       |       |
      | status dd                                                                   |       |
      | salary group dd                                                             |       |
      | basic textbox                                                               |       |
      | basic messagebox                                                            |       |
      | grade pay textbox                                                           |       |
      | grade pay messagebox                                                        |       |
      | confirmation date textbox                                                   |       |
      | confirmation date checkbox                                                  |       |
      | confirmation date messagebox                                                |       |
      | permanant date textbox                                                      |       |
      | permanant datecheckbox                                                      |       |
      | permanant date messagebox                                                   |       |
      | leaving date textbox                                                        |       |
      | leaving date checkbox                                                       |       |
      | leaving date messagebox                                                     |       |
      | joining date epf textbox                                                    |       |
      | joining date epf checkbox                                                   |       |
      | joining date epf messagebox                                                 |       |
      | joining date eps textbox                                                    |       |
      | joining date eps checkbox                                                   |       |
      | joining date eps messagebox                                                 |       |
      | leaving date epf textbox                                                    |       |
      | leaving date epf checkbox                                                   |       |
      | leaving date epf messagebox                                                 |       |
      | leaving date eps textbox                                                    |       |
      | leaving date eps checkbox                                                   |       |
      | leaving date eps messagebox                                                 |       |
      | probation date textbox                                                      |       |
      | probation date checkbox                                                     |       |
      | probation date messagebox                                                   |       |
      | increment date textbox                                                      |       |
      | increment date checkbox                                                     |       |
      | increment date messagebox                                                   |       |
      | reason of leaving dd                                                        |       |
      | short name dd                                                               |       |
      | basic salary part label                                                     |       |
      | pay scale label                                                             |       |
      | name label                                                                  |       |
      | husband/father label                                                        |       |
      | select checkbox in staff salary head                                        |       |
      | head name in staff salary head                                              |       |
      | value textbox corrresponding to amount value type in staff salary head      |       |
      | value textbox corrresponding to custom value type in staff salary head      |       |
      | value textbox corrresponding to occassional value type in staff salary head |       |
      | value textbox corrresponding to percentage value type in staff salary head  |       |