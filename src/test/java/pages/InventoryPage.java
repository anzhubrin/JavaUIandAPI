package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {

    private final SelenideElement chooseAZ = $("#header_container > div.header_secondary_container > div > span > select > option:nth-child(1)");
    private final SelenideElement chooseZA = $("#header_container > div.header_secondary_container > div > span > select > option:nth-child(2)");
    private final SelenideElement chooseLowToHigh = $("#header_container > div.header_secondary_container > div > span > select > option:nth-child(3)");
    private final SelenideElement chooseHighToLow = $("#header_container > div.header_secondary_container > div > span > select > option:nth-child(4)");
    private final SelenideElement checkChooseSort = $(".inventory_item_name");
    private final SelenideElement addFirstToCart = $("#add-to-cart-sauce-labs-backpack");
    private final SelenideElement addSecondToCart = $("#add-to-cart-sauce-labs-bike-light");
    private final SelenideElement addThirdToCart = $("#add-to-cart-sauce-labs-bolt-t-shirt");
    private final SelenideElement iconCart = $(".shopping_cart_badge");

    public void clickAZ() {
        chooseAZ.click();
    }

    public void clickZA() {
        chooseZA.click();
    }

    public void clickLowToHigh() {
        chooseLowToHigh.click();
    }

    public void clickHighToLow() {
        chooseHighToLow.click();
    }

    public void checkAZ() {
        checkChooseSort.shouldHave(Condition.text("Sauce Labs Backpack"));;
    }

    public void checkZA() {
        checkChooseSort.shouldHave(Condition.text("Test.allTheThings() T-Shirt (Red)"));;
    }

    public void checkLowToHigh() {
        checkChooseSort.shouldHave(Condition.text("Sauce Labs Onesie"));;
    }

    public void checkHighToLow() {
        checkChooseSort.shouldHave(Condition.text("Sauce Labs Fleece Jacket"));;
    }

    public void addAndCheckOneProduct() {
        addFirstToCart.click();
        iconCart.shouldHave(text("1"));
    }
}
