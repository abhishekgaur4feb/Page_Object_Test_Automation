Feature: LinkedIn Website Login Functionality Test Case

  Scenario Outline: LinkedIn Login Use Case
    Given User Open Browser for LinkedIn Login Validation
    When User pass Username as "<username>" and Password as "<password>"
    Then Validation Step is Performed

    Examples: 
      | username                  | password  |
      | abhishekgaur054@gmail.com | Sparkle1@ |