package sorting;

import login.LoginStandardUserTest;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

public class SortingByPriceHighToLowTest extends LoginStandardUserTest {

    InventoryPage sorting = new InventoryPage();

    @Test
    void sortingByNameAZ() {
        sorting.clickHighToLow();
        sorting.checkHighToLow();
    }
}
