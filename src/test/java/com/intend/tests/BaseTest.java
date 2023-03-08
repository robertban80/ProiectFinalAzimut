package com.intend.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected static WebDriver driver;
    @BeforeSuite
    protected void setUp(){
        System.setProperty("webdrive.chrome.driver","src/main/resources/chromedriver.exe");
    }

    @AfterSuite
    protected void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
