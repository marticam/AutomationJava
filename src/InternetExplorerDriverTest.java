import org.openqa.selenium.By;
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
        //driver.get("https://www.facebook.com/");
        //driver.wait();
        //driver.findElement(By.id("email")).sendKeys("test12313");
        //driver.findElement(new By.ByLinkText("Forgot account?"));
        //driver.findElement(new By.ByLinkText("Forgot account?"));
        //driver.findElement(new By.ByPartialLinkText("Forgot"));
        driver.close();
        System.out.print("InternetExplorer execution - ");
        return "Pass";
    }
}
