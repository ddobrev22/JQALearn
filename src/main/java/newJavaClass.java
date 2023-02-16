import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newJavaClass {

    // Main class
    public static WebDriver driver;

        // Main driver method
        public static void main(String[] args){

            openChrome();


        }

        public static void openChrome(){
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver110.exe");
            ChromeDriver driver;
            driver = new ChromeDriver();
            driver.get("https://www.google.com");

//            WebDriver driver = new MyWebDriverBuilder().build();
//// Are we supposed to augment here or not?
//            driver = new Augmenter().augment(driver);
        }
    }
