package Pages;
import org.openqa.selenium.*;
public class LargeDeepDOMPage {
    private WebDriver driver;
    private final By tableLocator= By.id("large-table");
    LargeDeepDOMPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void scrollTOTable()
    {
        WebElement tableElement=driver.findElement(tableLocator);
        String script="arguments[0].scrollIntoView();";

        ((JavascriptExecutor)driver).executeScript(script,tableElement);
    }
}
