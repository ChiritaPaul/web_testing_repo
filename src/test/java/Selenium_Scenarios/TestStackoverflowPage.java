package Selenium_Scenarios;

import Selenium_Scenarios.Pages.StackoverflowPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import scenarios.Base;
import scenarios.Utils;

public class TestStackoverflowPage extends Base {
    StackoverflowPage stackoverflowPage = new StackoverflowPage();

    @Test
    public void testTopBarFunctionality() throws InterruptedException {
        stackoverflowPage.goToStackoverflowPage();
        Assertions.assertEquals("Stack Overflow - Where Developers Learn, Share, & Build Careers", driver.getTitle(), "User is on correct site.");

        stackoverflowPage.clickOnButton("about");
        Assertions.assertTrue(driver.getTitle().contains("Empowering"), "User is on About section");

        driver.navigate().back();

        waitForElement(500);
        Assertions.assertEquals("Stack Overflow - Where Developers Learn, Share, & Build Careers", driver.getTitle(), "User is on correct site.");

        stackoverflowPage.clickOnButton("products");
        Assertions.assertTrue(driver.findElement(By.xpath(stackoverflowPage.XpathForElements("productMenu"))).isDisplayed(), "Products menu found!");

        stackoverflowPage.clickOnButton("forTeams");
        Assertions.assertTrue(driver.getTitle().contains("Trusted Knowledge"), "User is on teams page.");

        driver.navigate().back();

        //check if top search bar, log in and sign up buttons are visible
        Utils.highlightElement(driver, driver.findElement(By.xpath(stackoverflowPage.XpathForElements("searchBar"))));
        Assertions.assertTrue(driver.findElement(By.xpath(stackoverflowPage.XpathForElements("searchBar"))).isDisplayed(), "Search bar found!");
        Utils.unhighlightElement(driver, driver.findElement(By.xpath(stackoverflowPage.XpathForElements("searchBar"))));

        Utils.highlightElement(driver, driver.findElement(By.xpath(stackoverflowPage.XpathForElements("logInButton"))));
        Assertions.assertTrue(driver.findElement(By.xpath(stackoverflowPage.XpathForElements("logInButton"))).isDisplayed(), "Login button found!");
        Utils.unhighlightElement(driver, driver.findElement(By.xpath(stackoverflowPage.XpathForElements("logInButton"))));

        Utils.highlightElement(driver, driver.findElement(By.xpath(stackoverflowPage.XpathForElements("signUpButton"))));
        Assertions.assertTrue(driver.findElement(By.xpath(stackoverflowPage.XpathForElements("signUpButton"))).isDisplayed(), "Signup button found!");
        Utils.unhighlightElement(driver, driver.findElement(By.xpath(stackoverflowPage.XpathForElements("signUpButton"))));
    }
}
