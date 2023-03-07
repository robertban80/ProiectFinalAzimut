package com.intend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageSearchPage extends BasePage{ //prin extends mosteneste pe BasePage
    public final static String HOME_URL = BASE_URL;

    @FindBy (id="search") private WebElement searchTextInput;
    @FindBy (xpath = "//*[@id=\"search_mini_form\"]/div/div/button") private WebElement searchButton;

    public HomepageSearchPage(WebDriver driver) {
        super(driver);
    }

    public void enterSearchedText(String searchedText){
        searchTextInput.sendKeys(searchedText);
    }

    public void clickSearch(){
        searchButton.click();
    }

}


