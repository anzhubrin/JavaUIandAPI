package sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ProductsPage;
import pages.LoginPage;

public class SortingByPriceLowToHighTest {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @DisplayName("Сортировка по возврастанию цены")
    @Test
    void ByPriceLowToHigh() {
        loginPage.openLoginPage()
                .setStandardLogin()
                .setPassword()
                .clickLoginButton()
                .checkSuccessLogin();

        productsPage.clickLowToHigh()
                .checkLowToHigh();
    }
}
