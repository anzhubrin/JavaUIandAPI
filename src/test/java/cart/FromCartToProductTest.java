package cart;

import org.junit.jupiter.api.Test;
import pages.CartPage;

public class FromCartToProductTest extends AddOneProductInCart{

    CartPage cartPage = new CartPage();

    @Test
    void fromCartToProductTest() {

        cartPage.goToCart();
        cartPage.goToProductFromCard();
    }
}
