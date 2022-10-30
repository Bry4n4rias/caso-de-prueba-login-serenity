package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.search.SearchedTerm;
import starter.navigation.NavigateToSearch;
import starter.search.DoSearch;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;


public class SearchStepDefinitions {

    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^(.*) wants to find a product")
    public void wants_to_find_a_product(String name) {
        this.name = name;
    }

    @When("he enters the search term")
    public void he_enters_the_search_term() {
        theActorCalled(name).attemptsTo(
                NavigateToSearch.automationSearchPage(),
                DoSearch.withTerm("printed")

        );
    }

    @Then("he should access the products available for the term")
    public void he_should_access_the_products_available_for_the_term() {
        theActorInTheSpotlight().should(seeThat("The term searched", SearchedTerm.value(), equalTo("\"PRINTED\""))
        );
    }

}
