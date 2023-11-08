import Pages.JSAlertPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class JSAlertTest extends BaseTest{
    @Test
    public void JSAlertButtonTest()
    {
        JSAlertPage jsAlertPage = homePage.clickOnJSAlertLink();
        jsAlertPage.clickOnJSAlertButton();
        jsAlertPage.clickOnOKButtonOfAlert();
        String pageResultString = jsAlertPage.getTextResult();
        assertEquals(pageResultString,"You successfully clicked an alert","incorrect pageString");
    }
    @Test
    public void JSConfirmButtonTest()
    {
        JSAlertPage jsAlertPage = homePage.clickOnJSAlertLink();
        jsAlertPage.clickOnJSConfirmButton();
        String alertString = jsAlertPage.getTextOfAlert();
        assertEquals(alertString,"I am a JS Confirm","incorrect alertString");
        jsAlertPage.clickOnCancelButtonOfAlert();
        String pageResultString = jsAlertPage.getTextResult();
        assertEquals(pageResultString,"You clicked: Cancel","incorrect pageString");
    }
    @Test
    public void JSPromptTest()
    {
        JSAlertPage jsAlertPage = homePage.clickOnJSAlertLink();
        jsAlertPage.clickOnJSPromptButton();
        jsAlertPage.enterTextToAlert(); //Enter Ahmed
        jsAlertPage.clickOnOKButtonOfAlert();
        String pageResultString = jsAlertPage.getTextResult();
        assertEquals(pageResultString,"You entered: Ahmed","incorrect pageString");
    }
}
