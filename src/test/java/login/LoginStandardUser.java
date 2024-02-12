package login;
import org.junit.jupiter.api.Test;
import pages.LoginPage;


public class LoginStandardUser {

    LoginPage loginPage = new LoginPage();

    @Test
    void loginStandardUser() {

        loginPage.openLoginPage();
        loginPage.setLogin("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
    }
}
