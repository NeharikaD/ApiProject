Feature: Register Feature

  Background: User Validate the LoanInSight API Endpoints
    Given User sets base URL for LoanInSight API request
    And User sets basic authorization for the API request

  #tc-1, tc-5, tc-8, tc-9, tc-10, tc-11, tc-12
  @testL
  Scenario Outline: User is able to validate the LoanInSight Register API response
    Given Enter the query parameters "airVal", "lender", "loanAmt", "state", "numOfYears", "locationPreference", "webServicePreference", "riskTolerancePreference", "timeHorizonPreference", "userPreference", "<password>", "reminderfreq", "0.0", "<email>" as key-value pairs in Params
    And User executes the get request
    Then User validates the response status is "<code>"
    Examples:
      | password  | email                                       | code |
      | Demo1234  | zbhatuk-demo3@tenupsoft.com                 | 200  |
      | Demo1234  | zbhatuk-demo3@tenupsoft.com                 | 406  |
      | Demo1234  | testing1234gmail.com                        | 400  |
      | Demo1234  | testing@1234@gmail.com                      | 400  |
      | Demo1234  | testing1234 gmail.com                       | 400  |
      | Demo1234  | testing1234@gmail.com;testing4567@gmail.com | 400  |
      | Demo1234  | testing1234$!gmail.com                      | 400  |

      | Demo1234  | testing1234@gamail.com                      | 400  |
      | Admin@123 | testing1234@gmail.com                       | 400  |
      | admin     | testing1234@gamail.com                      | 400  |
      | Ab1       | testing1234@gamail.com                      | 400  |
      | 123       | testing1234@gamail.com                      | 400  |



  #tc-2
  @testL
  Scenario: User is able to validate the LoanInSight Register API response
    Given Keep the query parameters as key-value pairs in Params blank
    And User executes the get request
    Then User validates the response status is "400"

  #tc-3
  @testL
  Scenario: user is able to validate the LoanInSight Register API response
    Given Enter the query parameters password, email, confirmPassword as key-value pairs in Params
    And User executes the get request
    Then User validates the response status is "200"

    #tc-4
  @testL
  Scenario: user is able to validate the LoanInSight Register API response
    Given Enter the query parameters "airVal", "citi", "10000", "karnataka", "2", "bangalore", "google", "2", "15:30", "loaninsight", "Admin@123", "monthly", "free", "testing123@gmail.com" as key-value pairs in Params
    And User executes the get request
    Then User validates the response status is "200"


  #tc-6
  @testL
  Scenario: user is able to validate the LoanInSight Register API response
    Given Enter the query parameters "airVal", "lender", "loanAmt", "state", "numOfYears", "locationPreference", "webServicePreference", "riskTolerancePreference", "timeHorizonPreference", "userPreference", "reminderfreq", "0.0", "zbhatuk-demo3@tenupsoft.com" as key-value pairs in Params
    And User executes the get request
    Then User validates the response status is "400"

  #tc-7
  @testL
  Scenario: user is able to validate the LoanInSight Register API response
    Given Enter the query parameters "airVal", "lender", "loanAmt", "state", "numOfYears", "locationPreference", "webServicePreference", "riskTolerancePreference", "timeHorizonPreference", "userPreference", "Demo1234", "reminderfreq", "0.0" key-value pairs in Params
    And User executes the get request
    Then User validates the response status is "400"

