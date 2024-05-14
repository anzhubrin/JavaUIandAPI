package sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ProductsPage;
import pages.LoginPage;

public class SortingByNameZATest {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @DisplayName("Обратная сортировка по алфавиту")
    @Test
    void sortingByNameZA() {
        loginPage.openLoginPage()
                .setStandardLogin()
                .setPassword()
                .clickLoginButton()
                .checkSuccessLogin();

        productsPage.clickZA()
                .checkZA();
        }
}
