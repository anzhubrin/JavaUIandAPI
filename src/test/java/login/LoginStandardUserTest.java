package login;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginStandardUserTest {

    LoginPage loginPage = new LoginPage();

    @DisplayName("Авторизация стандартного пользователя")
    @Test
    void loginStandardUser() {

        Configuration.remote = "http://localhos:4444/wd/hub";

        loginPage.openLoginPage();
        loginPage.setStandardLogin();
        loginPage.setPassword();
        loginPage.clickLoginButton();
    }
}
