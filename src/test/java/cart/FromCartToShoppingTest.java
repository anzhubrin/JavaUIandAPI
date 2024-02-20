package cart;

import org.junit.jupiter.api.Test;
import pages.CartPage;

public class FromCartToShoppingTest extends AddOneProductInCart{

    CartPage cartPage = new CartPage();

    @Test
    void fromCartToProductTest() {

        cartPage.goToCart();
        cartPage.continueShoppingButton();
    }
}
