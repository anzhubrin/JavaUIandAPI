import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {

    String standardUser = "standard_user";
    String password = "secret_sauce";

    String BASE_URL = "https://www.saucedemo.com/";

    @Test
    void successfulSearchTest() {

        open(BASE_URL);
        $("#user-name").setValue(standardUser);
        $("#password").setValue(password);
        $("#login-button").click();
        $(".title").shouldHave(Condition.exactText("Products"));

    }
}
