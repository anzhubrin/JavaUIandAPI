package cart;

import login.LoginStandardUserTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

public class AddThreeProductsInCart extends LoginStandardUserTest {

    InventoryPage addingToCart = new InventoryPage();

    @DisplayName("Добавление трех товаров в карзину")
    @Test
    void addThreeProductsInCart() {
        addingToCart.addAndCheckOneProduct();
        addingToCart.addAndCheckSecondAndThirdProduct();
    }
}
