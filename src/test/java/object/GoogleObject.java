package object;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleObject {

    public static SelenideElement searchTextBox() {
        Condition visible = Condition.and("There was a problem trying to find the 'Search' text box.", Condition.visible);
        return $(By.cssSelector(".a4bIc > input[role='combobox']")).waitUntil(visible, 25000);
    }

    public static SelenideElement searchButton() {
        Condition visible = Condition.and("There was a problem trying to find the 'Search' button.", Condition.visible);
        return $(By.cssSelector(".UUbT9 input[name='btnK']")).waitUntil(visible, 25000);
    }

    public static ElementsCollection searchResultCollection() {
        return $$(By.cssSelector("#rso > div > div > div > div.yuRUbf > a > div > cite"));
    }

    public static  Boolean IsSearchResultDisplayed(ElementsCollection searchResultOptions, String optionValue){
        Boolean isSearDisplayed = false;
        searchResultOptions.get(0).waitUntil(Condition.visible, 25000);
        for (int i=0; i < searchResultOptions.size(); i++){
            if(searchResultOptions.get(i).text().equals(optionValue)){
                isSearDisplayed = true;
            }
        }
        return isSearDisplayed;
    }
}
