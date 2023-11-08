import Pages.LargeDeepDOMPage;
import org.testng.annotations.Test;
public class ScrollTest extends BaseTest{
    @Test
    public void scrollToTableTest()
    {
        LargeDeepDOMPage largeDeepDOMPage = homePage.clickOnLargeDeepDOMPage();
        largeDeepDOMPage.scrollTOTable();
    }
}
