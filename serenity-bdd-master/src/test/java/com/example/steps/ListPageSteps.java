package com.example.steps;

import com.example.BaseTest;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class ListPageSteps extends BaseTest {


  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }

  @When("user on list page")
  public void userOnListPage() {

  }

  @Then("user do long pres")
  public void userDoLongPres() {
    listPage.longPressList();
  }

  @Then("user do multiple taps list")
  public void userDoMultipleTapsList() {
    listPage.multipleTaps();
  }


}
