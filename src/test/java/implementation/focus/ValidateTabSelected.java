package implementation.focus;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;
import org.assertj.core.api.Assertions;

import static object.FocusPage.*;

public class ValidateTabSelected {

    @Step("Then validate the <inputTabTitle> tab is selected")
    public void thenValidateTheInputTabTitleTabIsSelected(String inputTabTitle) throws InterruptedException {
        Assertions.assertThat(locationsTabsSelected().get(indexLocationsTab(locationsTabsTitle(), inputTabTitle)).waitUntil(Condition.visible, 25000).scrollTo().getAttribute("class"))
                .withFailMessage("The "+ inputTabTitle +" tab don't select")
                .containsIgnoringCase("av-active-tab-title");
    }
}
