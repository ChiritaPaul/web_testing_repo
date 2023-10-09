package Selenium_Scenarios.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import scenarios.Base;

public class StackoverflowPage extends Base {

    public void goToStackoverflowPage() {
        driver.get("https://stackoverflow.com/");
    }

    public void clickOnButton(String buttonName) {
        switch (buttonName) {
            case "home":
                WebElement stackoverflowHomeButton = driver.findElement(By.xpath(XpathForElements("homeButton")));
                stackoverflowHomeButton.click();
                break;
            case "about":
                WebElement stackoverflowAboutButton = driver.findElement(By.xpath(XpathForElements("aboutButton")));
                stackoverflowAboutButton.click();
                break;
            case "products":
                WebElement stackoverflowProductsButton = driver.findElement(By.xpath(XpathForElements("productsButton")));
                stackoverflowProductsButton.click();
                break;
            case "forTeams":
                WebElement stackoverflowForTeamsButton = driver.findElement(By.xpath(XpathForElements("forTeamsButton")));
                stackoverflowForTeamsButton.click();
                break;
            case "searchBar":
                WebElement stackoverflowSearchBar = driver.findElement(By.xpath(XpathForElements("searchBar")));
                stackoverflowSearchBar.click();
                break;
            case "logInButton":
                WebElement stackoverflowLogInButton = driver.findElement(By.xpath(XpathForElements("logInButton")));
                stackoverflowLogInButton.click();
                break;
            case "signUpButton":
                WebElement stackoverflowSignUpButton = driver.findElement(By.xpath(XpathForElements("signUpButton")));
                stackoverflowSignUpButton.click();
                break;
            default:
                System.out.println("No button found!");
        }

    }

    public String XpathForElements(String buttonName) {
        return switch (buttonName) {
            case "homeButton" -> "//*[@class = 's-topbar--logo js-gps-track']";
            case "aboutButton" -> "//a[@class='s-navigation--item js-gps-track']";
            case "productsButton" -> "//a[@class= 's-navigation--item js-gps-track js-products-menu']";
            case "forTeamsButton" ->
                    "//a[@href= 'https://stackoverflow.co/teams/' and @class='s-navigation--item js-gps-track']";
            case "productMenu" -> "//a[@class= 's-navigation--item js-gps-track js-products-menu is-selected']";
            case "searchBar" -> "//input[@class = 's-input s-input__search js-search-field ']";
            case "logInButton" ->
                    "//*[@class = 's-topbar--item s-topbar--item__unset s-btn s-btn__filled ws-nowrap js-gps-track']";
            case "signUpButton" ->
                    "//*[@class = 's-topbar--item s-topbar--item__unset ml4 s-btn s-btn__primary ws-nowrap']";
            default -> {
                System.out.println("Not found!");
                yield null;
            }
        };
    }

    public void insertIntoSearchBar(String searchBarLocation, String insertIntoSearchBar) {

        WebElement stackOverflowSearchBarInsert = driver.findElement(By.xpath(XpathForElements(searchBarLocation)));
        stackOverflowSearchBarInsert.sendKeys(insertIntoSearchBar);
        stackOverflowSearchBarInsert.sendKeys(Keys.ENTER);
    }
}
