import com.sun.javafx.geom.Edge;

/**
 * Created by cmartinez on 10/3/2016.
 */
public class Browserinvocation {

    public static void main(String[] args) {
        ChromeDriverTest test = new ChromeDriverTest();
        System.out.println(test.ChromeSession());

//        FireFoxDriverTest test1 = new FireFoxDriverTest();
//        System.out.println(test1.FireFoxSession());

//        InternetExplorerDriverTest test2 = new InternetExplorerDriverTest();
//        System.out.println(test2.InternetExplorerSession());

//        EdgeDriverTest test3 = new EdgeDriverTest();
//        System.out.println(test3.EdgeSession());
    }
}
