package com.winter24.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox {


    @Test
    void textBoxTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        // указываем какой драйвер будем использовать
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize(); // Открывет браузер на полное окно
        driver.get("https://demoqa.com/text-box"); // открывает любой сайт при помощи get
//        Thread.sleep(5000);
        // используется для приостановки выполнения текущего потока на заданный период времени. Время приостановки указывается в миллисекундах

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Miianbek Iliazbek"); // передает значение и вводит

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("miianbek.iliazbek@gmail.com");

        WebElement curAddress = driver.findElement(By.id("currentAddress"));
        curAddress.sendKeys("Florida USA ");

        WebElement perAddress = driver.findElement(By.id("permanentAddress"));
        perAddress.sendKeys("KG Bishkek, Vostok 5");

        WebElement submit1= driver.findElement(By.id("submit"));
        submit1.click();

//        driver.close();
//        driver.quit();
    }

}
