package steps;

import io.cucumber.java.en.And;
import model.Authenticate;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import question.LoginBox;
import task.Login;
import ui.LoginPage;

public class LoginSteps {
    @Managed
    WebDriver browser;
    @And("^that (.*) is browsing the home page$")
    public void verifyThatUserIsOnTheHomePage(String actorName){
        OnStage.theActorCalled(actorName).whoCan(BrowseTheWeb.with(browser)).attemptsTo(
                Open.url("https://www.saucedemo.com/"),
                Ensure.that(LoginPage.LOGIN_BOX).isDisplayed()
        );
    }

    @And("^(?:he|she|they|we) login with authenticated account$")
    public void loginWithAuthenticatedAccount(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.with(new Authenticate("abc","abc"))
        );
    }
}
