package sorting;

import login.LoginStandardUserTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

public class SortingByPriceHighToLowTest extends LoginStandardUserTest {

    InventoryPage sorting = new InventoryPage();

    @DisplayName("Сортировка по убыванию цены")
    @Test
    void sortingByPriceHighToLow() {
        sorting.clickHighToLow();
        sorting.checkHighToLow();
    }
}
