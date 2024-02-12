package sorting;

import com.codeborne.selenide.Condition;
import login.LoginStandardUserTest;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

public class SortingByNameAZTest extends LoginStandardUserTest {

    InventoryPage sorting = new InventoryPage();

    @Test
    void sortingByNameAZ() {
        sorting.clickAZ();
        sorting.checkAZ();
    }
}
