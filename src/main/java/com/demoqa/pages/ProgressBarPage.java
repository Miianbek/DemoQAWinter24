package com.demoqa.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgressBarPage extends BasePage{
    @FindBy(id = "startStopButton")
    public WebElement startStopButton;

    @FindBy(id = "progressBar")
    public WebElement progressBar;

    @FindBy(xpath = "//div[@aria-valuenow]")
    public WebElement ariaValueNow;

    public void startProgressBar(){
        startStopButton.click();
    }

    @Step("get progress Bar value")
    public int getProgressBarValue () {
        String value= ariaValueNow.getAttribute("aria_valuenow");
        return Integer.parseInt(value);
    }
}
