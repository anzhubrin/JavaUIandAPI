package cart;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.LoginPage;

public class FromCartToProductTest {

    LoginPage loginPage = new LoginPage();
    CartPage cartPage = new CartPage();

    @DisplayName("Переход из корзины в выбранный продукт")
    @Test
    void fromCartToProductTest() {
        loginPage.openLoginPage()
                .setStandardLogin()
                .setPassword()
                .clickLoginButton()
                .checkSuccessLogin();

        cartPage.goToCart()
                .goToProductFromCard()
                .checkProductFromCard();
    }
}
