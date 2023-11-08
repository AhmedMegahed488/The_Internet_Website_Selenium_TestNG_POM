import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest{
    @Test
    public void testSuccessfullLogin()
    {
        LoginPage loginpage = homePage.clickOnFormAuthentication();
        loginpage.setUsername("tomsmith");
        loginpage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage =loginpage.clickOnLoginButton();
        assertTrue(secureAreaPage.getWelcomeMassage().contains("You logged into a secure area!"),
        "Alert Text is Incorrect");
    }
}