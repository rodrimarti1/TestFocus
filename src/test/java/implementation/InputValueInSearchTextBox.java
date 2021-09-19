package implementation;


import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.Keys;

import static object.GoogleObject.searchTextBox;

public class InputValueInSearchTextBox {

    @Step("When the <inputSearchValue> is input within 'Search' text box")
    public void whenTheInputSearchValueIsInputWithinSearchTextBox(String inputSearchValue) throws InterruptedException {
        searchTextBox().sendKeys(inputSearchValue);
        searchTextBox().waitUntil(Condition.value(inputSearchValue), 25000).sendKeys(Keys.ESCAPE);

    }
}
