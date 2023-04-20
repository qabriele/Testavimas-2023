package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PirkiniuKrepselis {
    private WebDriver driver;
    private final By addToCart = By.xpath("//*[@id=\"new-product-panel\"]/div[2]/ul/li[1]/a");
//    private WebDriver driver;


    public PirkiniuKrepselis(WebDriver driver) {
        this.driver = driver;
        driver.get("https://www.rde.lt/");

    }

    public void productPage(){
        WebElement productPageButton = driver.findElement(By.xpath("//*[@id=\"new-product-panel\"]/div[2]/ul/li[1]/a"));
        productPageButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart));
        addProduct.click();
    }

    public void cookies(){
        WebElement cookiesNotice = driver.findElement(By.xpath("//*[@id=\"cookie-consent-block\"]/div[2]/button"));
        cookiesNotice.click();
    }
}
