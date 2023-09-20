package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
        }
    }



    public static void switchWindowAndVerify( String expectedInUrl, String expectedTitle ){
        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for(String each :allWindowsHandles){
            Driver.getDriver().switchTo().window(each);
            System.out.println("current URL:"+Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains("expectedInUrl")){
                break;
            }

        }
        //5. Assert: Title contains “Etsy”
        //Lines to be pasted:

        String actualTitle =Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
    /* this method accepts a string "expectedTitle"and asserts if it is true
}*/
    public  static void verifyTitle(WebDriver driver,String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }
}
