package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.EnterUserData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.InsertUserData;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Juan wants to register on the page$")
    public void thatJuanWantsToRegisterOnThePage() {
            OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage());
    }

    @When("^he enters the required information in the form$")
    public void heEntersTheRequiredInformationInTheForm(List< EnterUserData > enterUserData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(InsertUserData.the(
                enterUserData.get(0).getStrName(),
                enterUserData.get(0).getStrLastName(),
                enterUserData.get(0).getStrEmail(),
                enterUserData.get(0).getStrPassword(),
                enterUserData.get(0).getStrConfirmPassword()));
    }

    @Then("^a successful registration message is displayed$")
    public void aSuccessfulRegistrationMessageIsDisplayed(List< EnterUserData > enterUserData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.
                seeThat(Answer.toThe(enterUserData.get(0).getStrConfirmation())));
    }
}
