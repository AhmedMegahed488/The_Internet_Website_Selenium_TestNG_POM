import Pages.WYSIWYGFrameEditorPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class WYSIWYGFrameEditorTest extends BaseTest{
    @Test
    public void FrameTests()
    {
        WYSIWYGFrameEditorPage wysiwygFrameEditor = homePage.clickOnWYSIWYGEditorLink();
        wysiwygFrameEditor.clearTextArea();
        String s1="Hello";
        String s2="World";
        wysiwygFrameEditor.setStringInTextArea(s1);
        wysiwygFrameEditor.clickOnIncreaseIndent();
        wysiwygFrameEditor.setStringInTextArea(s2);
        String result = wysiwygFrameEditor.getStringInTextArea();
        assertEquals(result,"HelloWorld","incorrect result");
    }
}
