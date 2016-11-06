Feature: CostOfCalling
  As a User
  I want to use a calculator of cost
  So that I can know how much money I will pay after a call.

  Scenario: User has not called yet 
    Given I have not started any calls, 0 minute
    When I use this program to calculate my cost
    Then I pay 0 VND for this call

  Scenario Outline: User call in ... minute(s)
    Given I have a call in <min> minutes
    When I use this program to calculate my cost
    Then my cost of call should be <cost>

    Examples:
    | min   |  cost    |
    |  1    |  25600   |
    |  49   |  54400   |
    |  50   |  55000   |
    |  51   |  55400   |
    |  150  |  95000   |
    |  199  |  114600  |
    |  200  |  115000  |
    |  201  |  115200  |