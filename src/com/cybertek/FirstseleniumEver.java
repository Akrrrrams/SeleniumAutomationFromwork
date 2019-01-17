package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstseleniumEver {
    public static void main(String[] args) {
        //step 1 open chrome.
        System.setProperty("webdriver.chrome.driver","C:\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //step2 go to url Link.
        driver.get("https://google.com");
        //step 3 verify title Expat result "google.com".
        String actualTitle = driver.getTitle();//if you change this is gona be fail
        System.out.println("actualTitle "+actualTitle);

        String expectedTitle = "Google";
        //Verifying
        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected " + expectedTitle);
            System.out.println("Actual: "+actualTitle);
        }


    }

}
