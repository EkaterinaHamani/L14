package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get(" http://mts.by");
    }

    @Test
    public void testTitle() {
        WebDriver driver = new ChromeDriver();
        WebElement blockTitle = driver.findElement(By.className("pay"));
        String expectedTitle = "Онлайн пополнение без комиссии";
        Assert.assertEquals(blockTitle.getText(), expectedTitle);
    }

    @Test
    public void testLogos() {
        WebDriver driver = new ChromeDriver();
        List<WebElement> logos = driver.findElements(By.className("pay_partners"));
        Assert.assertTrue(logos.isEmpty(), "Логтипы платежных систем присутствуют");
    }

    @Test
    public void testLink() {
        WebDriver driver = new ChromeDriver();
        WebElement infoLink = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a"));
        infoLink.click();
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedUrl, "Подробнее о сервисе");
    }

    @Test
    public void testButton() {
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).sendKeys("297777777");
        driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).click();
    }

}

