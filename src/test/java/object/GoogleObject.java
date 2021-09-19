package object;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleObject {

    public static SelenideElement searchTextBox()
    {
        Condition visible = Condition.and("There was a problem trying to find the 'Search' text box.", Condition.visible);
        return $(By.cssSelector(".a4bIc > input[role='combobox']")).waitUntil(visible, 25000);
    }

}
