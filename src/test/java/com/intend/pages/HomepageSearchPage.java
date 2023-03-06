package com.mediagalaxy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageSearchPage extends BasePage{ //prin extends mosteneste pe BasePage
    public final static String HOME_URL = BASE_URL + "home";

    @FindBy (id="search") private WebElement searchTextInput;


    public HomepageSearchPage(WebDriver driver) {
        super(driver);
    }

    public void enterSearchedText(String searchedText){
        searchTextInput.sendKeys(searchedText);
    }
}
