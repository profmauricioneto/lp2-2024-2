package org.unichristus.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
    public int id;
    public String description;
    public List<Department> departments;
    public HeadDepartment(int id, String description) {
        this.id = id;
        this.description = description;
        departments = new ArrayList<>();
    }
    public void addDepartment(Department d) {
        departments.add(d);
    }
    public void removeDepartment(Department d) {
        departments.remove(d);
    }
    @Override
    public void printDepartmentName() {
        departments.forEach(Department::printDepartmentName);
    }
}
