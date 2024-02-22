package login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginProblemUserTest {

    LoginPage loginPage = new LoginPage();

    @DisplayName("Авторизация проблемного пользователя, с поломанным сайтом")
    @Test
    void loginStandardUser() {
        loginPage.openLoginPage();
        loginPage.setProblemLogin();
        loginPage.setPassword();
        loginPage.clickLoginButton();
    }
}
