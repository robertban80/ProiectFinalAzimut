package com.intend.pages;

import org.openqa.selenium.WebDriver;
import com.intend.pages.SearchResultsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilteredSearchPage extends BasePage{
    public FilteredSearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//*[@id=\"list-filters\"]/li[3]/ul/li[1]/label") private WebElement toateProduseleCheckBox;
    @FindBy (xpath = "//*[@id=\"list-filters\"]/li[3]/ul/li[2]/label") private WebElement stocMagazinCheckBox;
    @FindBy (xpath = "//*[@id=\"list-filters\"]/li[3]/ul/li[3]/label") private WebElement stocFurnizorCheckBox;
    @FindBy (xpath = "//*[@id=\"list-filters\"]/li[3]/ul/li[4]/label") private WebElement promotiiCheckBox;
    @FindBy (xpath = "//*[@id=\"products\"]/div/div[2]/div[2]/div[1]/div/div[5]/a[1]") private WebElement addToCartButton;

    public void checkStocMagazinCheckBox() {
        if(!stocMagazinCheckBox.isSelected()){
            stocMagazinCheckBox.click();
        }
    }
    public void checkStocFurnizorCheckBox(){
        if (!stocFurnizorCheckBox.isSelected()) {
            stocFurnizorCheckBox.click();
        }
    }
    public void checkPromotiiCheckBox(){
        if (!promotiiCheckBox.isSelected()){
            promotiiCheckBox.click();
        }
    }
    public void checkToateProduseleCheckBox(){
        if (!toateProduseleCheckBox.isSelected()){
            toateProduseleCheckBox.click();
        }
    }


}
