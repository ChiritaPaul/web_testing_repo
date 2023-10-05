package Selenium_Scenarios;

import Selenium_Scenarios.Pages.StackoverflowPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import scenarios.Base;

public class TestNavigation extends Base {

    StackoverflowPage stackoverflowPage = new StackoverflowPage();

    @Test
    public void testNavigationFunctionality() throws InterruptedException {

        //Go to stackoverflow page
        stackoverflowPage.goToStackoverflowPage();
        Assertions.assertEquals("Stack Overflow - Where Developers Learn, Share, & Build Careers", driver.getTitle(), "User is on correct site");

        driver.manage().window().setSize(new Dimension(500, 500));
        waitForElement(500);
        driver.navigate().back();
        waitForElement(500);
        driver.manage().window().fullscreen();
        waitForElement(500);
        driver.manage().window().maximize();
        waitForElement(500);
    }
}
