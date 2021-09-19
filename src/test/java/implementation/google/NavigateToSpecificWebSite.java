package implementation.google;

import com.thoughtworks.gauge.Step;
import driver.Driver;


public class NavigateToSpecificWebSite {

    @Step("Go to website with URL <inputWebSiteAddress>")
    public void goToWebSiteWithUrlInputWebSiteAddress(String inputWebSiteAddress) throws InterruptedException {
        Driver.webDriver.get(inputWebSiteAddress);
    }
}
