package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target LOGIN_BOX = Target.the("Login box")
            .located(By.className("login-box"));;

    public static Target TXT_USERNAME = Target.the("Username text box")
            .located(By.id("user-name"));

    public static Target TXT_PASSWORD = Target.the("Password text box")
            .located(By.id("password"));

    public static Target BTN_LOGIN = Target.the("Button login")
            .located(By.id("login-button"));
}
