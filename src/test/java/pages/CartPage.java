package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement GoToCart = $(".shopping_cart_link");
    private final SelenideElement GoToProductFromCard = $(".inventory_item_name");
    private final SelenideElement BackToProductsButton = $("#back-to-products");
    private final SelenideElement ContinueShoppingButton = $("#continue-shopping");
    private final SelenideElement textWithProduct = $(".title");

    public void goToCart() {
        GoToCart.click();
    }
    public void goToProductFromCard() {
        GoToProductFromCard.click();
        BackToProductsButton.shouldBe(visible);
    }
    public void continueShoppingButton() {
        ContinueShoppingButton.click();
        textWithProduct.shouldHave(text("Products"));
    }
}
