package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Notifications {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/gabriele.michne/Documents/chrm/chromedriver");
        //ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        //disable notification parameter
        options.addArguments("--disable-notifications");
        // configure options parameter to Chrome driver
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.rde.lt/");
        driver.quit();
    }
}
