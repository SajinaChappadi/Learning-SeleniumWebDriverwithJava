package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String editorIFrameId = "mce_0_ifr";
    private By increaseIndentButton = By.cssSelector("#mceu_12 button");

    private By textArea = By.id("tinymce");

    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToTheMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToTheMainArea();
    }

    public void increaseIndentation(){
        driver.findElement(increaseIndentButton).click();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToTheMainArea();
        return text;
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIFrameId);
    }

    private void switchToTheMainArea(){
        driver.switchTo().parentFrame();
    }
}

