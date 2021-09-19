package implementation;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;

import static object.GoogleObject.searchResultCollection;

public class OpenSpecificSearchResult {

    @Step("When <inputPageToOpen> is clicked")
    public void whenInputPageToOpenIsClicked(String inputPageToOpen) throws InterruptedException {
        searchResultCollection().findBy(Condition.text(inputPageToOpen)).waitUntil(Condition.visible, 25000).click();
    }
}
