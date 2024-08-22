package org.unichristus.classrelationship.manytomany;

public class Main {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio Neto", 1);
        Professor tiago = new Professor("Tiago Sombra", 2);

        Course algoritmos = new Course("Algoritmos 1", 123);
        Course linguagens1 = new Course("Linguagens 1", 321);
        Course linguagens2 = new Course("Linguagens 2", 234);
        Course mobile = new Course("Mobile 1", 543);

        // professor to courses relationship
        mauricio.addCourse(linguagens1);
        mauricio.addCourse(linguagens2);
        tiago.addCourse(algoritmos);
        tiago.addCourse(mobile);

        // courses to professor relationship
        linguagens1.addProfessor(mauricio);
        linguagens2.addProfessor(mauricio);
        algoritmos.addProfessor(tiago);
        algoritmos.addProfessor(mauricio);
        mobile.addProfessor(tiago);

        System.out.println("Mauricio's Course");
        mauricio.showCourses();

        System.out.println("Tiago's Courses");
        tiago.showCourses();

        System.out.println("Algorithms' Professor");
        algoritmos.showProfessors();

    }
}
