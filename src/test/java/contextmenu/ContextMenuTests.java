package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void verifyAlertMessage(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.contextClick();
        var message = contextMenuPage.getPopUpMessage();
        contextMenuPage.alert_clickToAccept();
        assertEquals(message,"You selected a context menu", "Incorrect pop up message");
    }
}
