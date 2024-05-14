package cart;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ProductsPage;
import pages.LoginPage;

public class AddOneProductInCartTest {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @DisplayName("Добавление одного товара в корзину")
    @Test
    void addOneProductInCart() {
        loginPage.openLoginPage()
                .setStandardLogin()
                .setPassword()
                .clickLoginButton()
                .checkSuccessLogin();

        productsPage.addOneProduct()
                .checkOneProduct();
    }
}
