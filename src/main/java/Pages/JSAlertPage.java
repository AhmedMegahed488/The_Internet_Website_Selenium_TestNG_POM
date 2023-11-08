package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class JSAlertPage {
    private WebDriver driver;
    private final By JSAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private final By JSConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private final By JSPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private final By textResult = By.id("result");

    JSAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    //-------------------------------------
    public void clickOnJSAlertButton() {
        driver.findElement(JSAlertButton).click();
    }

    public void clickOnOKButtonOfAlert() {
        driver.switchTo().alert().accept();
    }

    //-------------------------------------
    public void clickOnJSConfirmButton() {
        driver.findElement(JSConfirmButton).click();
    }

    public String getTextOfAlert() {
        return driver.switchTo().alert().getText();
    }

    public void clickOnCancelButtonOfAlert() {
        driver.switchTo().alert().dismiss();
    }

    //-------------------------------------
    public void clickOnJSPromptButton() {
        driver.findElement(JSPromptButton).click();
    }

    public void enterTextToAlert() {
        driver.switchTo().alert().sendKeys("Ahmed");
    }

    //-------------------------------------
    public String getTextResult() {
        return driver.findElement(textResult).getText();
    }
}
