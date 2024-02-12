package login;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginLockedUser {

    LoginPage loginPage = new LoginPage();

    @Test
    void loginLockedUser(){

        loginPage.openLoginPage();
        loginPage.setLogin("locked_out_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButtonAndError();
    }
}
