package com.example.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.BaseTest;
import com.example.app.Calculator;
import com.example.app.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MathsStepDefinitions extends BaseTest {

    int a = 0;
    int b = 0;
    int total = 0;

    Calculator calculator = new Calculator();

    @Given("a is {int}")
    public void givenAIs(int value) {
        a = value;
    }

    @Given("b is {int}")
    public void givenBIs(int value) {
        b = value;
    }

    @When("I add a and b")
    public void iAddAAndB() {
        total = calculator.add(a,b);
    }

//    @Then("the total should be {int}")
//    public void theTotalShouldBe(int expectedTotal) {
//        assertThat(total).isEqualTo(expectedTotal);
//    }

    @Given("user is on calculator page")
    public void userIsOnCalculatorPage() {

    }

    @When("user input first number {int}")
    public void userInputFirstNumberNumber(int firstNumber) {
        calculatorPage.inputFirstNumber(String.valueOf(firstNumber));
    }

    @When("user input second number {int}")
    public void userInputSecondNumberNumber(int secondNumber) {
        calculatorPage.inputSecondNumber(String.valueOf(secondNumber));
    }
    @Then("user choose icon plus")
    public void userChooseIconPlus() {
        calculatorPage.iconPlus();
    }
    @Then("user click the equals button")
    public void userClickTheEqualsButton() {
        calculatorPage.clickButtonEquals();
    }
    @And("total should be {string}")
    public void theTotalShouldBeTotal(String Total) {
        String total = calculatorPage.EqualsString();
        Assertions.assertEquals(Total, total);
    }
    @And("user click button drop down")
    public void userClickButtonDropDown() {
        calculatorPage.clickButtonDropDown();
    }

    @And("user choose icon minus")
    public void userChooseIconMinus() {
        calculatorPage.iconMinus();
    }

    @And("user choose icon divide")
    public void userChooseIconDivide() {
        calculatorPage.iconDivide();
    }

    @And("user choose icon multiple")
    public void userChooseIconMultiple() {
        calculatorPage.iconMultiple();
    }
}
