package sorting;

import login.LoginStandardUserTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

public class SortingByNameAZTest extends LoginStandardUserTest {

    InventoryPage sorting = new InventoryPage();

    @DisplayName("Сортировка по алфавиту")
    @Test
    void sortingByNameAZ() {
        sorting.clickAZ();
        sorting.checkAZ();
    }
}
