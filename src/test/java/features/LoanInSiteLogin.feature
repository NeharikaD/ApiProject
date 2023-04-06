Feature: Login Feature

  Background: User Validate the LoanInSite API Endpoints
    Given User sets base URL for LoanInSite API request
    And User sets basic authorization for the API request

  @testLoan
  Scenario Outline: user is able to validate the LoanInSite Login API response
    Given user enters the key-value pairs for username "<username>" & password "<password>" in the selected option "x-www-form-urlencoded"
    And user executes the post request
    Then User validates the response status is "<code>"
    Examples:
      | username                    | password | code |
      | zbhatuk-demo3@tenupsoft.com | Demo1234 | 200  |
      | zbhatuk-demo3@tenupsoft.com |          | 400  |
      |                             | Demo1234 | 400  |
      |                             |          | 400  |

  @testLoan
  Scenario Outline: Login - fail possible combinations for LoanInSite Login API
    Given user enters the key-value pairs for username as invalid username "<username>" & valid password "Demo1234" in the selected option "x-www-form-urlencoded"
    And user executes the post request
    Then User validates the response status is "<code>"

    Examples:
      | username                     | code |
      | zbhatuk-demo3tenupsoft.com   | 400  |
      | zbhatuk@demo3@tenupsoft.com  | 400  |
      | zbhatuk-demo3$tenupsoft.com  | 400  |
      | zbhatuk-demo3 tenupsoft.com  | 400  |
      | zbhatuk-demo3@tenupsoft.com; | 400  |