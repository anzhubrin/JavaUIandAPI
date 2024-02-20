package sorting;

import com.codeborne.selenide.Condition;
import login.LoginStandardUserTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

import static com.codeborne.selenide.Selenide.$;

public class SortingByNameZATest extends LoginStandardUserTest {

    InventoryPage sorting = new InventoryPage();

    @DisplayName("Обратная сортировка по алфавиту")
    @Test
    void sortingByNameZA() {
        sorting.clickZA();
        sorting.checkZA();

        }
}
