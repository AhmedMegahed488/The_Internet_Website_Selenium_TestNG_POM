package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleOnePage {
    private WebDriver driver;
    private final By startButton =By.cssSelector("#start button");
    private final By loadImage = By.id("loading");
    private final By textResult = By.id("finish");
    ExampleOnePage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void clickOnStartButtonFirst()
    {
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadImage)));
    }
    public void clickOnStartButtonSecond()
    {
        driver.findElement(startButton).click();
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadImage)));
    }
    public String getTextResult()
    {
        return driver.findElement(textResult).getText();
    }
}
