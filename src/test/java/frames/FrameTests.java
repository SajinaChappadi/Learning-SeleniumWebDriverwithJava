package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwygEditor(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.increaseIndentation();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(),text1+text2, "Incorrect text in the editor area");
    }

    @Test
    public void verifyTheFramesText(){
        var framePage = homePage.clickFrames();
        var nestedFramesPage = framePage.clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT", "Incorrect left frame text ");
        assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM", "Incorrect bottom frame text ");
    }


}
