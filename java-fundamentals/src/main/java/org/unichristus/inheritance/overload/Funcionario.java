package org.unichristus.inheritance.overload;

public class Funcionario {
    private String name;
    private double salary;
    private int id;

    public Funcionario() {
        this.name = "sem nome";
        this.salary = 0.0;
        this.id = 0;
    }

    public Funcionario (String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 0.0;
    }

    public Funcionario (String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void information() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
