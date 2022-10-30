package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToSearch {
    public static Performable automationSearchPage(){
        return Task.where("{0} opens the AutomationPractice search page",
                Open.browserOn().the(AutomationPracticeSearchPage.class));
    }
}
