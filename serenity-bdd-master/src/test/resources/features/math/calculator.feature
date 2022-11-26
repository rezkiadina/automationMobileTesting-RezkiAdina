@android @calculator
Feature: calculator function

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login

  @sum
  Scenario Outline: user do sum on the calculator
    Given user is on calculator page
    When user input first number <firstNumber>
    When user input second number <secondNumber>
    Then user choose icon plus
    Then user click the equals button
    And total should be <total>
    Examples:
      | firstNumber | secondNumber | total        |
      | 2           | 6            | "Hasil : 8"  |
      | 4           | 3            | "Hasil : 7"  |
      | 15          | 10           | "Hasil : 25" |

  @subtraction
  Scenario Outline: user do subtraction on the calculator
    Given user is on calculator page
    When user input first number <firstNumber>
    When user input second number <secondNumber>
    And user click button drop down
    And user choose icon minus
    Then user click the equals button
    And total should be <total>
    Examples:
      | firstNumber | secondNumber | total        |
      | 5           | 2            | "Hasil : 3"  |
      | 8           | 3            | "Hasil : 5"  |
      | 20          | 8            | "Hasil : 12" |

    @divide
  Scenario Outline: user do divide on the calculator
    Given user is on calculator page
    When user input first number <firstNumber>
    When user input second number <secondNumber>
    And user click button drop down
    And user choose icon divide
    Then user click the equals button
    And total should be <total>
    Examples:
      | firstNumber | secondNumber | total       |
      | 6           | 2            | "Hasil : 3" |
      | 10          | 5            | "Hasil : 2" |
      | 20          | 4            | "Hasil : 5" |

  @multiple
  Scenario Outline: user do multiple on the calculator
    Given user is on calculator page
    When user input first number <firstNumber>
    When user input second number <secondNumber>
    And user click button drop down
    And user choose icon multiple
    Then user click the equals button
    And total should be <total>
    Examples:
      | firstNumber | secondNumber | total         |
      | 8           | 9            | "Hasil : 72"  |
      | 5           | 5            | "Hasil : 25"  |
      | 12          | 13           | "Hasil : 156" |