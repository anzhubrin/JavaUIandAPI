package sorting;

import login.LoginStandardUserTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

public class SortingByPriceLowToHighTest extends LoginStandardUserTest {

    InventoryPage sorting = new InventoryPage();

    @DisplayName("Сортировка по возврастанию цены")
    @Test
    void ByPriceLowToHigh() {
        sorting.clickLowToHigh();
        sorting.checkLowToHigh();
    }
}
