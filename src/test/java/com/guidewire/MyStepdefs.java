package com.guidewire;

import com.guidewire.Calculator;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesFirstAndSecond(int num1, int num2) throws Throwable {
            value1=num1;
            value2=num2;
    }

    @When("^I add the two values$")
    public void iAddTheTwoValues() throws Throwable {
        result = calculator.add(value1, value2);
    }

    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int expectedResult) throws Throwable {
        Assert.assertEquals(expectedResult, result);
    }
}
