package org.unichristus.designpattern.composite;

public class HumanResourceDepartment implements Department {
    public int id;
    public String name;

    public HumanResourceDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
