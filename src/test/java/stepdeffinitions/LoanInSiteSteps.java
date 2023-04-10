package stepdeffinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.utilities.CommonClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoanInSiteSteps {

    @Given("User sets base URL for LoanInSight API request")
    public static void userSetsBaseURLForLoanInSiteAPIRequest() {
        CommonClass.setURL();

    }

    @And("User sets basic authorization for the API request")
    public static void userSetsBasicAuthorizationForTheAPIRequest() {
        CommonClass.setAuthorization();

    }

    @Given("User enters the key-value pairs for username {string} & password {string} in the selected option {string}")
    public void userEntersTheKeyValuePairsForUsernamePasswordInTheSelectedOption(String usernameValue, String passwordValue, String option) {
        CommonClass.setFormParameters(usernameValue, passwordValue, option);

    }

    @And("User executes the post request")
    public void userExecutesThePostRequest() {
        String endPoint = CommonClass.property.getProperty("loginEndPoint").toString();
        CommonClass.setPostRequest(endPoint);

    }

    @Then("User validates the response status is {string}")
    public void userValidatesTheResponseStatusIs(String code) {
        CommonClass.statusCodeComparison(Integer.parseInt(code));

    }



    @Given("Enter the query parameters {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} as key-value pairs in Params")
    public void enterTheQueryParametersAsKeyValuePairsInParams(String airVal, String lender, String loanAmt, String state, String numOfYears, String locationPreference, String webServicePreference, String riskTolerancePreference, String timeHorizonPreference, String userPreference, String password, String reminderfreq, String plan, String email) {
        CommonClass.setQuerryParameters(airVal, lender, loanAmt, state, numOfYears, locationPreference, webServicePreference, riskTolerancePreference, timeHorizonPreference, userPreference, password, reminderfreq, plan, email);

    }

    @And("User executes the get request")
    public void userExecutesTheGetRequest() {
        String endPoint = CommonClass.property.getProperty("registerEndPoint").toString();
        CommonClass.setGetRequest(endPoint);

    }


    @Given("Keep the query parameters as key-value pairs in Params blank")
    public void keepTheQueryParametersAsKeyValuePairsInParamsBlank() {
        CommonClass.setParams("","");

    }

    @Given("Enter the query parameters password, email, confirmPassword as key-value pairs in Params")
    public void enterTheQueryParametersPasswordEmailConfirmPasswordAsKeyValuePairsInParams() {
        CommonClass.setEmailPassword();

    }


    @Given("Enter the query parameters {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} as key-value pairs in Params")
    public void enterTheQueryParametersAsKeyValuePairsInParams(String airVal, String lender, String loanAmt, String state, String numOfYears, String locationPreference, String webServicePreference, String riskTolerancePreference, String timeHorizonPreference, String userPreference, String reminderfreq, String plan, String email) {
        CommonClass.getRequest = CommonClass.request
                .queryParam("airVal",airVal)
                .queryParam("lender",lender)
                .queryParam("loanAmt",loanAmt)
                .queryParam("state",state)
                .queryParam("numOfYears",numOfYears)
                .queryParam("locationPreference",locationPreference)
                .queryParam("webServicePreference",webServicePreference)
                .queryParam("riskTolerancePreference",riskTolerancePreference)
                .queryParam("timeHorizonPreference",timeHorizonPreference)
                .queryParam("userPreference",userPreference)
                .queryParam("reminderfreq",reminderfreq)
                .queryParam("plan",plan)
                .queryParam("email",email);
    }

    @Given("Enter the query parameters {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} key-value pairs in Params")
    public void enterTheQueryParametersKeyValuePairsInParams(String airVal, String lender, String loanAmt, String state, String numOfYears, String locationPreference, String webServicePreference, String riskTolerancePreference, String timeHorizonPreference, String userPreference, String password, String reminderfreq, String plan) {
        CommonClass.getRequest = CommonClass.request
                .queryParam("airVal",airVal)
                .queryParam("lender",lender)
                .queryParam("loanAmt",loanAmt)
                .queryParam("state",state)
                .queryParam("numOfYears",numOfYears)
                .queryParam("locationPreference",locationPreference)
                .queryParam("webServicePreference",webServicePreference)
                .queryParam("riskTolerancePreference",riskTolerancePreference)
                .queryParam("timeHorizonPreference",timeHorizonPreference)
                .queryParam("userPreference",userPreference)
                .queryParam("password",password)
                .queryParam("reminderfreq",reminderfreq)
                .queryParam("plan",plan)
                .queryParam("confirmPassword",password);
    }



}
