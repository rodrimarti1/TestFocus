package implementation;


import com.thoughtworks.gauge.Step;

import static object.GoogleObject.searchTextBox;

public class InputValueInSearchTextBox {

    @Step("When the <inputSearchValue> is input within 'Search' text box")
    public void whenTheInputSearchValueIsInputWithinSearchTextBox(String inputSearchValue) throws InterruptedException {
        searchTextBox().sendKeys(inputSearchValue);
    }
}
