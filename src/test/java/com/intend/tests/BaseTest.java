package com.intend.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected static WebDriver driver;
    @BeforeSuite
    protected void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //System.setProperty("webdriver.edge.driver","src/main/resources/msedgedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
    }

    @AfterSuite
    protected void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
