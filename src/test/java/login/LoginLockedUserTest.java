package login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginLockedUserTest {

    LoginPage loginPage = new LoginPage();

    @DisplayName("Авторизация заблокированного пользователя")
    @Test
    void loginLockedUser(){
        loginPage.openLoginPage();
        loginPage.setLockedLogin();
        loginPage.setPassword();
        loginPage.clickLoginButtonAndError();
    }
}
