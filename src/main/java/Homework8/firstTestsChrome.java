package Homework8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class firstTestsChrome {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver110.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.saucedemo.com/");

//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


   //    driver.quit();

    }
}
