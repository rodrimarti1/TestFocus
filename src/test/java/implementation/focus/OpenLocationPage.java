package implementation.focus;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;

import static object.FocusPage.locationTab;

public class OpenLocationPage {

    @Step("When the 'Location' tab is clicked")
    public void whenTheLocationTabIsClicked() throws InterruptedException {
        locationTab().waitUntil(Condition.visible, 25000).click();
    }
}
