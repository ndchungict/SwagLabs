package task;

import lombok.AllArgsConstructor;
import model.Authenticate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.LoginPage;

@AllArgsConstructor
public class Login implements Task {
    Authenticate authenticated;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(authenticated.getUsername()).into(LoginPage.TXT_USERNAME),
                Enter.theValue(authenticated.getPassword()).into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN)
        );
    }

    public static Login with(Authenticate authenticated){
        return Tasks.instrumented(Login.class,authenticated);
    }
}
