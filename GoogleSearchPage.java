package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    private WebDriver driver;


    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;
        driver.get("https://www.google.com/");
    }

    public void acceptedCookie(){
        WebElement cookieNotice = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]"));
        cookieNotice.click();
    }
}
