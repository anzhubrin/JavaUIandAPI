package sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ProductsPage;
import pages.LoginPage;

public class SortingByNameAZTest {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @DisplayName("Сортировка по алфавиту")
    @Test
    void sortingByNameAZ() {
        loginPage.openLoginPage()
                .setStandardLogin()
                .setPassword()
                .clickLoginButton()
                .checkSuccessLogin();

        productsPage.clickAZ()
                .checkAZ();
    }
}
