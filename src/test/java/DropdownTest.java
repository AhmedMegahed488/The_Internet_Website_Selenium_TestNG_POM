
import Pages.DropdownPage;
import org.testng.annotations.Test;
import java.util.List;

import static org.testng.Assert.*;

public class DropdownTest extends BaseTest{
    @Test
    public void testSelectOption()
    {
        DropdownPage dropdownPage = homePage.clickOnDropdownLink();
        String Option = "Option 1";
        dropdownPage.selectOptionOfDropdown(Option);
        List<String> SelectedOptions = dropdownPage.getSelectedOptionsOfDropdown();
        assertEquals(SelectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(SelectedOptions.contains(Option), "Option not selected");
    }
}
