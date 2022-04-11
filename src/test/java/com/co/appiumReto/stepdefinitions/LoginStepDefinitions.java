package com.co.appiumReto.stepdefinitions;

import com.co.appiumReto.questions.HomeBalance;
import com.co.appiumReto.tasks.LogIn;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^I login with username and password$")
    public void iLoginWithUsernameAndPassword(List<Map<String, String>> datos) throws Throwable {
        theActorCalled("liseth").attemptsTo(LogIn.the(datos.get(0)));
    }

    @Then("^you can see your balance$")
    public void youCanSeeYourBalance() throws Throwable {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(HomeBalance.isVisible()));
    }

}
