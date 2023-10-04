package Selenium_Scenarios.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import scenarios.Base;

public class StackoverflowPage extends Base {

    public void goToStackoverflowPage() {
        driver.get("https://stackoverflow.com/");
    }

    public void clickOnAboutButton() {
        WebElement stackoverflowHomeButton = driver.findElement(By.xpath("//a[@class='s-navigation--item js-gps-track']"));
        stackoverflowHomeButton.click();
    }
}
