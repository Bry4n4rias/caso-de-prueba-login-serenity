package starter.wishlist;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.checkout.ConfirmedOrder;

public class ProductAddedConfirmed implements Question<String> {

    public static Question<String> value(){
        return new ProductAddedConfirmed();
    }


    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ProductAddedConfirmScreen.CONFIRMED_MESSAGE).getText();
    }
}
