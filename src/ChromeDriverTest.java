import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by cmartinez on 10/3/2016.
 */
public class ChromeDriverTest {
    public String ChromeSession() {
        System.setProperty("webdriver.chrome.driver", "WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        Test # 1
//        driver.get("http://qaclickacademy.com"); // Get to hit the URL
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getPageSource());
//        System.out.println(driver.getCurrentUrl());
//        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
//        driver.close();
//        System.out.print("Chrome execution - ");


//        Test # 2
//        driver.get("https://www.facebook.com/");
//        driver.findElement(By.id("email")).sendKeys("test12313");
//        driver.findElement(By.name("pass")).sendKeys("pass");
//        driver.findElement(new By.ByLinkText("Forgot account?")).click();
//        driver.findElement(new By.ByPartialLinkText("Forgot")).click();
//        driver.findElement(By.cssSelector("#loginbutton")).click();

        driver.get("http://spicejet.com/");
//        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//        driver.findElement(new By.ByLinkText("Goa (GOI)")).click();
//        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//        driver.findElement(new By.ByLinkText("Bagdogra (IXB)")).click();
//        driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).sendKeys("07-10-2016");
//        driver.findElement(By.id("ctl00_mainContent_txt_Todate")).sendKeys("07-15-2016");
//        // select method for static dropdowns create an object for the class and use the object.method
//        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        Select CurrencyDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        CurrencyDropdown.selectByVisibleText("US Dollar(USD)");
        //driver.findElement(By.(""));
        System.out.print("Chrome execution - ");
        return "Pass";
    }
}
