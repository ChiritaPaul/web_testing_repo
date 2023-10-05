package scenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {
    public static void highlightElement(WebDriver driver, WebElement... elements) throws InterruptedException {
        for (WebElement element : elements) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='2px solid red'", element);
        }
        Thread.sleep(500);
    }

    public static void unhighlightElement(WebDriver driver, WebElement... elements) throws InterruptedException {
        for (WebElement element : elements) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='0px'", element);
        }
        Thread.sleep(500);
    }
}
