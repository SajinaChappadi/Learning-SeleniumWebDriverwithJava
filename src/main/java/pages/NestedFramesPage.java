package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    String topFrame = "frame-top";
    String bottomFrame = "frame-bottom";
    String leftFrame = "frame-left";
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLeftFrameText(){

        switchToFrame(topFrame);
        switchToFrame(leftFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getBottomFrameText(){
        switchToFrame(bottomFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        return text;
    }


    private void switchToFrame(String frameName){

        driver.switchTo().frame(frameName);
    }
    private String getFrameText(){
        return driver.findElement(body).getText();
    }


}
