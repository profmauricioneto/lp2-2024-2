package org.unichristus.abstractclass.exemplo03;

public class ProjectManager extends Employee {
    public ProjectManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void increaseSalary() {
        salary += 2000;
    }
}
