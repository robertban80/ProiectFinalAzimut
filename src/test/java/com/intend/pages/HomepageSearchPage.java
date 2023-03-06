package com.intend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageSearchPage extends BasePage{ //prin extends mosteneste pe BasePage
    public final static String HOME_URL = BASE_URL;

    @FindBy (id="search") private WebElement searchTextInput;
    @FindBy (xpath = "//*[@id=\"search_mini_form\"]/div/div/button") private WebElement searchButton;
    @FindBy (xpath = "//*[@id=\"products\"]/div/div[2]/div[1]/div[1]/span") private WebElement foundProducts;
    @FindBy (css = "#products > div > div.right-section-products > div:nth-child(2) > div.products-found.fl") private WebElement searchResult;


    public HomepageSearchPage(WebDriver driver) {
        super(driver);
    }

    public void enterSearchedText(String searchedText){
        searchTextInput.sendKeys(searchedText);
    }

    public void clickSearch(){
        searchButton.click();
    }

    public void checkSearchResult(){
        System.out.println(searchResult.getText());
    }


}


