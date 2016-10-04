import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by cmartinez on 10/3/2016.
 */
public class InternetExplorerDriverTest {
    public String InternetExplorerSession() {
        System.setProperty("webdriver.ie.driver", "WebDrivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.close();
        System.out.print("InternetExplorer execution - ");
        return "Pass";
    }
}
