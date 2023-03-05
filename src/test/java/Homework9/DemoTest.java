package Homework9;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoTest {
    WebDriver driver;

    @BeforeTest
    public void SetDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver110.exe");
        this.driver =new ChromeDriver();

    }
    @Test
    public void test1() {
        this.driver.get("https://www.saucedemo.com/");
        this.driver.findElement(By.cssSelector("#user-name")).sendKeys("abc");
        this.driver.findElement(By.cssSelector("#password")).sendKeys("1234");
        this.driver.findElement(By.cssSelector("#login-button")).click();
        boolean present;
        try {
            this.driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3 > button"));
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
        System.out.println(present);
        Assert.assertFalse(present);


    }
    @AfterTest
    public void quit(){
        driver.close();
        driver.quit();
    }
}