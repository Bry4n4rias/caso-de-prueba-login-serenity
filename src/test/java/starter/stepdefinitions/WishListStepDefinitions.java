package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.checkout.DoCheckout;
import starter.login.DoLogin;
import starter.navigation.NavigateToLogin;
import starter.navigation.NavigateToSearch;
import starter.wishlist.DoAddToWishList;
import starter.wishlist.ProductAddedConfirmed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class WishListStepDefinitions {

    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) wants to add a product to wishlist")
    public void wants_to_add_a_product_to_wishlist(String name) {
        this.name = name;
    }

    @When("he logs and complete all steps to add the product")
    public void he_logs_and_complete_all_steps_to_add_the_product() {
        theActorCalled(name).attemptsTo(
                // login
                NavigateToLogin.automationLogin(),
                DoLogin.withCredentials("brayank012@gmail.com", "921202"),

                NavigateToSearch.automationSearchPage(),
                DoAddToWishList.checkoutProcess()
        );
    }

    @Then("He should have the purchase confirmation y update the wish list")
    public void he_should_have_the_purchase_confirmation_y_update_the_wish_list() {
        theActorInTheSpotlight().should(seeThat("The message of confirmation", ProductAddedConfirmed.value(), equalTo("Added to your wishlist."))
        );
    }

}
