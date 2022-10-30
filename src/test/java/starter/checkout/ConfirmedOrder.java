package starter.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


public class ConfirmedOrder implements Question<String> {

    public static Question<String> value(){
        return new ConfirmedOrder();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ConfirmedOrderScreen.CONFIRMED_ORDER).getText();
    }
}
