package implementation.focus;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;
import org.assertj.core.api.Assertions;

import static object.FocusPage.nowHiringButton;

public class ValidateNowHiringIsDisplayed {

    @Step("Then validate the 'Now hiring' button is displayed")
    public void thenValidateTheNowHiringButtonIsDisplayed() throws InterruptedException {
        Assertions.assertThat(nowHiringButton().waitUntil(Condition.visible, 25000).scrollTo().isDisplayed())
                .withFailMessage("The now hiring button don't display")
                .isTrue();
    }
}
