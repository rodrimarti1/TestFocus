package implementation.focus;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;
import org.assertj.core.api.Assertions;

import static object.FocusPage.*;

public class TitleLocationTab {

    @Step("Then validate the <inputTitleValue> title is displayed")
    public void thenValidateTheInputTitleValueTitleIsDisplayed(String inputTitleValue) throws InterruptedException {
        Assertions.assertThat(centralAmericaTitle().waitUntil(Condition.visible, 2555).text())
                .withFailMessage("The "+ inputTitleValue +" title don't display")
                .containsIgnoringCase(inputTitleValue);
    }
}
