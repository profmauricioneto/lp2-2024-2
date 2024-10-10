package org.unichristus.abstractclass.exemplo03;

public class Main {
    public static void main(String[] args) {
        Employee manager = new ProjectManager("fulano", 3000);
        Employee dev = new Development("cicrano", 3000);

        manager.increaseSalary();
        dev.increaseSalary();

        System.out.println("manager: " + manager.salary);
        System.out.println("dev: " + dev.salary);
    }
}
