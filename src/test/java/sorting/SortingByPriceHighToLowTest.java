package sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ProductsPage;
import pages.LoginPage;

public class SortingByPriceHighToLowTest {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @DisplayName("Сортировка по убыванию цены")
    @Test
    void sortingByPriceHighToLow() {
        loginPage.openLoginPage()
                .setStandardLogin()
                .setPassword()
                .clickLoginButton()
                .checkSuccessLogin();

        productsPage.clickHighToLow()
                .checkHighToLow();
    }
}
