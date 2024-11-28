package org.unichristus.designpattern.composite;

public class FinancialDepartment implements Department {
    public int id;
    public String description;

    public FinancialDepartment(int id, String description) {
        this.id = id;
        this.description = description;
    }
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
