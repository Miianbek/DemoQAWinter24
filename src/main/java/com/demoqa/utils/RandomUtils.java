package com.demoqa.utils;

import com.demoqa.entities.Employee;
import com.demoqa.entities.TextBoxEntity;
import com.github.javafaker.Faker;

public class RandomUtils {
    Faker faker= new Faker();

    public  TextBoxEntity generateRandomTextBoxEntity() {
        TextBoxEntity textBoxEntity = new TextBoxEntity();
        textBoxEntity.setFullName(faker.name().fullName());
        textBoxEntity.setEmail(faker.internet().emailAddress());
        textBoxEntity.setCurrentAddress(faker.address().fullAddress());
        textBoxEntity.setPermanentAddress(faker.address().secondaryAddress());
        return textBoxEntity;

    }

    public Employee createMockEmployee () {
        Employee employee= new Employee();

        employee.setFirstname(faker.name().firstName());
        employee.setLastname(faker.name().lastName());
        employee.setAge(faker.number().numberBetween(18,100));
        employee.setEmail(faker.internet().emailAddress());
        employee.setSalary(faker.number().numberBetween(100001,200000001));
        employee.setDepartment(faker.job().position());

        return employee;
    }

}
