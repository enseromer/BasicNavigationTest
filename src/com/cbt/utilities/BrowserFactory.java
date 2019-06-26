package com.cbt.utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

    public class BrowserFactory {


        private static WebDriver driver;

        private BrowserFactory(){}


        public static WebDriver getDriver(String browser){



            if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "/Users/dokur/Desktop/selenium/driver/chromedriver");

                driver = new ChromeDriver();

            } else if (browser.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", "/Users/dokur/Desktop/selenium/driver/geckodriver");

                driver = new FirefoxDriver();

            } else if(browser.equals("edge")){
                return null;
            }else if(browser.equals("safari")){
                driver = new SafariDriver();
            }



            return driver;
        }



    }