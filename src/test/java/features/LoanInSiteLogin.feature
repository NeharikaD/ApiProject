Feature: Login Feature

  Background: User Validate the LoanInSight API Endpoints
    Given User sets base URL for LoanInSight API request
    And User sets basic authorization for the API request

  @testLoan
  Scenario Outline: User validates the LoanInSight Login API response
    Given User enters the key-value pairs for username "<username>" & password "<password>" in the selected option "x-www-form-urlencoded"
    And User executes the post request
    Then User validates the response status is "<code>"
    Examples:
      | username                     | password | code |
      | zbhatuk-demo3@tenupsoft.com  | Demo1234 | 200  |
      | zbhatuk-demo3@tenupsoft.com  |          | 400  |
      |                              | Demo1234 | 400  |
      |                              |          | 400  |
      | zbhatuk-demo3tenupsoft.com   | Demo1234 | 400  |
      | zbhatuk@demo3@tenupsoft.com  | Demo1234 | 400  |
      | zbhatuk-demo3$tenupsoft.com  | Demo1234 | 400  |
      | zbhatuk-demo3 tenupsoft.com  | Demo1234 | 400  |
      | zbhatuk-demo3@tenupsoft.com; | Demo1234 | 400  |


