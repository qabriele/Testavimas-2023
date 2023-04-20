package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projektas {
    public static void main(String[] args) {
        // Set the path to the Chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/gabriele.michne/Documents/chrm/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        System.out.println("Completed.");

        // Navigate to a webpage
        driver.get("https://www.pigu.lt");

        // Close the browser
        //WebElement cookieNotice = driver.findElement(By.xpath("//*[@id='cookie_block']/div/div/div[1]/div[2]/button[3]"));

        //cookieNotice.click();

        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
        searchInput.sendKeys("kuprine");
        searchInput.submit();
        driver.quit();
    }
}