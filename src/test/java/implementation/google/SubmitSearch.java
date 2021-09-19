package implementation;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;

import static object.GoogleObject.searchButton;

public class SubmitSearch {

    @Step("When the 'Search' button is clicked")
    public void whenTheSearchButtonIsClicked() throws InterruptedException {
        searchButton().waitUntil(Condition.visible, 25000).click();
    }
}
