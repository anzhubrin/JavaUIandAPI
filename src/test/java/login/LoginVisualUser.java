package login;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginVisualUser {

    LoginPage loginPage = new LoginPage();

    @Test
    void loginStandardUser() {
        loginPage.openLoginPage();
        loginPage.setLogin("visual_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
    }
}
