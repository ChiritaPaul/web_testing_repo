package Selenium_Scenarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDrivers {
    @Test
    public void testChromeDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./src/test/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stackoverflow.com/");
        Assertions.assertEquals("Stack Overflow - Where Developers Learn, Share, & Build Careers", driver.getTitle(), "User is on correct site");
        Thread.sleep(2000);
    }
}
