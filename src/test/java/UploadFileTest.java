import Pages.FileUploadPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class UploadFileTest extends BaseTest{
    @Test
    public void ChooseFileTest()
    {
        FileUploadPage fileUploadPage = homePage.clickOnFileUploadLink();
        String path = "D:\\p.PNG";
        fileUploadPage.UploadFile(path);
        String NameOfFile = fileUploadPage.getNameOfFileAfterUpload();
        assertEquals(NameOfFile,"p.PNG","File Uploaded is incorrect");
    }
}
