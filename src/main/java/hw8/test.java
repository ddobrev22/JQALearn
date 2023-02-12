package hw8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello world ");
        System.setProperty("webdriver.chrome.driver","C:\\Programs\\chromedriver022023\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
 //       driver.quit();
    }
}
