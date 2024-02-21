package cart;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class AddThreeProductsInCart {

    private final String LOGIN = "standard_user";
    private final String PASSWORD = "secret_sauce";

    LoginPage loginPage = new LoginPage();
    InventoryPage addingToCart = new InventoryPage();

    @DisplayName("Добавление трех товаров в корзину")
    @Test
    void addThreeProductsInCart() {
        loginPage.openLoginPage();
        loginPage.setLogin(LOGIN);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        addingToCart.addAndCheckOneProduct();
        addingToCart.addAndCheckSecondAndThirdProduct();
    }
}
