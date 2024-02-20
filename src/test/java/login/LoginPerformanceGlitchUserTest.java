package login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginPerformanceGlitchUserTest {

    private final String LOGIN = "performance_glitch_user";
    private final String PASSWORD = "secret_sauce";

    LoginPage loginPage = new LoginPage();

    @Tag("BLOCKER")
    @DisplayName("Авторизация глюченного пользователя")
    @Test
    void loginStandardUser() {

        loginPage.openLoginPage();
        loginPage.setLogin(LOGIN);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
    }
}
