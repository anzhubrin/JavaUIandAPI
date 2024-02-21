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
    public void setLogin(String value) {
        loginField.setValue(value);
    }
    public void setPassword(String value) {
        passwordField.setValue(value);
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
