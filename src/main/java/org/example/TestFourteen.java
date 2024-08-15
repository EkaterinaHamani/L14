package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class TestFourteen {
    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void beforeActs() {
        driver.manage().window().maximize();
        driver.get("http://mts.by");
        driver.findElement(By.cssSelector("#cookie-agree")).click();
    }

    @Test
    public void verifyButton() {
        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[1]/div[1]/input")).sendKeys("297777777");
        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[1]/div[2]/input")).sendKeys("50");
        driver.findElement(By.cssSelector("#pay-connection > button")).click();
    }
    @Test
    public void verifyTitle() {
        WebElement blockTitle = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/h2"));
        String expectedTitle = "Онлайн пополнение\n" +
                "без комиссии";
        Assertions.assertEquals(blockTitle.getText(), expectedTitle);
    }
    @Test
    public void verifyLogos() {
        List<WebElement> logos = driver.findElements(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[2]"));
        Assertions.assertTrue(!logos.isEmpty());}

    @Test
    public void verifyLink() {
        WebElement infoLink = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/a"));
        infoLink.click();
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualURL = driver.getCurrentUrl();
        Assertions.assertEquals(actualURL, expectedUrl);
    }

    @AfterAll
    public static void terminateBrowser(){
        driver.close();
    }
}