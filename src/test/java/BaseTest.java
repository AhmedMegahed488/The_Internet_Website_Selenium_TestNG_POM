import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeMethod
    public void setDriver(){
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage=new HomePage(driver);
    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
