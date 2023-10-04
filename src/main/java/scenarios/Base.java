package scenarios;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

    public static WebDriver driver;

    @BeforeAll
    public static void baseBeforeClass() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("ignore-certificate-errors", "--window-size=1920,1080", "--disable-extensions", "--incognito");
        driver = new ChromeDriver(chromeOptions);
    }

    @AfterEach
    public void baseAfter() {
        driver.close();
    }

    @AfterAll
    public static void baseAfterClass() {
        driver.quit();
    }

    public void waitForElement(int durationInMilliseconds) throws InterruptedException {
        Thread.sleep(durationInMilliseconds);
    }
}
