package sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class SortingByPriceLowToHighTest {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    @DisplayName("Сортировка по возврастанию цены")
    @Test
    void ByPriceLowToHigh() {
        loginPage.openLoginPage();
        loginPage.setStandardLogin();
        loginPage.setPassword();
        loginPage.clickLoginButton();
        inventoryPage.clickLowToHigh();
        inventoryPage.checkLowToHigh();
    }
}
