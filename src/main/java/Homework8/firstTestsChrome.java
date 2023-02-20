package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class firstTestsChrome {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver110.exe");
        WebDriver driver=new ChromeDriver();


        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

     //   driver.findElement(By.cssSelector("#didomi-notice-agree-button")).click();


        driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(2) > input")).sendKeys("abc");

        driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(4) > input")).sendKeys("1234");


        // Click on the search button
        driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(5) > input")).click();

     //  driver.quit();

    }
}
