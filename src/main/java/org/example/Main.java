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

        driver.get("http://mts.by");
        driver.findElement(By.cssSelector("#cookie-agree")).click();

        //Задание 1
        //Услуги связи
        //Поле номер телефона
        WebElement onePlaceholder = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[1]/div[1]/input"));
        String firstFirst = "Номер телефона";
        Assert.assertEquals(onePlaceholder.getAttribute("placeholder"), firstFirst);
        System.out.println(onePlaceholder.getAttribute("placeholder"));

        //Поле сумма

        WebElement twoPlaceholder = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[1]/div[2]/input"));
        String firstSecond = "Сумма";
        Assert.assertEquals(twoPlaceholder.getAttribute("placeholder"), firstSecond);
        System.out.println(twoPlaceholder.getAttribute("placeholder"));

        //Поле e-mail

        WebElement threePlaceholder = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[1]/div[3]/input"));
        String firstThird = "E-mail для отправки чека";
        Assert.assertEquals(threePlaceholder.getAttribute("placeholder"), firstThird);
        System.out.println(threePlaceholder.getAttribute("placeholder"));

        //Домашний интернет
        //Поле номер абонента

        driver.findElement(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__form > div.select > div.select__wrapper > button > span.select__arrow > svg")).click();
        driver.findElement(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__form > div.select > div.select__wrapper.opened > ul > li:nth-child(2) > p")).click();

        WebElement fourPlaceholder = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[2]/div[1]/input"));
        String firstFourth = "Номер абонента";
        Assert.assertEquals(fourPlaceholder.getAttribute("placeholder"), firstFourth);
        System.out.println(fourPlaceholder.getAttribute("placeholder"));

        //Поле сумма

        WebElement fivePlaceholder = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[2]/div[2]/input"));
        String firstFifth = "Сумма";
        Assert.assertEquals(fivePlaceholder.getAttribute("placeholder"), firstFifth);
        System.out.println(fivePlaceholder.getAttribute("placeholder"));

        //Поле e-mail

        WebElement sixPlaceholder = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[2]/div[3]/input"));
        String firstSith = "E-mail для отправки чека";
        Assert.assertEquals(sixPlaceholder.getAttribute("placeholder"), firstSith);
        System.out.println(sixPlaceholder.getAttribute("placeholder"));

        //Рассрочка
        //Поле Номер счета

        driver.findElement(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__form > div.select > div.select__wrapper > button > span.select__arrow > svg")).click();
        driver.findElement(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__form > div.select > div.select__wrapper.opened > ul > li:nth-child(3) > p")).click();

        WebElement sevenPlaceholder = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[3]/div[1]/input"));
        String firstSeventh = "Номер счета на 44";
        Assert.assertEquals(sevenPlaceholder.getAttribute("placeholder"), firstSeventh);
        System.out.println(sevenPlaceholder.getAttribute("placeholder"));

        //Поле Сумма

        WebElement eightPlaceholder = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[3]/div[2]/input"));
        String firstEight = "Сумма";
        Assert.assertEquals(eightPlaceholder.getAttribute("placeholder"), firstEight);
        System.out.println(eightPlaceholder.getAttribute("placeholder"));

        //Поле e-mail

        WebElement ninePlaceholder = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[3]/div[3]/input"));
        String firstNine = "E-mail для отправки чека";
        Assert.assertEquals(ninePlaceholder.getAttribute("placeholder"), firstNine);
        System.out.println(ninePlaceholder.getAttribute("placeholder"));

        //Задолженность
        //Поле Номер счета

        driver.findElement(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__form > div.select > div.select__wrapper > button > span.select__arrow > svg")).click();
        driver.findElement(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__form > div.select > div.select__wrapper.opened > ul > li:nth-child(4) > p")).click();

        WebElement tenPlaceholder = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[4]/div[1]/input"));
        String firstTenth = "Номер счета на 2073";
        Assert.assertEquals(tenPlaceholder.getAttribute("placeholder"), firstTenth);
        System.out.println(tenPlaceholder.getAttribute("placeholder"));

        //Поле Сумма

        WebElement elevenPlaceholder = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[4]/div[2]/input"));
        String firstEleven = "Сумма";
        Assert.assertEquals(elevenPlaceholder.getAttribute("placeholder"), firstEleven);
        System.out.println(elevenPlaceholder.getAttribute("placeholder"));

        //Поле e-mail

        WebElement twelwePlaceholder = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[4]/div[3]/input"));
        String firstTwelwe = "E-mail для отправки чека";
        Assert.assertEquals(twelwePlaceholder.getAttribute("placeholder"), firstTwelwe);
        System.out.println(twelwePlaceholder.getAttribute("placeholder"));

        //Задание 2

        driver.findElement(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__form > div.select > div.select__wrapper > button > span.select__arrow > svg")).click();
        driver.findElement(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__form > div.select > div.select__wrapper.opened > ul > li:nth-child(1) > p")).click();

        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[1]/div[1]/input")).sendKeys("297777777");
        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[1]/div[2]/input")).sendKeys("50");
        driver.findElement(By.cssSelector("#connection-email")).sendKeys("my3post@mail.ru");
        driver.findElement(By.cssSelector("#pay-connection > button")).click();

        //driver.switchTo ( ). frame ( "bepaid-iframe" );

        WebElement checkSumUp = driver.findElement(By.className("bepaid-app"));
        String correctSumUp = "50";
        Assert.assertEquals(checkSumUp.getText(), correctSumUp);

        WebElement checkSumpDown = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button/text()"));
        String correctSumDown = "Оплатить  50.00 BYN";
        Assert.assertEquals(checkSumpDown, correctSumDown);

        WebElement checkNumber = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span"));
        String correctNumber = "<Оплата: Услуги связи\n" +
                "Номер:375297777777";
        Assert.assertEquals(checkNumber, correctNumber);


    }
}








