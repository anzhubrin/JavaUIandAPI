package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProductsPage {

    private final SelenideElement chooseAZ = $(By.xpath("//*[@value='az']"));
    private final SelenideElement chooseZA = $(By.xpath("//*[@value='za']"));
    private final SelenideElement chooseLowToHigh = $(By.xpath("//*[@value='lohi']"));
    private final SelenideElement chooseHighToLow = $(By.xpath("//*[@value='hilo']"));
    private final SelenideElement checkChooseSort = $(".inventory_item_name");
    private final SelenideElement addFirstToCart = $("#add-to-cart-sauce-labs-backpack");
    private final SelenideElement iconCart = $(".shopping_cart_badge");

    @Step("Выбор сортировки A-Z")
    public ProductsPage clickAZ() {
        chooseAZ.click();
        return this;
    }

    @Step("Выбор сортировки Z-A")
    public ProductsPage clickZA() {
        chooseZA.click();
        return this;
    }

    @Step("Выбор сортировки по возрастанию цены")
    public ProductsPage clickLowToHigh() {
        chooseLowToHigh.click();
        return this;
    }

    @Step("Выбор сортировки по убыванию цены")
    public ProductsPage clickHighToLow() {
        chooseHighToLow.click();
        return this;
    }

    @Step("Проверка сортировки A-Z")
    public ProductsPage checkAZ() {
        checkChooseSort.shouldHave(Condition.text("Sauce Labs Backpack"));
        return this;
    }

    @Step("Проверка сортировки Z-A")
    public ProductsPage checkZA() {
        checkChooseSort.shouldHave(Condition.text("Test.allTheThings() T-Shirt (Red)"));
        return this;
    }

    @Step("Проверка сортировки по возрастанию")
    public ProductsPage checkLowToHigh() {
        checkChooseSort.shouldHave(Condition.text("Sauce Labs Onesie"));
        return this;
    }

    @Step("Проверка сортировки по убыванию")
    public ProductsPage checkHighToLow() {
        checkChooseSort.shouldHave(Condition.text("Sauce Labs Fleece Jacket"));
        return this;
    }

    @Step("Добавление одного товара")
    public ProductsPage addOneProduct() {
        addFirstToCart.click();
        return this;
    }

    @Step("Проверка, что один товар добавлен в корзину")
    public ProductsPage checkOneProduct() {
        iconCart.shouldHave(text("1"));
        return this;
    }
}
