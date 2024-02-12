package sorting;

import com.codeborne.selenide.Condition;
import login.LoginStandardUserTest;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

import static com.codeborne.selenide.Selenide.$;

public class SortingByNameZATest extends LoginStandardUserTest {

    InventoryPage sorting = new InventoryPage();

    @Test
    void sortingByNameZA() {
        sorting.clickZA();
        sorting.checkZA();

        }
}
