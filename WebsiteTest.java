package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

//public class WebsiteTest {

//    public static void main(String[]args){
//        System.setProperty("webdriver.chrome.driver", "/Users/gabriele.michne/Documents/chrm/chromedriver");
//        WebsiteTest test1 = new WebsiteTest();
//        test1.googleSearch();
//
//    }
//
//    public void googleSearch(){
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//        WebElement cookieNotice = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]"));
//        cookieNotice.click();
//
//        String[] searchTerms = {"Dachshund", "Vilnius", "Keliones"};
//        WebElement searchBox;
//        searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
//
////        for(int i = 1; i<searchTerms.length; i++) {
////        }
//
//         for (String term : searchTerms) {
////            term = searchTerms[i];
//             searchBox.sendKeys(term);
//             searchBox.submit();
//             String expectedValue = term + " - „Google“ paieška";
//             String actualValue = driver.getTitle();
//             assertEquals(expectedValue, actualValue);
//             driver.navigate().back();
//    }
//         driver.quit();
//}
//}
