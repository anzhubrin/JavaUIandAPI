package login;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
public class LoginStandardUserTest {

    LoginPage loginPage = new LoginPage();

    @DisplayName("Авторизация стандартного пользователя")
    @Test
    void loginStandardUser() {
        loginPage.openLoginPage();
        loginPage.setStandardLogin();
        loginPage.setPassword();
        loginPage.clickLoginButton();
    }
}
