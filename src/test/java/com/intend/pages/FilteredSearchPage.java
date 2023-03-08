package com.intend.pages;

import org.openqa.selenium.WebDriver;
import com.intend.pages.SearchResultsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilteredSearchPage extends BasePage {
    public FilteredSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"list-filters\"]/li[3]/ul/li[1]/label")
    private WebElement toateProduseleCheckBox;
    @FindBy(xpath = "//*[@id=\"list-filters\"]/li[3]/ul/li[2]/label")
    private WebElement stocMagazinCheckBox;
    @FindBy(xpath = "//*[@id=\"list-filters\"]/li[3]/ul/li[3]/label")
    private WebElement stocFurnizorCheckBox;
    @FindBy(xpath = "//*[@id=\"list-filters\"]/li[3]/ul/li[4]/label")
    private WebElement promotiiCheckBox;
    //@FindBy (tagName = "brand-2") private WebElement categorieProcesoare;
    @FindBy(xpath = "//*[@id=\"list-filters\"]/li[4]/ul/li[9]/label/a") private WebElement categorieProcesoare;
    //*[@id="list-filters"]/li[4]/ul/li[6]/label // for amd ryzen
    //*[@id="list-filters"]/li[4]/ul/li[9]/label // for intel core

    @FindBy(css = "#products > div > div.right-section-products > div.products-list.grid-view-products > div:nth-child(1) > div > div.price-section > a.inner-details-btn.add-to-cart")
    private WebElement addToCartButton;
    @FindBy(xpath = "//*[@id=\"products\"]/div/div[2]/div[2]/div[3]/div/div[5]/a[1]")
    private WebElement addToCartButton2;


    public void checkStocMagazinCheckBox() {
        if (!stocMagazinCheckBox.isSelected()) {
            stocMagazinCheckBox.click();
        }
    }

    public void checkStocFurnizorCheckBox() {
        if (!stocFurnizorCheckBox.isSelected()) {
            stocFurnizorCheckBox.click();
        }
    }

    public void checkPromotiiCheckBox() {
        if (!promotiiCheckBox.isSelected()) {
            promotiiCheckBox.click();
        }
    }

    public void checkToateProduseleCheckBox() {
        if (!toateProduseleCheckBox.isSelected()) {
            toateProduseleCheckBox.click();
        }
    }

    public void pickCategorieProcesoare() {
        //System.out.println(categorieProcesoare);
        categorieProcesoare.click();
    }

    public void addToCart() {
        addToCartButton.click();
    }
    public void addToCart2() {
        addToCartButton2.click();
    }

    public String returnCurrentUrl() {
        String currentUrl;
        currentUrl = driver.getCurrentUrl();
        //System.out.println(currentUrl);
        return currentUrl;
    }


}
