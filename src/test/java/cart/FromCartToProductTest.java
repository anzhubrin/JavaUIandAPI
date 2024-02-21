package cart;

import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.LoginPage;

public class FromCartToProductTest {

    private final String LOGIN = "standard_user";
    private final String PASSWORD = "secret_sauce";

    LoginPage loginPage = new LoginPage();
    CartPage cartPage = new CartPage();

    @Test
    void fromCartToProductTest() {
        loginPage.openLoginPage();
        loginPage.setLogin(LOGIN);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        cartPage.goToCart();
        cartPage.goToProductFromCard();
    }
}
