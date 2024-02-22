package smoke;

import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.LoginPage;

public class FullBuyProductTest {

    LoginPage loginPage = new LoginPage();
    CartPage cartPage = new CartPage();

    @Test
    void fromCartToProductTest() {
        loginPage.openLoginPage();
        loginPage.setStandardLogin();
        loginPage.setPassword();
        loginPage.clickLoginButton();
        cartPage.goToCart();
        cartPage.goToCheckout();
        cartPage.enterInfoForOrder();
        cartPage.FinishOrder();
    }
}
