package starter.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class UserName implements Question<String> {

    public static Question<String> value(){
        return new UserName();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(DataUserOverview.USER_NAME).getText();
    }
}
