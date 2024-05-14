package login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginErrorUserTest {

    LoginPage loginPage = new LoginPage();

    @DisplayName("Авторизация пользователя с ошибками на сайте")
    @Test
    void loginStandardUser() {
        loginPage.openLoginPage()
                .setErrorLogin()
                .setPassword()
                .clickLoginButton()
                .checkSuccessLogin();

    }
}
