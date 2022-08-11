@regression
Feature: Add and Edit seizure

  Scenario Outline: As a user I would like to add seizure in my account
    Given I am on homepage
    When I press right arrow key to navigate next page of Tutorial page
    And I click 'Let's Go'
    Then I navigate to account login options page
    And I select 'I already have an account'
    Then I navigate to user login Page
    And I Enter valid email address "<text>"
    And I Enter valid password "<text1>"
    And I click on 'Login' button
    Then I navigate to the account page
    And I click on 'Add Seizure'
    And I select on 'Focal Aware Seizure' from type and validate it
    And I select 'No' from 'Felt it coming?'
    And I click on 'Save' button
    And I click on 'Close' button from confirmation message
    Then I verify if 'Focal aware seizure' is added
    Examples:
      | text                | text1       |
      | kps2582@hotmail.com | Narayan@002 |

  Scenario: As a user I would like to edit seizure in my account
    Given I am on homepage
    When I press right arrow key to navigate next page of Tutorial page
    And I click 'Let's Go'
    Then I navigate to account login options page
    And I select 'I already have an account'
    Then I navigate to user login Page
    And I Enter valid email address "kps2582@hotmail.com"
    And I Enter valid password "Narayan@002"
    And I click on 'Login' button
    Then I navigate to the account page
    And I click on 'Edit Seizure'
    And I click on 'Focal Aware Seizure'
    And I select on 'Generalized tonic-clonic seizure' from type and validate it
    And I click on 'Save' button
    And I click on 'Home' button from lower menu
    Then I verify if 'Generalized tonic-clonic seizure' is added