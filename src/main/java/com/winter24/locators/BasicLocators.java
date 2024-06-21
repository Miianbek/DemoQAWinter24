package com.winter24.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicLocators {
    @Test(description = "Find by ID")
    void findByIDTest () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

//        WebElement fullNameInut= driver.findElement(By.id("userName"));
//        WebElement fullNameInut= driver.findElement(By.tagName("input"));
//        WebElement fullNameInut= driver.findElement(By.className("input"));
//        WebElement fullNameInut= driver.findElement(By.id("input"));
//        WebElement fullNameInut= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[2]/div[2]/input"));
          WebElement fullNameInut= driver.findElement(By.xpath("(//textarea [@class='form-control'])[1]"));
          String permanentAdressTxt= driver.findElement(By.xpath("//label[text()='Permanent Address']")).getText();
        System.out.println(permanentAdressTxt);

//        WebElement homeLink= driver.findElement(By.partialLinkText("Bad"));
//        WebElement homeLink= driver.findElement(By.linkText("Home"));
//        homeLink.click();

//        String textBox= driver.findElement(By.tagName("h1")).getText();
//        System.out.println(textBox);


        fullNameInut.sendKeys("John Doe");
//
//        WebElement emailInput=driver.findElement(By.className("mr-sm-2"));
//        emailInput.sendKeys("johnwick@gmail.com");

        //Home

    }
}
