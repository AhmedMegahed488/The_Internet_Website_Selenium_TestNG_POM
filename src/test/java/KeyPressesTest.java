import Pages.KeyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class KeyPressesTest extends BaseTest{
    @Test
    public void executeFirstTestOfKeyPresses()
    {
        KeyPressesPage keyPressesPage = homePage.clickOnKeyPressesLink();
        keyPressesPage.enterText("Ahmed"+Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResultText(),"You entered: BACK_SPACE","incorrect in the result");
    }
    @Test
    public void executeSecondTestOfKeyPresses()
    {
        KeyPressesPage keyPressesPage = homePage.clickOnKeyPressesLink();
        keyPressesPage.enterText(Keys.chord(Keys.SHIFT,"ahmed"));
        assertEquals(keyPressesPage.getResultText(),"You entered: D","incorrect in the result");
    }
}

