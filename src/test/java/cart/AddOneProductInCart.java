package cart;

import login.LoginStandardUserTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

public class AddOneProductInCart extends LoginStandardUserTest {

    InventoryPage addingToCart = new InventoryPage();

    @DisplayName("Добавление одного товара в карзину")
    @Test
    void addOneProductInCart() {
        addingToCart.addAndCheckOneProduct();
    }
}
