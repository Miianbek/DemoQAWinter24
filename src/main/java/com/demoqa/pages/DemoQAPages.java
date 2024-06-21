package com.demoqa.pages;


import com.demoqa.utils.RandomUtils;

import lombok.*;
import org.testng.annotations.BeforeClass;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder

public class DemoQAPages {


    protected TextBoxPage textBoxPage= new TextBoxPage();
    protected AlertPage alertPage= new AlertPage();
    protected ButtonsPage buttonsPage= new ButtonsPage();
    protected MenuPage menuPage = new MenuPage();
    protected ProgressBarPage progressBarPage= new ProgressBarPage();
    public WebTablePage webTablePage= new WebTablePage();
    public PracticeFormPage practiceFormPage= new PracticeFormPage();




}
