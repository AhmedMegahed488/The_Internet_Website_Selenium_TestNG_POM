package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WYSIWYGFrameEditorPage {
    private WebDriver driver;
    private String idFrameTag = "mce_0_ifr";
    private final By textArea = By.id("tinymce");
    private final By increaseIndentButton =By.cssSelector("button[title='Increase indent']");
    WYSIWYGFrameEditorPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void SwitchToFrameArea()
    {
        driver.switchTo().frame(idFrameTag);
    }
    public void SwitchToParentArea()
    {
        driver.switchTo().parentFrame();
    }
    public void clearTextArea()
    {
        SwitchToFrameArea();
        driver.findElement(textArea).clear();
        SwitchToParentArea();
    }
    public void setStringInTextArea(String s)
    {
        SwitchToFrameArea();
        driver.findElement(textArea).sendKeys(s);
        SwitchToParentArea();
    }
    public String getStringInTextArea()
    {
        SwitchToFrameArea();
        String text = driver.findElement(textArea).getText();
        SwitchToParentArea();
        return text;
    }
    //Note : this button is inside the parent HTML
    public void clickOnIncreaseIndent()
    {
        driver.findElement(increaseIndentButton).click();
    }
}
