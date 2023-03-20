package Homework8;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestWithJUnit {
    public static WebDriver driver;
    public static String baseUrl;
    public static WebElement element;

    @BeforeClass

    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver110.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "http://www.google.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitled() {
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);

        element = driver.findElement((By.id("lst-ib")));
        element.sendKeys("Selenium WebDriver Interview questions");
        element.sendKeys(Keys.RETURN);
        List<WebElement> list = driver.findElements(By.className("_Rm"));
        System.out.println(list.size());
    }


    @AfterClass
    public static void tearDown() {
     //   driver.quit();
    }

}
