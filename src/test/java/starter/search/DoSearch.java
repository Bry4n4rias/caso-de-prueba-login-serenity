package starter.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoSearch implements Task {

    private final String term;

    public DoSearch(String term) {
        this.term = term;
    }

    public static Performable withTerm(String term){
        return instrumented(DoSearch.class, term);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(term).into(SearchForm.SEARCH_FIELD),
                Click.on(SearchForm.SEARCH_BUTTON)
        );

    }
}
