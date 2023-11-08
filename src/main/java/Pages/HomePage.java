package Pages;

import Pages.DropdownPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private final By formAuthenticationLinkLocator = By.linkText("Form Authentication");
    private final By dropownLinkLocator=new By.ByLinkText("Dropdown");
    private final By hoverLink = By.linkText("Hovers");
    private final By keyPressesPageLink = By.linkText("Key Presses");
    private final By javaScriptAlertLink=By.linkText("JavaScript Alerts");
    private final By FileUploadLink=By.linkText("File Upload");
    private final By WYSIWYGEditorLink = By.linkText("WYSIWYG Editor");
    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");
    private final By LargeDeepDomLink = By.linkText("Large & Deep DOM");
    //-----------------------------------------------------------------------------------
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    //-----------------------------------------------------------------------------------
    public LoginPage clickOnFormAuthentication()
    {
        driver.findElement(formAuthenticationLinkLocator).click();
        return new LoginPage(driver);
    }
    //-----------------------------------------------------------------------------------
    public DropdownPage clickOnDropdownLink()
    {
        driver.findElement(dropownLinkLocator).click();
        return new DropdownPage(driver);
    }
    //-----------------------------------------------------------------------------------
    public HoverPage clickHoverLink()
    {
        driver.findElement(hoverLink).click();
        return new HoverPage(driver);
    }
    //-----------------------------------------------------------------------------------
    public KeyPressesPage clickOnKeyPressesLink()
    {
        driver.findElement(keyPressesPageLink).click();
        return new KeyPressesPage(driver);
    }
    //-----------------------------------------------------------------------------------
    public JSAlertPage clickOnJSAlertLink()
    {
        driver.findElement(javaScriptAlertLink).click();
        return new JSAlertPage(driver);
    }

    //-----------------------------------------------------------------------------------
    public FileUploadPage clickOnFileUploadLink()
    {
        driver.findElement(FileUploadLink).click();
        return new FileUploadPage(driver);
    }
    //-----------------------------------------------------------------------------------
    public WYSIWYGFrameEditorPage clickOnWYSIWYGEditorLink()
    {
        driver.findElement(WYSIWYGEditorLink).click();
        return new WYSIWYGFrameEditorPage(driver);
    }
    //-----------------------------------------------------------------------------------
    public DynamicLoadingPage clickOnDynamicLoadingLink()
    {
        driver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadingPage(driver);
    }
    //-----------------------------------------------------------------------------------
    public LargeDeepDOMPage clickOnLargeDeepDOMPage(){
        driver.findElement(LargeDeepDomLink).click();
        return new LargeDeepDOMPage(driver);
    }

    //-----------------------------------------------------------------------------------
}
