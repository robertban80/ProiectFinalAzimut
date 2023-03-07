package com.intend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage{
    @FindBy (css = "#products > div > div.right-section-products > div:nth-child(2) > div.products-found.fl") private WebElement searchResult;
    public SearchResultsPage(WebDriver driver) {super(driver);}

    public boolean checkSearchResult(){
        return (searchResult.getText().contains("Produse"));
    }

    public String returnCurrentUrl(){
        String currentUrl;
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        return currentUrl;
    }


}
