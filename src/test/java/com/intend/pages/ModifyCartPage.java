package com.intend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModifyCartPage extends BasePage{
    public ModifyCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#products-cart-list > ul:nth-child(1) > li:nth-child(2) > div:nth-child(1) > section:nth-child(3) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(4) > a:nth-child(1)")
    private WebElement trashBin;

    @FindBy(css = "#yt_header > div.yt-header-content > div > div > div.header-content-right.col-lg-9.col-md-9.col-lg-offset-3.col-md-offset-3.cart-right-section > div.header-cart > div > div.block.mini-cartpro.sm-cartpro > div > span")
    private WebElement productsInCart;

    public void clickOnCartTrashBin() {
        trashBin.click();
    }

    public String returnCartStatus(){
        return productsInCart.getText();
    }

}
