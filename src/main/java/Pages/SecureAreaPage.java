package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private final By welcomeMassageLocator=By.id("flash");
    public SecureAreaPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public String getWelcomeMassage()
    {
        return driver.findElement(welcomeMassageLocator).getText();
    }
}