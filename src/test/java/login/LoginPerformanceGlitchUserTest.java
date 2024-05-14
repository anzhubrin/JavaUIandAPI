package login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginPerformanceGlitchUserTest {

    LoginPage loginPage = new LoginPage();

    @Tag("BLOCKER")
    @DisplayName("Авторизация глюченного пользователя")
    @Test
    void loginStandardUser() {
        loginPage.openLoginPage()
                .setGlitchLogin()
                .setPassword()
                .clickLoginButton()
                .checkSuccessLogin();
    }
}
