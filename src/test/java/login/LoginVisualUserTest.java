package login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginVisualUserTest {

    LoginPage loginPage = new LoginPage();

    @DisplayName("Авторизация визуального пользователя, только просмотр товаров")
    @Test
    void loginStandardUser() {
        loginPage.openLoginPage();
        loginPage.setVisualLogin();
        loginPage.setPassword();
        loginPage.clickLoginButton();
    }
}
