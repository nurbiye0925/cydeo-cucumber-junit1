package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
        // creating a private constructure
        private Driver() {
        }

        //we make webdriver private  because we want to close access outside of class

        private static WebDriver driver;

        // create a re-usable utility method wich will return same driver instance when we call it
        public static WebDriver getDriver() {
            if (driver == null) {

                String browserType = ConfigurationReader.getProperty("browser");
                switch (browserType) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;


                }
            }

            return driver;
        }

        public static void closeDriver() {
        }
    }

