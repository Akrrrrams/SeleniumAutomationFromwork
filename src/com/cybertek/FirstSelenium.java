package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

    public static void main(String[] args) {
            //we cannot open a browser without setting the path drivers
            // this line must come before creating the webdriver object

            //first argument is the type driver and location of the driver
            System.setProperty("webdriver.chrome.driver","C:\\Selenium dependencies\\drivers\\chromedriver.exe");
            //this line open a chrome browser.
            WebDriver driver = new ChromeDriver();
            //open a website
            driver.get("https://amazon.com");
            driver.navigate().to("https://amazon.com");
            driver.navigate().back();
            driver.navigate().forward();
            driver.navigate().refresh();
            driver.manage().window().fullscreen();

            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("headphone");
            driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

            System.out.println("Verify title countain key word");
        if(driver.getTitle().contains("headphone")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expacted: headphone");
        }
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.findElement(By.id("search_query_top")).sendKeys("skirt women");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();

        driver.quit();


    }

    }


