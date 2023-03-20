package Homework8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class firstTestsChrome {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver110.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        driver.close();

    }

    }

