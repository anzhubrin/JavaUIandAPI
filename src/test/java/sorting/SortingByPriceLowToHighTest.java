package sorting;

import login.LoginStandardUserTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class SortingByPriceLowToHighTest extends LoginStandardUserTest {

    private final String LOGIN = "standard_user";
    private final String PASSWORD = "secret_sauce";

    LoginPage loginPage = new LoginPage();
    InventoryPage sorting = new InventoryPage();

    @DisplayName("Сортировка по возврастанию цены")
    @Test
    void ByPriceLowToHigh() {
        loginPage.openLoginPage();
        loginPage.setLogin(LOGIN);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        sorting.clickLowToHigh();
        sorting.checkLowToHigh();
    }
}
