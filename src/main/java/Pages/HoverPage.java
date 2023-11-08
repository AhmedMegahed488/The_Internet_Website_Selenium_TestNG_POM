package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;
    private final By hoverBlock = By.className("figure");
    private final By boxImage = By.className("figcaption");
    private final By header =By.tagName("h5");
    private final By linkImage =By.tagName("a");
    HoverPage(WebDriver driver){
        this.driver=driver;
    }
    public void moveToHoverBlock(int index){
        WebElement image = driver.findElements(hoverBlock).get(index-1);
        Actions action = new Actions(driver);
        action.moveToElement(image).perform();
    }
    public WebElement getBoxImage()
    {
        return driver.findElement(boxImage);
    }
    public boolean isBoxImageDisplayed(){
        return getBoxImage().isDisplayed();
    }
    public String getHeaderText()
    {
        WebElement headerElement = getBoxImage().findElement(header);
        return headerElement.getText();
    }
    public String getLink()
    {
        WebElement linkImageElement =
                getBoxImage().findElement(linkImage);
        return linkImageElement.getAttribute("href");
    }
    public String getLinkText()
    {
        WebElement linkImageElement = getBoxImage().findElement(linkImage);
        return linkImageElement.getText();
    }

}
