package starter.wishlist;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import starter.checkout.DoCheckout;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoAddToWishList implements Task {

    public static Performable checkoutProcess(){
        return instrumented(DoAddToWishList.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddToWishListProccessObject.PRODUCT_CHOOSED),
                Click.on(AddToWishListProccessObject.ADD_TO_WISH_LIST_BUTTON)
        );
    }
}
