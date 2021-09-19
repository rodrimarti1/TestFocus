package implementation.focus;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;

import static object.FocusPage.*;

public class OpenSpecificLocation {

    @Step("When the <inputLocationValue> is clicked")
    public void whenTheInputLocationValueIsClicked(String inputLocationValue) throws InterruptedException {
        locationsTitle().scrollTo();
        locationsTabsTitle().findBy(Condition.text(inputLocationValue)).waitUntil(Condition.visible, 25000).click();
    }
}
