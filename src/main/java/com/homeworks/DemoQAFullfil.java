package com.homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoQAFullfil {
    @Test
            void fullfilTextBox() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        WebElement fullName=driver.findElement(By.id("userName"));
        fullName.sendKeys("Miianbek");

        WebElement userEmail=driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("mika@gmail.com");

        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Osh Bishkek 1998");

        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Japan Konoha 13");

        WebElement submit=driver.findElement(By.id("submit"));
        submit.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        String nameOutput = fullName.getAttribute("value");
        String emailOutput = userEmail.getAttribute("value");
        String currentAddressOutput =currentAddress.getAttribute("value");
        String permanentAddressOutput = permanentAddress.getAttribute("value");

        Assert.assertEquals(nameOutput,"Miianbek");
        Assert.assertEquals(emailOutput,"mika@gmail.com");
        Assert.assertEquals(currentAddressOutput,"Osh Bishkek 1998");
        Assert.assertEquals(permanentAddressOutput,"Japan Konoha 13");

        driver.close();

        driver.quit();



    }
}
