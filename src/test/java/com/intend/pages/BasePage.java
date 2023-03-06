package com.intend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    public final static String BASE_URL = "https://intend.ro/";

    public BasePage(WebDriver driver) {
        //this.driver = driver; // asta e generat automat de IntelliJ -> Code\Generate...\Constructor

        PageFactory.initElements(driver, this);
        //PageFactory e o clasa a Selenium WebDriver cu ajutorul careia se implementeaza Page Object Model
        //PageFactory construieste cate o pagina pentru fiecare pagina web pe care vreu s-o testez
        //se foloseste annotatia @FinfBy si cu metoda initElements() se intializeaza
        //elementele localizate cu @FindBy
    }
}
