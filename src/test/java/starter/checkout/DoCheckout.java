package starter.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoCheckout implements Task {


    public static Performable checkoutProcess(){
        return instrumented(DoCheckout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutProcessObjects.PRODUCT_CHOOSED),
                Click.on(CheckoutProcessObjects.ADD_TO_CART_BUTTON),
                Click.on(CheckoutProcessObjects.PROCCED_TO_CHECKOUT_BUTTON1),
                Click.on(CheckoutProcessObjects.PROCCED_TO_CHECKOUT_BUTTON2),
                Click.on(CheckoutProcessObjects.PROCCED_TO_CHECKOUT_BUTTON3),
                Click.on(CheckoutProcessObjects.TERMS_OF_SERVICE_BUTTON4),
                Click.on(CheckoutProcessObjects.PROCCED_TO_CHECKOUT_BUTTON4),
                Click.on(CheckoutProcessObjects.PAY_BY_BANK_WIRE),
                Click.on(CheckoutProcessObjects.CONFIRM_ORDER_BUTTON)
        );

    }
}
