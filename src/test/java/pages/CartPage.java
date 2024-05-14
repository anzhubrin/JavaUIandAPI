package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

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

    @Step("Переходим в корзину")
    public CartPage goToCart() {
        GoToCart.click();
        return this;
    }

    @Step("Переходим на площадку с товарами из корзины")
    public CartPage goToProductFromCard() {
        GoToProductFromCard.click();
        return this;
    }

    @Step("Проверяем переход на площадку с товарами из корзины")
    public CartPage checkProductFromCard() {
        BackToProductsButton.shouldBe(visible);
        return this;
    }

    @Step("Нажимаем на кнопку продолжить покупки")
    public CartPage continueShoppingButton() {
        ContinueShoppingButton.click();
        return this;
    }

    @Step("Проверяем что мы на странице с товарами")
    public CartPage checkContinueShoppingButton() {
        textWithProduct.shouldHave(text("Products"));
        return this;
    }

    @Step("Переходим на страницу оформления заказа")
    public CartPage goToCheckout() {
        Checkout.click();
        return this;
    }

    @Step("Заполняем данные покупателя и кликаем далее")
    public CartPage enterInfoForOrder() {
        firstName.setValue("Andre");
        lastName.setValue("Silva");
        postalCode.setValue("4435");
        continueButton.click();
        return this;
    }

    @Step("Кликаем завершить заказ")
    public CartPage finishOrder() {
        finishButton.click();
        return this;
    }

    @Step("Проверяем что заказ завершен")
    public CartPage checkFinishOrder() {
        CheckFinishOrder.shouldHave(text("Thank you for your order!"));
        return this;
    }
}
