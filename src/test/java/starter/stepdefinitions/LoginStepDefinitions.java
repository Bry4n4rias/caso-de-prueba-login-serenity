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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinitions {

    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^(.*) has an active account")
    public void has_an_active_account(String name) {
        this.name = name;
    }

    @When("he sends their valid credentials")
    public void he_sends_their_valid_credentials() {
        theActorCalled(name).attemptsTo(
                NavigateToLogin.automationLogin(),
                DoLogin.withCredentials("brayank012@gmail.com", "921202")
        );
    }

    @Then("he should have access to his account")
    public void he_should_have_access_to_his_account() {

        theActorInTheSpotlight().should(seeThat("The user name", UserName.value(), equalTo("Bryan Arias"))

        );
    }
}
