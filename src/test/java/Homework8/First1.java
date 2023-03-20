package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class First1 {
    public static void main(String[] args) {

        WebDriver driver;
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver110.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

// Launch website
        driver.navigate().to("http://www.google.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.MILLISECONDS);
        System.out.println("3 seconds");

        WebElement cookiesNo = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[1]/div\n"));
        cookiesNo.click();

        // Click on the search text box and send value
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("javatpoint tutorials", Keys.ENTER);

        driver.close();
    }
}
