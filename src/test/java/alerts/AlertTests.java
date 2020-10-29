package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(),"You successfuly clicked an alert", "Result text is incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();
        String text = "Hi Sajina";
        alertPage.alert_setInput(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(),"You entered: "+text, "Result text is incorrect");
    }
}
