import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Created by cmartinez on 10/3/2016.
 */
public class EdgeDriverTest {
    public String EdgeSession() {
        System.setProperty("webdriver.edge.driver", "WebDrivers\\MicrosoftWebDriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.close();
        System.out.print("InternetExplorer execution - ");
        return "Pass";
    }
}
