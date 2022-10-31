package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.checkout.ConfirmedOrder;
import starter.checkout.DoCheckout;
import starter.login.DoLogin;
import starter.navigation.NavigateToLogin;
import starter.navigation.NavigateToSearch;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class CheckoutStepDefinitions {

    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^(.*) wants to buy a product")
    public void wants_to_buy_a_product(String name) {
        this.name = name;
    }

    @When("he logs and complete all steps of the order")
    public void he_logs_and_complete_all_steps_of_the_order() {

        theActorCalled(name).attemptsTo(
                // login
                NavigateToLogin.automationLogin(),
                DoLogin.withCredentials("brayank012@gmail.com", "921202"),
                // go to home and add product
                NavigateToSearch.automationSearchPage(),
                DoCheckout.checkoutProcess()
        );
    }

    @Then("He should have the purchase confirmation and order number")
    public void he_should_have_the_purchase_confirmation_and_order_number() {
        theActorInTheSpotlight().should(seeThat("The message of confirmation", ConfirmedOrder.value(), equalTo("Your order on My Store is complete."))
        );
    }

}
