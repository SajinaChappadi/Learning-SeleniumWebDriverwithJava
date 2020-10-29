package sliders;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testHorizontalSlider(){
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(value);
        var sliderValue = sliderPage.getSliderValue();
        assertEquals(sliderValue, value , "Slider value is incorrect");
    }
}
