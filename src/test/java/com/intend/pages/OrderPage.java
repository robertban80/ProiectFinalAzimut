package com.intend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage{
    public OrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "products-cart-list") private WebElement emptyCart;
    @FindBy (css = "#products-cart-list > ul > li:nth-child(2) > div > section > table > tbody > tr > td.delete > a") private WebElement trashBin;


    public String emptyCartText(){
        return (emptyCart.getText());
    }

    public void emptyCartTrashBin(){
        trashBin.click();
    }

}
