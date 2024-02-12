package login;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginVisualUser {

    String visualUser = "visual_user";
    String password = "secret_sauce";

    @DisplayName("Авторизация пользователя")
    @Test
    void loginStandardUser() {

        open("https://www.saucedemo.com/");
        $("#user-name").setValue(visualUser);
        $("#password").setValue(password);
        $("#login-button").click();
        $(".title").shouldHave(Condition.exactText("Products"));
    }
}
