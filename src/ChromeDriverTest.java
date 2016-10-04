import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by cmartinez on 10/3/2016.
 */
public class ChromeDriverTest {
    public String ChromeSession() {
        System.setProperty("webdriver.chrome.driver", "WebDrivers\\chromedriver.exe");

        //C:\Users\cmartinez\IdeaProjects\Basic\WebDrivers\chromedriver.exe
        WebDriver driver1 = new org.openqa.selenium.chrome.ChromeDriver();
        driver1.close();
        System.out.print("Chrome execution - ");
        return "Pass";
    }
}
