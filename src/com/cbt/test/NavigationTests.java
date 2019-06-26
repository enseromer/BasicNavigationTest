package com.cbt.test;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class NavigationTests {


    public static void main(String[] args) throws InterruptedException {



        System.out.println("Testing chrome browser");
        testChrome();
        Thread.sleep(3000);


        System.out.println("Testing safari browser");
        testSafari();
        Thread.sleep(3000);


        System.out.println("Testing Firefox browser");
        testFirefox();

    }


    public static void testChrome(){

        testMain("chrome");

    }

    public static void testFirefox(){
        testMain("firefox");

    }

    public static void testSafari(){

        testMain("safari");

    }

    public static void testMain(String s){

        WebDriver driver = BrowserFactory.getDriver(s);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://google.com");
        String t1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String t2 = driver.getTitle();

        driver.navigate().back();

        StringUtility.verifyEquals(t1, driver.getTitle());


        driver.navigate().forward();
        StringUtility.verifyEquals(t2, driver.getTitle());

        driver.close();

    }



}