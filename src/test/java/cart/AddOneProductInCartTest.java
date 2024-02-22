package cart;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class AddOneProductInCartTest {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    @DisplayName("Добавление одного товара в корзину")
    @Test
    void addOneProductInCart() {
        loginPage.openLoginPage();
        loginPage.setStandardLogin();
        loginPage.setPassword();
        loginPage.clickLoginButton();
        inventoryPage.addAndCheckOneProduct();
    }
}
