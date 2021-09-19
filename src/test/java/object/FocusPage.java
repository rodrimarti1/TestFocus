package object;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FocusPage {

    public static SelenideElement nowHiringButton() {
        Condition visible = Condition.and("There was a problem trying to find the 'Now hiring' button.", Condition.visible);
        return $(By.cssSelector(".avia-button.avia-color-custom.avia-icon_select-yes-right-icon.avia-position-left.avia-size-medium > .avia_iconbox_title")).waitUntil(visible, 25000);
    }

    public static SelenideElement locationTab() {
        Condition visible = Condition.and("There was a problem trying to find the 'Location' button.", Condition.visible);
        return $(By.cssSelector("#menu-item-4726 > a > span.avia-menu-text")).waitUntil(visible, 25000);
    }
}
