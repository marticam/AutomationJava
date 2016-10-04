import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by cmartinez on 10/3/2016.
 */
public class FireFoxDriverTest {
    public String FireFoxSession() {
        System.setProperty("webdriver.gecko.driver", "WebDrivers\\geckodriver.exe");
        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.close();
        System.out.print("FireFox execution - ");
        return "Pass";
    }
}


