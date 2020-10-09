package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.*;


public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testVerifyMessage(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("testemail@test.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(emailSentPage.retrieveMessage().contains("Your e-mail's been sent!"),"Alert text is incorrect");
    }
}
