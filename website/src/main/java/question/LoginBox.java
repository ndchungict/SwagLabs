package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.LoginPage;

public class LoginBox implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginPage.LOGIN_BOX.resolveFor(actor).isDisplayed();
    }

    public static Question<Boolean> isDisplayed(){
        return new LoginBox();
    }
}
