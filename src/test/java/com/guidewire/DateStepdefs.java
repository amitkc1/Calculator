package com.guidewire;

import com.guidewire.DateCalculator;
import cucumber.api.Format;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class DateStepdefs {
    private String result;
    private DateCalculator calculator;

    @Given("today is (\\d{4}-\\d{2}-\\d{2})$")
    public void today_is(@Format("yyyy-MM-dd") Date date) {
        calculator = new DateCalculator(date);
    }

    @When("I ask if (\\d{2}-\\d{2}-\\d{2}) is in the past")
    public void I_ask_if_date_is_in_the_past(@Format("MM-yy-dd") Date date) {
        result = calculator.isDateInThePast(date);
    }

    @Then("the result should be (.+)")
    public void the_result_should_be(String expectedResult) {
        assertEquals(expectedResult, result);
    }
}

