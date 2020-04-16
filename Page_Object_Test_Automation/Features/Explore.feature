Feature: Explore Navigation Menu

  Scenario Outline: Explore Navigation Menu
    Given Open browser for Explore Navigation Menu
    When NewUser clicks on Explore and pass "<send_text>" and "<menuoption>"
    Then Message displayed Explore Navigation Menu Successful clicked

    Examples: 
      | send_text               | menuoption |
      | automation laboratories | Selenium   |
