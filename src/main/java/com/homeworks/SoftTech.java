package com.homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SoftTech {

    @Test
    void orderFood() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://softech.kg/");
        WebElement goFood=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/aside/div/div[2]/div/ul/li[2]/a"));
        goFood.click();
        WebElement goXiaomi=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/ul/li[2]/div/div/a"));
        goXiaomi.click();
        WebElement pjone=driver.findElement(By.xpath("//*[@id=\"products\"]/div[2]/div[1]/div[2]/div[2]/a"));
        pjone.click();
        WebElement buy=driver.findElement(By.xpath("//*[@id=\"product\"]/div[3]/div/div/button[1]"));
        buy.click();
        WebElement name=driver.findElement(By.xpath("//*[@id=\"purchase-form\"]/div[1]/div[1]/input"));
        name.sendKeys("Жаныбек");

        WebElement numberPh=driver.findElement(By.xpath("//*[@id=\"purchase-form\"]/div[1]/div[2]/input"));
        numberPh.sendKeys("0700111080");

        WebElement email1=driver.findElement(By.xpath("//*[@id=\"purchase-form\"]/div[1]/div[3]/input"));
        email1.sendKeys("joni.9813@gmail.com");

        WebElement comments=driver.findElement(By.xpath("//*[@id=\"purchase-form\"]/div[1]/div[4]/textarea"));
        comments.sendKeys("Оплата картой");

        WebElement orderFinish= driver.findElement(By.xpath("//*[@id=\"popup-checkout-button\"]"));
        orderFinish.click();




    }
}
