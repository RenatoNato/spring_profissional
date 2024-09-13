package com.devsuperior.aula.entities;


public class Employee {

    private String name;
    private double grossSalary;

    public Employee() {

    }

    public Employee(String name, double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public double getGrossSalary() {

        return grossSalary;

    }

    public void setGrossSalary(double grossSalary) {

        this.grossSalary = grossSalary;
    }
}
