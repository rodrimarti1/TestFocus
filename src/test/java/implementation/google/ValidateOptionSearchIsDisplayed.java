package implementation;

import com.thoughtworks.gauge.Step;
import org.assertj.core.api.Assertions;

import static object.GoogleObject.IsSearchResultDisplayed;
import static object.GoogleObject.searchResultCollection;

public class ValidateOptionSearchIsDisplayed {

    @Step("Then validate the <inputValue> is displayed in search result page")
    public void whenTheSearchButtonIsClicked(String inputValue) throws InterruptedException {
        Assertions.assertThat(IsSearchResultDisplayed(searchResultCollection (),inputValue))
                .withFailMessage("The Value don't display")
                .isTrue();
    }
}
