package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DynamicLoadingPage {
    private WebDriver driver;
    private final By link_Example1 = By.xpath(String.format(".//a[contains(text(), '%s')]", "Example 1"));
    DynamicLoadingPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public ExampleOnePage clickOnExampleOneLink()
    {
        driver.findElement(link_Example1).click();
        return new ExampleOnePage(driver);
    }
}

