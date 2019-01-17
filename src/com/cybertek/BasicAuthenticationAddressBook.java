package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationAddressBook {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement inputEmail = driver.findElement(By.id("session_email"));//it will  return element & find element from page
        inputEmail.sendKeys("kexesobepu@zsero.com"); //it will en
        // ter email automatically

        WebElement inputPassWord = driver.findElement(By.id("session_password"));
        inputPassWord.sendKeys("password");

        WebElement singninButton = driver.findElement(By.name("commit"));//locates the sing in button
        System.out.println(driver.getTitle());
        singninButton.click();//clicks on the the button.
        System.out.println(driver.getTitle());

        WebElement username = driver.findElement(By.className("navbar-text" ));//located username element
        String actualUsername = username.getText();
        System.out.println(actualUsername);

        if("kexesobepu@zsero.com".equals(actualUsername)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expected:kexesobepu@zsero.com");
            System.out.println("actualUserName"+ actualUsername);

            //verify title
            if ( !driver.getTitle().contains("Sign In") ) {
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
                System.out.println(driver.getTitle());


            }
        }

    }
}
