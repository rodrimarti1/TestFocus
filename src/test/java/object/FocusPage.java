package object;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FocusPage {

    public static SelenideElement nowHiringButton() {
        Condition visible = Condition.and("There was a problem trying to find the 'Now hiring' button.", Condition.visible);
        return $(By.cssSelector(".avia-button.avia-color-custom.avia-icon_select-yes-right-icon.avia-position-left.avia-size-medium > .avia_iconbox_title")).waitUntil(visible, 25000);
    }

    public static SelenideElement locationTab() {
        Condition visible = Condition.and("There was a problem trying to find the 'Location' button.", Condition.visible);
        return $(By.cssSelector("#menu-item-4726 > a > span.avia-menu-text")).waitUntil(visible, 25000);
    }

    public static ElementsCollection locationsTabsSelected(){
        return $$(By.cssSelector("#av-tab-section-1 > div > div.av-tab-section-tab-title-container.avia-tab-title-padding-small > a.av-section-tab-title.av-tab-no-icon.av-tab-with-image.noHover"));
    }

    public static ElementsCollection locationsTabsTitle(){
        return $$(By.cssSelector("#av-tab-section-1 > div > div.av-tab-section-tab-title-container.avia-tab-title-padding-small > a.av-section-tab-title.av-tab-no-icon.av-tab-with-image.noHover span.av-inner-tab-title"));
    }

    public static SelenideElement locationsTitle(){
        Condition visible = Condition.and("There was a problem trying to find the 'Location' header.", Condition.visible);
        return $(By.cssSelector("[itemprop='headline']")).waitUntil(visible, 25000);
    }

    public static int indexLocationsTab(ElementsCollection locationsText, String specificLocationText){
        int tabSelected = 0;
        locationsText.get(0).waitUntil(Condition.visible, 25000);
        for (int i=0; i < locationsText.size(); i++){
            if(locationsText.get(i).text().equals(specificLocationText)){
                tabSelected = i;
            }
        }
        return tabSelected;
    }

    public static SelenideElement centralAmericaTitle(){
        Condition visible = Condition.and("There was a problem trying to find the 'Central america' header.", Condition.visible);
        return $(By.cssSelector(".av-animation-delay-container.av-layout-tab.avia-builder-el-84.el_after_av_tab_sub_section.el_before_av_tab_sub_section  .container > .av_textblock_section  h2")).waitUntil(visible, 25000);
    }

    public static SelenideElement asiaTitle(){
        Condition visible = Condition.and("There was a problem trying to find the 'asia' header.", Condition.visible);
        return $(By.cssSelector(".av-zero-column-padding.av_one_half.avia-builder-el-103.el_after_av_hr.el_before_av_one_half.first.flex_column.flex_column_div > .av_textblock_section b")).waitUntil(visible, 25000);
    }
}
