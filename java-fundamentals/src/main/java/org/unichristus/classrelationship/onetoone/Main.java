package org.unichristus.classrelationship.onetoone;

public class Main {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio", 1234);
        Course oop = new Course("Oriented Object Programming", 123);

        oop.addProfessor(mauricio);
        System.out.println("Professor: " + oop.getProfessorName());
        mauricio.setCourse(oop);
        System.out.println("Course: " + mauricio.getCourseName());
    }
}
