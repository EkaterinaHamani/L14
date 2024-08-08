package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //4
        driver.get("http://mts.by");
        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[1]/div[1]/input")).sendKeys("297777777");
        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[1]/div[2]/input")).sendKeys("50");
        driver.findElement(By.cssSelector("#pay-connection > button")).click();

        driver.get("http://mts.by");

        //1
        WebElement blockTitle = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/h2"));
        String expectedTitle = "Онлайн пополнение\n" +
                "без комиссии";
        Assert.assertEquals(blockTitle.getText(), expectedTitle, "ок");

        //2
        List<WebElement> logos = driver.findElements(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[2]"));
        Assert.assertTrue(!logos.isEmpty(), "Логтипы платежных систем присутствуют");

        //3
        WebElement infoLink = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/a"));
        infoLink.click();
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedUrl, "ок");
        driver.quit();


    }
}








