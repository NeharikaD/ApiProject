package stepdeffinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.utilities.CommonClass;


public class LoanInSiteSteps {

    @Given("User sets base URL for LoanInSite API request")
    public static void userSetsBaseURLForLoanInSiteAPIRequest() {
        CommonClass.setURL();

    }

    @And("User sets basic authorization for the API request")
    public static void userSetsBasicAuthorizationForTheAPIRequest() {
        CommonClass.setAuthorization();

    }

    @Given("user enters the key-value pairs for username {string} & password {string} in the selected option {string}")
    public void userEntersTheKeyValuePairsForUsernamePasswordInTheSelectedOption(String usernameValue, String passwordValue, String option) {
        CommonClass.setFormParameters(usernameValue, passwordValue, option);

    }

    @And("user executes the post request")
    public void userExecutesThePostRequest() {
        String endPoint = CommonClass.property.getProperty("loginEndPoint").toString();
        CommonClass.setPostRequest(endPoint);

    }

    @Then("User validates the response status is {string}")
    public void userValidatesTheResponseStatusIs(String code) {
        CommonClass.statusCodeComparison(Integer.parseInt(code));

    }

    @Given("user enters the key-value pairs for username as invalid username {string} & valid password {string} in the selected option {string}")
    public void userEntersTheKeyValuePairsForUsernameAsInvalidUsernameValidPasswordInTheSelectedOption(String usernameValue, String passwordValue, String option) {
        CommonClass.setFormParameters(usernameValue, passwordValue, option);

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


}
