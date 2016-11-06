package skeleton;

import src.main.java.skeleton.CostOfCalling;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Stepdefs {
    private CostOfCalling costOfCalling;
    private float minutes;
    private float sumCost;

    @Before
    public void setUp() {
        costOfCalling = new CostOfCalling();
    }

    //Scenario: User has not called yet
    @Given("^I have not started any calls, (\\d+) minute$")
    public void i_have_not_started_any_calls_minutes(float minutes) throws Throwable {
        this.minutes = minutes;
    }

    @When("^I use this program to calculate my cost$")
    public void i_use_this_program_to_calculate_my_cost() throws Throwable {
        this.sumCost = costOfCalling.calculate(this.minutes);
    }

    @Then("^I pay (\\d+) VND for this call$")
    public void i_pay_VND_for_this_call(float expectSum) throws Throwable {
        assertThat(this.sumCost, is(expectSum));
    }


    //Scenario: using data from Example
     @Given("^I have a call in (\\d+) minutes$")
    public void i_have_a_call_in_minutes(float minutes) throws Throwable {
        this.minutes = minutes;
    }

    @Then("^my cost of call should be (\\d+)$")
    public void my_cost_of_call_should_be(float expectSum) throws Throwable {
        assertThat(this.sumCost, is(expectSum));
    }
}
