Feature: Simple Addition and subtraction
  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1     | 6     | 5      |


#  Scenario: subtract two numbers
#    Given Two values {int} and {int}
#    When I subtract the two values
#    Then I expect the result {int}
#
#    Scenario: Multiply two numbers
#      Given I have two numbers {int} and {int}
#      When I multiply the two values
#      Then I get {int}