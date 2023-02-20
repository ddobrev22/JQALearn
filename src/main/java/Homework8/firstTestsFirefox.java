package Homework8;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class firstTestsFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");

        // Initialize Gecko Driver using Desired Capabilities Class
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette",true);
        WebDriver driver= new FirefoxDriver(capabilities);



        // Launch Website
       driver.navigate().to("http://www.javatpoint.com/");
    }
}
