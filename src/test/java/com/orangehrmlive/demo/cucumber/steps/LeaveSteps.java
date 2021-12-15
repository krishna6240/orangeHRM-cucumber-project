package com.orangehrmlive.demo.cucumber.steps;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LeaveListPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LeaveSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String userName) {
        new HomePage().clickAndSendTextToUsernameField(userName);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new HomePage().clickAndSendTextToPasswordField(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginBtn();
    }

    @And("^I click on leave list$")
    public void iClickOnLeaveList() {
        new LeaveListPage().clickOnLeaveListLink();
    }

    @Then("^verify employee \"([^\"]*)\" text$")
    public void verifyEmployeeText(String leaveStatusTxt)  {
        Assert.assertEquals(new LeaveListPage().getShowLeaveWithStatusText(),leaveStatusTxt);

    }

    @And("^I enter employee name \"([^\"]*)\"$")
    public void iEnterEmployeeName(String employeeName)  {
        new LeaveListPage().enterEmployeeName("Linda Anderson");

    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        new LeaveListPage().clickOnSearchButton();
    }

    @Then("^verify serach result of employee name \"([^\"]*)\"$")
    public void verifySerachResultOfEmployeeName(String empName)  {
        Assert.assertEquals(new LeaveListPage().verifyEmployeeName(),empName);

    }
}
