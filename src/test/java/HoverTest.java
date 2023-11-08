import Pages.HoverPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTest extends BaseTest{
    @Test
    public void hoverFigureTest()
    {
        HoverPage caption=homePage.clickHoverLink();
        caption.moveToHoverBlock(1);
        assertTrue(caption.isBoxImageDisplayed(),"Caption not displayed");
        assertEquals(caption.getHeaderText(),"name: user1","Caption header incorrect");
        assertEquals(caption.getLinkText(),"View profile","Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");
    }

}
