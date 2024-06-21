package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Food_list {

    @Test
    void findFoodList(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://nambafood.kg/assorti-bukhara-na-mederova");
//        List<WebElement> foodlist=driver.findElements(By.xpath("//div[@class='card--item-info']/div[2]"));
//      foodlist.stream().forEach(food -> System.out.println(food.getText()));
//        System.out.println(foodlist.size());

        List<WebElement> zakuskiList=driver.findElements(By.xpath("//*[@data-item-menu='Закуски']"));
        System.out.println("Закуски:");
        zakuskiList.stream().forEach(food -> System.out.println(food.getAttribute("data-item-name")));
        System.out.println(zakuskiList.size());

        List<WebElement> salatyList=driver.findElements(By.xpath("//*[@data-item-menu=\"Салаты\"]"));
        System.out.println("Салаты:");
        salatyList.stream().forEach(food -> System.out.println(food.getAttribute("data-item-name")));
        System.out.println(salatyList.size());

        List<WebElement> vypechkaList=driver.findElements(By.xpath("//*[@data-item-menu=\"Выпечка\"]"));
        System.out.println("Выпечки:");
        vypechkaList.stream().forEach(food -> System.out.println(food.getAttribute("data-item-name")));
        System.out.println(vypechkaList.size());

        List<WebElement> soupsList=driver.findElements(By.xpath("//*[@data-item-menu=\"Супы\"]"));
        System.out.println("Супы:");
        soupsList.stream().forEach(food -> System.out.println(food.getAttribute("data-item-name")));
        System.out.println(soupsList.size());

    }

}
