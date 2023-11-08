import Pages.DynamicLoadingPage;
import Pages.ExampleOnePage;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class ExampleOnePageTests extends BaseTest{
    @Test
    public void Test1()
    {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        ExampleOnePage exampleOnePage = dynamicLoadingPage.clickOnExampleOneLink();
        exampleOnePage.clickOnStartButtonFirst();
        String result = exampleOnePage.getTextResult();
        assertEquals(result,"Hello World!","text is incorrect");
    }
    @Test
    public void Test2()
    {
        DynamicLoadingPage dynamicLoadingPage =
                homePage.clickOnDynamicLoadingLink();
        ExampleOnePage exampleOnePage
                =dynamicLoadingPage.clickOnExampleOneLink();
        exampleOnePage.clickOnStartButtonSecond();
        String result = exampleOnePage.getTextResult();
        assertEquals(result,"Hello World!","text is incorrect");
    }
}
