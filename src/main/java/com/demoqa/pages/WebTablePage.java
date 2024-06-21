package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.Employee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WebTablePage extends BasePage {

    @FindBy(id = "addNewRecordButton")
    public WebElement addNewBtn;

    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "age")
    public WebElement ageInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;


    @FindBy(id = "salary")
    public WebElement salaryInput;

    @FindBy(id = "department")
    public WebElement departmentInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;


    public WebTablePage addNewEmployee(Employee employee) {
        webElementActions.click(addNewBtn)
                .sendKeys(firstNameInput,employee.getFirstname())
                .sendKeys(lastNameInput,employee.getLastname())
                .sendKeys(ageInput, String.valueOf(employee.getAge()))
                .sendKeys(userEmailInput,employee.getEmail())
                .sendKeys(salaryInput, String.valueOf(employee.getSalary()))
                .sendKeys(departmentInput,employee.getDepartment())
                .click(submitBtn);
        return this;


    }

    public ArrayList <Employee> getEmployeesFromTable() {
        List<WebElement> rows= DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group")); //10
        ArrayList<Employee> employees= new ArrayList<>();

        for (WebElement row:rows) {
            List<WebElement> cells= row.findElements(By.cssSelector(".rt-td"));

            String firstName=cells.get(0).getText();
            String lastName=cells.get(1).getText();
            String ageText=cells.get(2).getText().trim().replaceAll("^0-9","");
            String userEmail=cells.get(3).getText();
            String salaryText=cells.get(4).getText().trim().replaceAll("^0-9","");
            String department=cells.get(5).getText();

            if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty() || userEmail.isEmpty() ||
            salaryText.isEmpty() || department.isEmpty() ) {
                continue; // пропусти и продожай
            }

            int age = Integer.parseInt(ageText.trim());
            long salary=Long.parseLong(salaryText.trim());

            employees.add(new Employee(firstName,lastName,age,userEmail,salary,department));


        }

        return employees;
    }
}
