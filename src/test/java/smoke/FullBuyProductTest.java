package smoke;

import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.LoginPage;

public class FullBuyProductTest {

    LoginPage loginPage = new LoginPage();
    CartPage cartPage = new CartPage();

    @Test
    void fromCartToProductTest() {
        loginPage.openLoginPage()
                .setStandardLogin()
                .setPassword()
                .clickLoginButton()
                .checkSuccessLogin();

        cartPage.goToCart()
                .goToCheckout()
                .enterInfoForOrder()
                .finishOrder()
                .checkFinishOrder();
    }
}
