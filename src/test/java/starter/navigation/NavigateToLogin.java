package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToLogin {
    public static  Performable automationHome(){
        return Task.where("{0} opens the AutomationPractice home page",
                Open.browserOn().the(AutomationPracticeHomePage.class));
    }

}
