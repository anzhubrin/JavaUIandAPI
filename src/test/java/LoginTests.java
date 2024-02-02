import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class LoginTests {

    String standardUser = "standard_user";
    String password = "secret_sauce";

    String BASE_URL = "https://www.saucedemo.com/";

    @Test
    void loginStandardUser() {

        SelenideLogger.addListener("allure", new AllureSelenide());
        open(BASE_URL);
        $("#user-name").setValue(standardUser);
        $("#password").setValue(password);
        $("#login-button").click();
        $(".title").shouldHave(Condition.exactText("Products"));

    }

    @Test
    void loginStandardUserWithStep() {

        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную авторизации", () -> {
            open(BASE_URL);
        });

        step("Вводим логин и пароль пользователя", () -> {
            $("#user-name").setValue(standardUser);
            $("#password").setValue(password);
        });

        step("Нажимаем кнопку Login", () -> {
            $("#login-button").click();
        });

        step("Проверяем, что авторизация прошла успешно", () -> {
            $(".title").shouldHave(Condition.exactText("Products"));
        });
    }
}
