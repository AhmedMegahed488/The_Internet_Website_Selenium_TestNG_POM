package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class FileUploadPage {
    private WebDriver driver;
    private final By chooseFile=By.id("file-upload");
    private final By uploadButton = By.id("file-submit");
    private final By NameOfFileAfterUpload = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver)
    {
        this.driver=driver;
    }
    private void clickOnUploadButton()
    {
        driver.findElement(uploadButton).click();
    }
    public void UploadFile(String absolutePathOfFile){

        driver.findElement(chooseFile).sendKeys(absolutePathOfFile);
        clickOnUploadButton();
    }
    public String getNameOfFileAfterUpload()
    {
        return driver.findElement(NameOfFileAfterUpload).getText();
    }
}
