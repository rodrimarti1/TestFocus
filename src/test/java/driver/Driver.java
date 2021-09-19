package driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import com.thoughtworks.gauge.ExecutionContext;
import org.openqa.selenium.WebDriver;


import com.codeborne.selenide.WebDriverRunner;


public class Driver {

    // Holds the WebDriver instance
    public static WebDriver webDriver;

    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver
    @BeforeSuite
    public void initializeDriver(ExecutionContext context){
        webDriver = DriverFactory.getDriver(context.getCurrentSpecification().getName());
        WebDriverRunner.setWebDriver(webDriver);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    // Close the webDriver instance
    @AfterSuite
    public void closeDriver(){
        webDriver.quit();
    }

}
