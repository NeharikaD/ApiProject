package org.utilities;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.Properties;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class CommonClass {

    public static Properties property = PropertyUtils.loadAllTheProperties();
    public static RequestSpecification request;
    public static RequestSpecification getRequest;
    public static Response response;

    public static String username = property.getProperty("username").toString();
    public static String password = property.getProperty("password").toString();

    public static void setURL() {
        Properties prop = PropertyUtils.loadAllTheProperties();
        String url = prop.getProperty("baseURI");
        baseURI = String.valueOf(url);
    }

    public static void setAuthorization () {
        request = given().auth().basic(username, password);
    }

    public static void statusCodeComparison(Object code) {
        Assert.assertEquals("Failed the test case", code, response.getStatusCode());
    }

    public static void setFormParameters(String usernameValue, String passwordValue, String option) {
        getRequest = request.contentType("application/"+option+"; charset=utf-8")
                .formParam("username", usernameValue)
                .formParam("password", passwordValue);
    }

    public static void setPostRequest(String endPoint) {
        response = getRequest.when().post(endPoint);
    }

    public static void setGetRequest(String endPoint) {
        response = getRequest.when().get(endPoint);
    }

    public static void setQuerryParameters(String airVal, String lender, String loanAmt, String state, String numOfYears, String locationPreference, String webServicePreference, String riskTolerancePreference, String timeHorizonPreference, String userPreference, String password, String reminderfreq, String plan, String email) {
        getRequest = request
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
                .queryParam("email",email)
                .queryParam("confirmPassword",password);
    }

    public static void setParams(String key,Object value) {
        getRequest = request
                .queryParam(key,value);

    }

    public static void setEmailPassword(){
        CommonClass.getRequest = CommonClass.request
                .queryParam("password",password)
                .queryParam("email",username)
                .queryParam("confirmPassword",password);
    }

}
