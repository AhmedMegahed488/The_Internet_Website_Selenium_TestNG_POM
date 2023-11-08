package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private final By usernameFieldLocator = By.id("username");
    private final By passwordFieldLocator = By.id("password");
    private final By loginButtonFieldLocator= By.cssSelector("#login button");
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void setUsername(String username)
    {
        driver.findElement(usernameFieldLocator).sendKeys(username);
    }
    public void setPassword(String password)
    {
        driver.findElement(passwordFieldLocator).sendKeys(password);
    }
    public SecureAreaPage clickOnLoginButton()
    {
        driver.findElement(loginButtonFieldLocator).click();
        return new SecureAreaPage(driver);
    }
}
