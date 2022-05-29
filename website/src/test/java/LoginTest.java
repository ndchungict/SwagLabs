import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTest {
    @Test
    public void login_succesfull(){
        Assertions.assertTrue(true);
    }
    @Test
    public void login_succesfull2(){
        Assertions.assertTrue(false);
    }
}
