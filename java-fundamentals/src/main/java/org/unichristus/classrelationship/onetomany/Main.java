package org.unichristus.classrelationship.onetomany;

public class Main {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Maurício", 123);
        Course algorithms = new Course("algorithms", 1, mauricio);
        Course programming1 = new Course("programming1", 2, mauricio);
        Course oop = new Course("OOP", 3, mauricio);

        mauricio.addCourse(algorithms);
        mauricio.addCourse(programming1);
        mauricio.addCourse(oop);

        mauricio.getAllCourses();

    }
}
