Feature: Register Feature

  @testLoan
  Scenario Outline: User is able to validate the LoanInSite Register API response
    Given Enter the query parameters "airVal", "lender", "loanAmt", "state", "numOfYears", "locationPreference", "webServicePreference", "riskTolerancePreference", "timeHorizonPreference", "userPreference", "Demo1234", "reminderfreq", "0.0", "zbhatuk-demo3@tenupsoft.com" as key-value pairs in Params
    And User executes the get request
    Then User validates the response status is "<code>"
    Examples:
      | code |
      | 200  |
      | 406  |
