package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class mantoringFirstTime {
    public static void main(String[] args) {
        //we cannot open a browser without setting the path drivers
        // this line must come before creating the webdriver object
        //frist argument is the type driver and location of the driver
        System.setProperty("webdriver.chrome.driver","C:\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//this line will open a browser
        driver.get("https://amazon.com");//this line will open amazon home page
        driver.navigate().to("https://google.com");// from amazon go to thr google
        driver.navigate().back();//this line will go to the previous page which is amazon
        driver.navigate().forward();//go to the next line
        driver.navigate().refresh();//refresh the page
        driver.manage().window().fullscreen(); //it will make it fullscreen.
        driver.navigate().to("https://www2.hm.com/en_us/index.html");//go to the HM page
        //we will search keyword skirt By finding the  ID element
        driver.findElement(By.id("main-search")).sendKeys("skirt");
        //we fine search baton by ClassName and click it .
        driver.findElement(By.className("magnify")).click();
        //we find that List of the item because it's a list item <li> if you try <ul> it will not work so we have to sued <li> this work.
        List<WebElement> items = driver.findElements(By.className("product-item"));
        // find elements it will return a list of web element,so we create list to store the result
        String result = ""; // we have to set the empty value for check the condition.
        for(int i =0;i< items.size();i++){  //we use for loop to check how meany skirt we have.
            System.out.println(items.get(i).findElement(By.className("item-heading")).getText());
            //it will print out each item name in the list of web elements.
            if(items.get(i).findElement(By.className("item-heading")).getText().toLowerCase().contains("skirt")){
                //we testing if the item name contain our searching key word , if it pass it will show the result .
                result = "Pass";
            }else{
                result = "Fail";
            }
        }
        System.out.println(result);


    }
}
