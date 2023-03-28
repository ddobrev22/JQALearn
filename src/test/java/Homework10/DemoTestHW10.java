package Homework10;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DemoTestHW10 {
    public static WebDriver driver;

    @BeforeClass
    public static void SetDriver(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver110.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void test1() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("#user-name")).sendKeys("abc");
        driver.findElement(By.cssSelector("#password")).sendKeys("1234");
        driver.findElement(By.cssSelector("#login-button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        boolean present;
        try {
            driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3 > button"));
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
        System.out.println(present);
        Assert.assertTrue("Error message is present", present);


    }
    @AfterClass
    public static void quit(){
        driver.close();
    }
}
