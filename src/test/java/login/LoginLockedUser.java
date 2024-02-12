package login;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginLockedUser {
    String lockedUser = "locked_out_user";
    String password = "secret_sauce";

    @DisplayName("Авторизация пользователя")
    @Test
    void loginLockedUser(){
        open("https://www.saucedemo.com/");
        $("#user-name").setValue(lockedUser);
        $("#password").setValue(password);
        $("#login-button").click();
        $(".error-button").shouldBe(Condition.visible);
    }
}
