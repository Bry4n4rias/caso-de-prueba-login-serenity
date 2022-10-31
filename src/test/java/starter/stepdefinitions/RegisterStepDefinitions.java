package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.dashboard.UserName;
import starter.login.DoLogin;
import starter.navigation.NavigateToLogin;
import starter.register.DoRegister;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class RegisterStepDefinitions {

    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^(.*) has not an account")
    public void has_not_an_account(String name) {
        this.name = name;
    }

    @When("he sends their valid data")
    public void he_sends_their_valid_data() {

        theActorCalled(name).attemptsTo(
                NavigateToLogin.automationHome(),

                DoRegister.withDataOfRegister("brayank155@gmail.com", "Daniel", "Suarez", "921202", "2", "2", "25", "Calle 50 copacabana", "Medellin", "2", "00000", "1", "3135645492")

        );

    }

    @Then("he should has a new account")
    public void he_should_has_a_new_account() {
        theActorInTheSpotlight().should(seeThat("The user name", UserName.value(), equalTo("Daniel Suarez"))

        );
    }


}
