package cart;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.LoginPage;

public class FromCartToShoppingTest {

    LoginPage loginPage = new LoginPage();
    CartPage cartPage = new CartPage();

    @DisplayName("Переход из корзины обратно к покупкам")
    @Test
    void fromCartToProductTest() {
        loginPage.openLoginPage();
        loginPage.setStandardLogin();
        loginPage.setPassword();
        loginPage.clickLoginButton();
        cartPage.goToCart();
        cartPage.continueShoppingButton();
    }
}
