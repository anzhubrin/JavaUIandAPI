package sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class SortingByNameAZTest {

    private final String LOGIN = "standard_user";
    private final String PASSWORD = "secret_sauce";

    LoginPage loginPage = new LoginPage();
    InventoryPage sorting = new InventoryPage();

    @DisplayName("Сортировка по алфавиту")
    @Test
    void sortingByNameAZ() {
        loginPage.openLoginPage();
        loginPage.setLogin(LOGIN);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        sorting.clickAZ();
        sorting.checkAZ();
    }
}
