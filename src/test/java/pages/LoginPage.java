package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private final String LOGIN_URL = "https://www.saucedemo.com/";
    private final SelenideElement loginField = $("#user-name");
    private final SelenideElement passwordField = $("#password");
    private final SelenideElement loginButton = $("#login-button");
    private final SelenideElement textWithProduct = $(".title");

    @Step("Открытие страницы авторизации")
    public LoginPage openLoginPage() {
        open(LOGIN_URL);
        return this;
    }

    @Step("Ввод логина стандартного пользователя")
    public LoginPage setStandardLogin() {
        loginField.setValue("standard_user");
        return this;
    }

    @Step("Ввод логина визуального пользователя")
    public LoginPage setVisualLogin() {
        loginField.setValue("visual_user");
        return this;
    }

    @Step("Ввод логина глюченного пользователя")
    public LoginPage setGlitchLogin() {
        loginField.setValue("performance_glitch_user");
        return this;
    }

    @Step("Ввод логина проблемного пользователя")
    public LoginPage setProblemLogin() {
        loginField.setValue("problem_user");
        return this;
    }

    @Step("Ввод логина заблокированного пользователя")
    public LoginPage setLockedLogin() {
        loginField.setValue("locked_out_user");
        return this;
    }

    @Step("Ввод логина ошибочного пользователя")
    public LoginPage setErrorLogin() {
        loginField.setValue("error_user");
        return this;
    }

    @Step("Ввод пароля")
    public LoginPage setPassword() {
        passwordField.setValue("secret_sauce");
        return this;
    }

    @Step("Нажатие кнопки логина")
    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }

    @Step("Проверка успешной авторизации")
    public LoginPage checkSuccessLogin() {
        textWithProduct.shouldHave(Condition.exactText("Products"));
        return this;
    }

    @Step("Проверка неуспешной авторизации")
    public LoginPage checkNoSuccessLogin() {
        $(".error-button").shouldBe(Condition.visible);
        return this;
    }
}
