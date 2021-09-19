package implementation.focus;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;
import org.assertj.core.api.Assertions;

import static object.FocusPage.asiaTitle;

public class LocationTextHeader {

    @Step("Then validate the <inputLocationText> title location is displayed")
    public void thenValidateTheInputLocationTextTitleLocationIsDisplayed(String inputLocationText) throws InterruptedException {
        Assertions.assertThat(asiaTitle().waitUntil(Condition.visible, 2555).text())
                .withFailMessage("The "+ inputLocationText +" title don't display")
                .containsIgnoringCase(inputLocationText);
    }
}
