package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DriverFactory {

    private static WebDriver CreateRemoteDriver(String gridUrl, String testName)
    {
        Map<String, Object> selenoidProperties = new HashMap();
        selenoidProperties.put("enableVNC", true);
        selenoidProperties.put("enableVideo", true);
        selenoidProperties.put("videoName", testName);
        Optional<String> buildName = getBuildName();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("name", testName);
        chromeOptions.setCapability("selenoid:options", selenoidProperties);
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--allow-insecure-localhost");
        buildName.ifPresent(buildInstance -> chromeOptions.setCapability("build", buildInstance));
        RemoteWebDriver remoteWebDriver;
        try
        {
            remoteWebDriver = new RemoteWebDriver(new URL(gridUrl), chromeOptions);
            remoteWebDriver.setFileDetector(new LocalFileDetector());
            return remoteWebDriver;
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public static Optional<String> getBuildName()
    {
        Optional<String> pipeline_name = Optional.ofNullable(System.getenv("GO_PIPELINE_NAME"));
        Optional<String> pipeline_label = Optional.ofNullable(System.getenv("GO_PIPELINE_LABEL"));
        if (pipeline_name.isPresent() && pipeline_label.isPresent())
        {
            return Optional.of(pipeline_name.get() + "-" + pipeline_label.get());
        }
        return Optional.ofNullable("");

    }

    public static WebDriver getDriver(String testName)
    {
        String browser = System.getenv(SystemConstants.BROWSER);
        switch (browser)
        {
            case SystemConstants.EDGE:
                return new InternetExplorerDriver();
            case SystemConstants.FIREFOX:
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette",true);
                return new FirefoxDriver();
            case SystemConstants.CHROME:
            default:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setCapability("name", testName);
                chromeOptions.setAcceptInsecureCerts(true);
                chromeOptions.addArguments("--allow-insecure-localhost");
                return new ChromeDriver(chromeOptions);
        }
    }
}
