package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private final String LOGIN_URL = "https://www.saucedemo.com/";
    private final SelenideElement loginField = $("#user-name");
    private final SelenideElement passwordField = $("#password");
    private final SelenideElement loginButton = $("#login-button");
    private final SelenideElement textWithProduct = $(".title");

    public void openLoginPage() {
        open(LOGIN_URL);
    }

    public void setStandardLogin() {
        loginField.setValue("standard_user");
    }

    public void setVisualLogin() {
        loginField.setValue("visual_user");
    }

    public void setGlitchLogin() {
        loginField.setValue("performance_glitch_user");
    }

    public void setProblemLogin() {
        loginField.setValue("problem_user");
    }

    public void setLockedLogin() {
        loginField.setValue("locked_out_user");
    }

    public void setErrorLogin() {
        loginField.setValue("error_user");
    }

    public void setPassword() {
        passwordField.setValue("secret_sauce");
    }

    public void clickLoginButton() {
        loginButton.click();
        textWithProduct.shouldHave(Condition.exactText("Products"));
    }

    public void clickLoginButtonAndError() {
        loginButton.click();
        $(".error-button").shouldBe(Condition.visible);
    }
}
