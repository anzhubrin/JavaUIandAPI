package sorting;

import login.LoginStandardUserTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

public class SortingByNameZATest extends LoginStandardUserTest {

    InventoryPage sorting = new InventoryPage();

    @DisplayName("Обратная сортировка по алфавиту")
    @Test
    void sortingByNameZA() {
        sorting.clickZA();
        sorting.checkZA();

        }
}
