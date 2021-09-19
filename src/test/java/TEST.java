import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST {

    public static WebDriver driver;

    @Step("Navigate to <https://www.google.co.in>a")
    public void navigateTo(String url) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
    }
}
