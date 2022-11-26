@login @android
Feature: List

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu

  @test @positive
  Scenario: Verify user successfully login when input valid email and password
    And user do scroll

  @longpress
  Scenario: user long pres on list page
    When user on list page
    Then user do long pres

  @MultipleTaps
  Scenario: user taps multiples time
    When user on list page
    Then user do multiple taps list