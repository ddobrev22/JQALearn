package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class firstTestsChrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver110.exe");
        ChromeDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.abv.bg");


   //     String next = scan.nextLine();
   //     System.out.println("timeout");

        WebDriverWait w = new WebDriverWait(driver, 5);
        w.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//iframe[@id='abv-GDPR-frame']")));

        System.out.println("timeout");
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.wait(1000);
        driver.findElement(By.xpath("//iframe[@id='abv-GDPR-frame']")).click();

    }
}
