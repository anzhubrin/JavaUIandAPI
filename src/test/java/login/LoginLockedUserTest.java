package login;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginLockedUserTest {

    private final String LOGIN = "locked_out_user";
    private final String PASSWORD = "secret_sauce";

    LoginPage loginPage = new LoginPage();

    @Test
    void loginLockedUser(){

        loginPage.openLoginPage();
        loginPage.setLogin(LOGIN);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButtonAndError();
    }
}
