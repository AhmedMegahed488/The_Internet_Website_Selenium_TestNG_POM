package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private final By dropdownFieldLocator = By.id("dropdown");
    DropdownPage(WebDriver driver)
    {
        this.driver=driver;
    }
    private Select findDropdownField()
    {
        return new Select(driver.findElement(dropdownFieldLocator));
    }
    public void selectOptionOfDropdown(String OptionText)
    {
        findDropdownField().selectByVisibleText(OptionText);
    }
    public List<String> getSelectedOptionsOfDropdown()
    {
        List<WebElement> selectedElements = findDropdownField().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
}
