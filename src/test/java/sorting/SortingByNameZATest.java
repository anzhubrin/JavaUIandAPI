package sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class SortingByNameZATest {

    private final String LOGIN = "standard_user";
    private final String PASSWORD = "secret_sauce";

    LoginPage loginPage = new LoginPage();
    InventoryPage sorting = new InventoryPage();

    @DisplayName("Обратная сортировка по алфавиту")
    @Test
    void sortingByNameZA() {
        sorting.clickZA();
        sorting.checkZA();
        loginPage.openLoginPage();
        loginPage.setLogin(LOGIN);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();

        }
}
