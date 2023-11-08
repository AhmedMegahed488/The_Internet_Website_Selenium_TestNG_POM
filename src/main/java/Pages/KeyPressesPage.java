package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class KeyPressesPage {
    private WebDriver driver;
    private By textFieldOfKeyPresses = By.id("target");
    private By resultTextUnderTextField = By.id("result");
    KeyPressesPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void enterText(String text)
    {
        driver.findElement(textFieldOfKeyPresses).sendKeys(text);
    }
    public String getResultText()
    {
        return driver.findElement(resultTextUnderTextField).getText();
    }

}
