package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class PirkiniuTestas {
//    public static void main(String[]args) {
//        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver", "/Users/gabriele.michne/Documents/chrm/chromedriver");
//        driver.manage().window().maximize();
////        PirkiniuKrepselis test1 = new PirkiniuKrepselis(driver);
////        test1.productPage();
//        Register test2 = new Register(driver);
//        test2.ieiti();
////        driver.quit();
//    }
//}

public class PirkiniuTestas {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "F:/Desktop/chromedriver/chromedriver.exe");
        driver.manage().window().maximize();

        Register register = new Register(driver);
        register.ieiti();

        Register.RegistrationMethods registrationMethods = register.new RegistrationMethods();
        registrationMethods.enterRegistrationPage();
        registrationMethods.prefillRegInfo("username@mail.com", "password123!");

    }
}