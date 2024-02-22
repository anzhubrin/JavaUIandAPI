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
    private final SelenideElement Checkout = $("#checkout");
    private final SelenideElement firstName = $("#first-name");
    private final SelenideElement lastName = $("#last-name");
    private final SelenideElement postalCode = $("#postal-code");
    private final SelenideElement continueButton = $("#continue");
    private final SelenideElement finishButton = $("#finish");
    private final SelenideElement CheckFinishOrder = $(".complete-header");

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

    public void goToCheckout() {
        Checkout.click();
    }

    public void enterInfoForOrder() {
        firstName.setValue("Andre");
        lastName.setValue("Silva");
        postalCode.setValue("4435");
        continueButton.click();
    }

    public void FinishOrder() {
        finishButton.click();
        CheckFinishOrder.shouldHave(text("Thank you for your order!"));
    }
}
