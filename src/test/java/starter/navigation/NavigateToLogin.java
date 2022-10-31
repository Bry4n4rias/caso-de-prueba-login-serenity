package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToLogin {
    public static  Performable automationLogin(){
        return Task.where("{0} opens the AutomationPractice login page",
                Open.browserOn().the(AutomationPracticeLoginPage.class));
    }

}
