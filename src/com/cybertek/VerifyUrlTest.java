package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlTest {
//    How to test if google opens correcly 2
//            1. Open chrome browser
//    2. go to url “https://google.com”
//            3. Verify url
//    Expected ur: “https://www.google.com/”
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Selenium dependencies\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.get("https://google.com");

    String expectedUrl ="https://www.google.com/";

    String actualUrl = driver.getCurrentUrl();
    if(expectedUrl.equals(actualUrl)){
        System.out.println("Pass");
    }else{
        System.out.println("FALL");
        System.out.println("actualUrl = " +actualUrl);
        System.out.println("ecpectedUrl = " + expectedUrl);
    }
    System.out.println(driver.getPageSource());

}

}
