import com.sun.jna.Structure;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by cmartinez on 10/3/2016.
 */
public class ChromeDriverTest {
    public String ChromeSession() {
        System.setProperty("webdriver.chrome.driver", "WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*---------Test # 1 = Using CssSelectors (CssPath)---------------- -*/

        /*driver.get("http://qaclickacademy.com"); // Get to hit the URL
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();*/

        /*---------Test # 2 - Select Elements via LinkText oe Partial Link Text----------*/

        /*driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("test12313");
        driver.findElement(By.name("pass")).sendKeys("pass");
        driver.findElement(new By.ByLinkText("Forgot account?")).click();
        driver.findElement(new By.ByPartialLinkText("Forgot")).click();
        driver.findElement(By.cssSelector("#loginbutton")).click();*/

        /*---------Test # 3 - Complete a form with dynamic and static dropdowns, also with checkboxes-----------*/
        /*driver.get("http://spicejet.com/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(new By.ByLinkText("Goa (GOI)")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        driver.findElement(new By.ByLinkText("Bagdogra (IXB)")).click();
        driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).sendKeys("07-10-2016");
        driver.findElement(By.id("ctl00_mainContent_txt_Todate")).sendKeys("07-15-2016");
        // select method for static dropdowns create an object for the class and use the object.method
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        Select CurrencyDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        CurrencyDropdown.selectByVisibleText("US Dollar(USD)");
        driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());*/

        /*---------Test # 4 - Select radio buttons----------------------*/
        /*driver.get("http://echoecho.com/htmlforms10.htm");
        driver.findElement(By.cssSelector("input[value='Cheese']")).click();
        driver.findElement(By.cssSelector("input[value='Water']")).click();
        driver.findElement(By.cssSelector("input[value='Milk']")).click();
        driver.findElements(By.cssSelector("input[name='group1']")).size();
        System.out.println(driver.findElements(By.cssSelector("input[name='group1']")).size());
        driver.findElements(By.cssSelector("input[name='group1']")).get(0).click();
        int sizeopt = driver.findElements(By.cssSelector("input[name='group1']")).size();
        for (int i=0;i<sizeopt;i++){
            String options = driver.findElements(By.cssSelector("input[name='group1']")).get(i).getAttribute("value");
            System.out.println(options);
            if (options.equals("Cheese")){
                driver.findElements(By.cssSelector("input[name='group1']")).get(i).click();
            }
        }*/

        /*---------Test # 5 - Close / accept / JS alerts---------*/
        /*driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();
        driver.switchTo().alert().accept(); // OK YES DONE
        driver.switchTo().alert().dismiss(); // OK YES DONE*/

        /*---------Test # 6 Using the IsDisplyed | IsEnabled ----------------*/
        /*driver.get("https://www.makemytrip.com/flights");
        System.out.println("Is displayed");
        System.out.println(driver.findElement(By.id("return_date_sec")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("return_date_sec")).isDisplayed());
        driver.findElement(By.id("multi_city_button")).click();
        System.out.println("Is NOT displayed");
        Assert.assertFalse(driver.findElement(By.id("return_date_sec")).isDisplayed());
        driver.findElement(By.id("one_way_button1")).click();
        System.out.println("Is displayed");
        Assert.assertTrue(driver.findElement(By.id("return_date_sec")).isDisplayed());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        driver.get("http://www.makemytrip.com/");
        System.out.println(" Before clikcing on Multi city Radio button");
        System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
        //driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();
        //driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).isEnabled();
        System.out.println(" After clikcing on Multi city Radio button");
        driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[3]")).click();
        driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[3]/a")).click();
        int i = 0;
        while (i < 5) {
            driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();
            i++;
        }
        //System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
        //System.out.println(driver.findElement(By.xpath(".//*[@id='mui_city_button']/span")).isDisplayed());
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println(driver.findElement(By.xpath(".//*[@id='responsive_bottom']/div[2]/div[1]/div/div/h3")).getText());
        //If you want to validate the object which is present in web page or code base
        int count = driver.findElements(By.xpath(".//*[@id='mui_city_button']/span")).size();
        if (count == 0) {
            System.out.println("verified");
        }

//        TEST # 7 - Using actions of the webdriver
//        driver.get("https://www.amazon.com/");
//        Actions actionone = new Actions(driver);
       // WebElement element = driver.findElement(By.id("nav-link-yourAccount"));
       // actionone.moveToElement(element).build().perform();
//        WebElement element1 = driver.findElement((By.id("twotabsearchtextbox")));
        //actionone.keyDown(Keys.SHIFT).moveToElement(element1).click().sendKeys("tomela").build().perform();
//        actionone.keyDown(Keys.SHIFT).sendKeys(element1 , "sdsfsdf").build().perform();
        //element1.sendKeys("tomela");
        //element1.sendKeys("tavo");
       // actionone.contextClick(element1).build().perform();

//        Test # 8 handle multiple windows
        driver.get("https://www.google.com/gmail/about/");
        //driver.findElement(By.(".gmail-nav__nav-link.gmail-nav__nav-link__create-account"));
        //driver.findElement(new By.ByLinkText("Get Gmail")).click();
        //driver.findElement(new By.ByXPath("html/body/nav/div/a[3]")).click();
        driver.findElement(By.cssSelector(".gmail-nav__nav-link.gmail-nav__nav-link__create-account")).click();
        System.out.println("Before switching");
        System.out.println(driver.getTitle());
        Set<String>ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentid = it.next();
        String childid = it.next();
        System.out.println("After switching");
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
        System.out.println("Switching back to Parent");
        driver.switchTo().window(parentid);
        System.out.println(driver.getTitle());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();


        /*-----------Browser Where it was executed---------*/
        System.out.print("Chrome execution - ");
        return "Pass";
    }
}
