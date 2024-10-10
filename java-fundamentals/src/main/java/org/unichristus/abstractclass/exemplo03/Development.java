package org.unichristus.abstractclass.exemplo03;

class Development extends Employee {
    public Development(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void increaseSalary() {
        salary += 4000;
    }
}