import com.sun.jna.Structure;
import com.sun.jna.platform.win32.WinDef;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.junit.Assert;
import org.openqa.selenium.*;
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

        /*---------Test # 6 Using the IsDisplayed | IsEnabled ----------------*/
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

        /*---------Example of the Trainer Related to the Using the IsDisplayed | IsEnabled ----------------------*/
        /*driver.get("http://www.makemytrip.com/");
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
        }*/

        /*---------TEST # 7 - Using actions of the webdriver--------------------*/
        /*driver.get("https://www.amazon.com/");
        Actions actionone = new Actions(driver);
        WebElement element = driver.findElement(By.id("nav-link-yourAccount"));
        actionone.moveToElement(element).build().perform();
        WebElement element1 = driver.findElement((By.id("twotabsearchtextbox")));
        actionone.keyDown(Keys.SHIFT).moveToElement(element1).click().sendKeys("tomela").build().perform();
        actionone.keyDown(Keys.SHIFT).sendKeys(element1, "sdsfsdf").build().perform();
        element1.sendKeys("tomela");
        element1.sendKeys("tavo");
        actionone.contextClick(element1).build().perform();*/

        /*---------Test # 8 handle multiple windows-----------------------------*/
        /*driver.get("https://www.google.com/gmail/about/");
        //driver.findElement(By.(".gmail-nav__nav-link.gmail-nav__nav-link__create-account"));
        //driver.findElement(new By.ByLinkText("Get Gmail")).click();
        //driver.findElement(new By.ByXPath("html/body/nav/div/a[3]")).click();
        driver.findElement(By.cssSelector(".gmail-nav__nav-link.gmail-nav__nav-link__create-account")).click();
        System.out.println("Before switching");
        System.out.println(driver.getTitle());
        Set<String> ids = driver.getWindowHandles();
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
        driver.close();*/

        /*---------Test # 9 handle Frames -----------------------------*/
        /*driver.get("https://netbanking.hdfcbank.com/netbanking/");
        //System.out.println(driver.getPageSource());
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("input[class='input_password']")).sendKeys("10000");*/

        /*---------Test # 10 Extract ALL the links in the web page || Footer || Header || ALL Links || Dynamic links ------------------*/
        /*driver.get("http://www.ebay.com/");
        System.out.println("Whole Quantity of items in the page");
        System.out.println(driver.findElements(By.tagName("a")).size());
        System.out.println("Quantity of items in the footer");
        WebElement footer = driver.findElement(By.id("glbfooter"));
        System.out.println(footer.findElements(By.tagName("a")).size());
        System.out.println("Quantity of items of a section of the footer");
        WebElement subsectionoffooter = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[1]"));
        System.out.println(subsectionoffooter.findElements(By.tagName("a")).size());
        //int piece1 = driver.findElements(By.id("gf-BIG")).size();
        //System.out.println(piece1);
        System.out.println("Quantity of items and names for the 2dn column");
        WebElement columntwo = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
        System.out.println("Con Variables");
        int count = columntwo.findElements(By.tagName("a")).size();
        System.out.println(count);
        System.out.println("Sin Variables");
        System.out.println(columntwo.findElements(By.tagName("a")).size());
        String TitleBeforeClicking = driver.getTitle();
        System.out.println(driver.getTitle());
        for (int i=1;i<count;i++ ){
            //Print all the options in the column
            //System.out.println(columntwo.findElements(By.tagName("a")).get(i).getText());
            if (columntwo.findElements(By.tagName("a")).get(i).getText().contains("Mapa del sitio")){
                columntwo.findElements(By.tagName("a")).get(i).click();
            }
            //columntwo.findElement(By.linkText("Mapa del sitio")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(driver.getTitle());
        String TitleAfterClicking = driver.getTitle();

        if (TitleBeforeClicking != TitleAfterClicking){
            //System.out.println(TitleBeforeClicking);
            //System.out.println(TitleAfterClicking);
            //System.out.println(driver.findElement(new By.ByCssSelector(".nav>h1")).isDisplayed());
            //System.out.println(driver.findElement(new By.ByCssSelector(".nav>h1")).getText());
            Boolean abc = driver.findElement(new By.ByCssSelector(".nav>h1")).isDisplayed();
            if (abc == true)
                System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }*/

        /*---------Test # 10 - Implicit vs Explicit waits ----------------*/
        /*Explanation: http://stackoverflow.com/questions/22656615/what-is-difference-between-implicit-wait-vs-explicit-wait-in-selenium-webdriver*/
        driver.get("https://www.udemy.com/");
        driver.findElement(new By.ByLinkText("Login")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("#id_email")).sendKeys("10000");
        //System.out.println(driver.getPageSource());
        //driver.findElement(By.id("id_email")).sendKeys("juan");

        /*-----------Browser Where it was executed---------*/
        System.out.print("Chrome execution - ");
        return "Pass";
    }

    
}
