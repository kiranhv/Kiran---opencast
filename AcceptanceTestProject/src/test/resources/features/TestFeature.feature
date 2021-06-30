Feature: Visit a page and click on a link

@test
  Scenario: Visit a page and check the page title
    Given I go to url https://www.bbc.co.uk/
    When I click on signin menu
    Then I enter the username "kerry-anne.kane@opencastsoftware.com" and password "mypassword1" and click on signin button

